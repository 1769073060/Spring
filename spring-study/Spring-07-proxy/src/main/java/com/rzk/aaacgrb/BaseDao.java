package com.rzk.aaacgrb;

import javax.management.openmbean.OpenMBeanConstructorInfo;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.*;

/**
 * dao工具类
 * 这个类封装的方法：
 * 1.获取数据库连接 的方法
 * 2.关闭连接，释放资源的方法
 * 3.设置参数的方法
 * 4.增删改的方法
 * 5.查询的方法
 */
public class BaseDao {
    static {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    private static String driver;
    private static String url;
    private static String username;
    private static String password;

    //静态代码块，类加载时候就初始化了
    static {
        Properties properties = new Properties();
        //通过类加载器读取对应的资源
        InputStream is = BaseDao.class.getClassLoader().getResourceAsStream("db.properties");
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        url = properties.getProperty("url");
        username = properties.getProperty("username");
        password = properties.getProperty("password");

    }

    //获取数据库的连接
    private  Connection getConnection() throws SQLException {
        Connection conn = null;
        try {

            conn = DriverManager.getConnection(url, username, password);
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private  void setParams(PreparedStatement pstmt, Object[] params) throws SQLException {

        for (int i = 0; i < params.length; i++) {
            pstmt.setObject(i + 1, params[i]);
        }
    }

    //编写公共类
    public  ResultSet execute(Connection conn, PreparedStatement pstmt, ResultSet rs, String sql, Object[] params) throws SQLException {
        pstmt = conn.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            pstmt.setObject(i + 1, params[i]);
        }
        rs = pstmt.executeQuery();
        return rs;
    }

    /**
     * @param sql
     * @param params
     * @return
     */
    //编写公共类的增删改
    public  Integer execute(Connection conn, String sql, Object[] params, PreparedStatement pstmt) throws SQLException {
        //預編譯的sql後面直接執行就可以了
        pstmt = conn.prepareStatement(sql);
        for (int i = 0; i < params.length; i++) {
            pstmt.setObject(i + 1, params[i]);
        }
        int updateRows = pstmt.executeUpdate();
        return updateRows;
    }

    /**
     * @param sql
     * @param params
     * @return
     */
    public  Integer executeUpdate(Connection conn, String sql, Object[] params, PreparedStatement pstmt) {
        try {
            //连接数据库
            conn = getConnection();
            //创建预处理命令
            pstmt = conn.prepareStatement(sql);
            //为预处理命令传递参数
            setParams(pstmt, params);
            //执行增删改
            Integer count = pstmt.executeUpdate();
            return count;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Close(conn, pstmt, null);
        }
        return null;
    }

    public  List<Map<String, Object>> executeQuery(Connection conn, String sql, Object[] params, PreparedStatement pstmt) {
        List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
        ResultSet rs = null;
        try {
            //连接数据库
            conn = getConnection();
            //创建预处理命令
            pstmt = conn.prepareStatement(sql);
            //为预处理命令设置参数
            setParams(pstmt, params);
            //执行查询
            rs = pstmt.executeQuery();
            //获取元数据
            ResultSetMetaData metaData = rs.getMetaData();
            //获取返回的结果集有多少列
            Integer columnCount = metaData.getColumnCount();
            while (rs.next()) {
                //声明map  存储一行的数据
                Map<String, Object> map = new HashMap<String, Object>();
                for (int i = 0; i < columnCount; i++) {
                    //获取列名 列名的下标从1 开始
                    String columnName = metaData.getColumnName(i + 1);
                    // 获取该列的值
                    Object value = rs.getObject(columnName);
                    //把该行每一列的值放置到map中，其中key是列名 value是该列对应的值
                    map.put(columnName, columnName);
                }
                mapList.add(map);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Close(conn, pstmt, rs);
        }
        return mapList;
    }


    //释放资源
    public  boolean Close(Connection conn, PreparedStatement pstmt, ResultSet rs) {
        boolean flag = true;
        if (rs != null) {
            try {
                rs.close();
                rs = null;
            } catch (SQLException e) {
                e.printStackTrace();
                flag = false;
            }
        }
        if (pstmt != null) {
            try {
                pstmt.close();
                pstmt = null;
            } catch (SQLException e) {
                e.printStackTrace();
                flag = false;
            }
        }
        if (conn != null) {
            try {
                conn.close();
                conn = null;
            } catch (SQLException e) {
                e.printStackTrace();
                flag = false;
            }
        }
        return flag;
    }
}
