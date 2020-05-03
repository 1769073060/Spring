package com.rzk.pojo;

public class Hello {
    private String hello;

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "hello='" + hello + '\'' +
                '}';
    }
}
