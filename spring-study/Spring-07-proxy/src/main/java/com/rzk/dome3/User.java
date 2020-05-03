package com.rzk.dome3;
public class User {
    private Integer id;//id
    private String userCode;//用户编码
    private String userName;//用户名称
    private String userPassword;//用户密码
    private int gerder;//性别
    private String phone;//电话
    private String address;//地址
    private Integer age;//年龄
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserCode() {
        return userCode;
    }
    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public int getGerder() {
        return gerder;
    }
    public void setGerder(int gerder) {
        this.gerder = gerder;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userCode='" + userCode + '\'' +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", gerder=" + gerder +
                ", phone='" + phone + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }

    public User(Integer id, String userCode, String userName) {
        this.id = id;
        this.userCode = userCode;
        this.userName = userName;

    }
    public User() {
    }
}