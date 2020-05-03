package com.rzk.demo1;

public class Proxy implements Rent{
    private Host host;
    //有参
    public Proxy(Host host){
        this.host=host;
    }

    @Override
    public void rent() {
        //代理直接掉host的方法  进行代理
        host.rent();
        seeHouse();
        Money();
    }

    public void seeHouse(){
        System.out.println("看房子");
    }
    public void Money(){
        System.out.println("谈金钱");
    }
}
