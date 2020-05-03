package com.rzk.dome2;

import com.sun.org.apache.xalan.internal.xsltc.compiler.util.MatchGenerator;

//代理卖车
public class Proxy  implements sellCar{
    private Manage manage;
    public Proxy(){}
    public Proxy(Manage manage){
        this.manage = manage;
    }


    @Override
    public void sellcar() {
        manage.sellcar();
        seeCar();
        succeedCar();
    }

    public void seeCar(){
        System.out.println("带人看车");
    }

    public void succeedCar(){
        System.out.println("成功卖出一辆车");
    }
}
