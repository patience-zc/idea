package com.zc.xt.day5;

public class Airplane extends Vehicle implements Flyable{
    private String gsName;

    public String getGsName() {
        return gsName;
    }

    public void setGsName(String gsName) {
        this.gsName = gsName;
    }

    @Override
    public void run() {
        System.out.println("飞机启动");
    }

    @Override
    public void fly() {
        System.out.println("飞机在天上飞");
    }
}
