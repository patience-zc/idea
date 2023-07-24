package com.zc.xt.day5;

public class Ship extends Vehicle{
    private double dunWei;

    public double getDunWei() {
        return dunWei;
    }

    public void setDunWei(double dunWei) {
        this.dunWei = dunWei;
    }

    @Override
    public void run() {
        System.out.println("船在行驶");
    }
}
