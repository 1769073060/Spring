package com.rzk.pojo;

public class User {
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void show(){
        System.out.println("name = " + name);
        System.out.println("address = " + address);
    }

    public User() {
        System.out.println("无参构造");
    }

    public User(String name, String address) {
        this.name = name;
        this.address = address;
    }

}
