package com.rzk.demo1;

public class Client {
    public static void main(String[]args){
        //需要把房东new出来
        Host host = new Host();
        //把房东拿给代理   让代理直接掉房东的方法
        Proxy proxy = new Proxy(host);
        proxy.rent();
    }
}
