### 配置文件
```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:context="http://www.springframework.org/schema/context"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
        https://www.springframework.org/schema/beans/spring-beans.xsd
        http://www.springframework.org/schema/context
        https://www.springframework.org/schema/context/spring-context.xsd
        http://www.springframework.org/schema/aop
        https://www.springframework.org/schema/aop/spring-aop.xsd">
</beans>
``` 

## 常用依赖
```xml
        <!---->
        <dependencies>
            <!-- https://mvnrepository.com/artifact/org.springframework/spring-webmvc -->
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-webmvc</artifactId>
                <version>5.2.0.RELEASE</version>
            </dependency>
            <!-- https://mvnrepository.com/artifact/org.springframework/spring-jdbc -->
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-jdbc</artifactId>
                <version>5.2.0.RELEASE</version>
            </dependency>
            <!--测试-->
            <dependency>
                <groupId>junit</groupId>
                <artifactId>junit</artifactId>
                <version>4.12</version>
                <scope>test</scope>
            </dependency>
        </dependencies>
```

##  注解说明
- @Autowired ：自动转配通过类型，名字
    如果Autowired不能通过唯一自动装配上属性，则需要通过  @Qualifier(value = "xxx")
- @Nullable 字段标记这个注解，说明这个字段可以为null
- @Resource:自动装配通过名字，类型
- @Component:组件，放在类上，说明这个类被Spring管理了     -- 注册bean使用这个
- @Value:注入值

        byName: 会自动在容器上下文查找，和自己对象set方法后面的值对应的 bean id
        byType: 会自动在容器上下文查找，和自己对象属性类名相同的bean
```xml

    <!--指定要扫描的包，这个包的注解就会生效-->
    <context:component-scan base-package="com.rzk.pojo"/>
```

### 实现aop需要导入这个
```xml
    <dependencies>
        <dependency>
            <groupId>org.aspectj</groupId>
            <artifactId>aspectjweaver</artifactId>
            <version>1.9.4</version>
        </dependency>
        <dependency>
            <groupId>org.springframework</groupId>
            <artifactId>spring-aop</artifactId>
            <version>5.0.0.RELEASE</version>
            <scope>compile</scope>
        </dependency>
    </dependencies>
```