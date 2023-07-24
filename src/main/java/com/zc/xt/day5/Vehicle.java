package com.zc.xt.day5;

public abstract class Vehicle {
    private String name;
    private String speed;
    private int load;

    public Vehicle() {
    }

    public Vehicle(String name, String speed, int load) {
        this.name = name;
        this.speed = speed;
        this.load = load;
    }


    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return speed
     */
    public String getSpeed() {
        return speed;
    }

    /**
     * 设置
     * @param speed
     */
    public void setSpeed(String speed) {
        this.speed = speed;
    }

    /**
     * 获取
     * @return load
     */
    public int getLoad() {
        return load;
    }

    /**
     * 设置
     * @param load
     */
    public void setLoad(int load) {
        this.load = load;
    }

    public abstract void run();
}
