package com.zc.day5.test1;

/**
 * ClassName:Vehicle
 * Package:com.zc.day4.test1
 * Description:
 *
 * @date:2023/7/21 13:41
 * @author:zc
 */
public abstract class Vehicle {
    private float speed;
    private float load;

    public void run(){}

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getLoad() {
        return load;
    }

    public void setLoad(float load) {
        this.load = load;
    }

    public Vehicle(float speed, float load) {
        this.speed = speed;
        this.load = load;
    }

    public Vehicle() {
    }

    public void getName() {
        System.out.println(Vehicle.class.getSimpleName());
    }

}
