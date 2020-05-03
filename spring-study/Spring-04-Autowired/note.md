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

        byName: 会自动在容器上下文查找，和自己对象set方法后面的值对应的 bean id
        byType: 会自动在容器上下文查找，和自己对象属性类名相同的bean










