package com.rzk.dome2;

public class Cilent {
    public static void main(String[] args) {
        Manage manage = new Manage();
        //通过代理去实现看车卖出，但实际上是通过manage去做的
        Proxy proxy = new Proxy(manage);
        proxy.sellcar();
    }
}
