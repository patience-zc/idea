package com.zc.day5.test1;

/**
 * ClassName:Ship
 * Package:com.zc.day5.test1
 * Description:
 *
 * @date:2023/7/21 13:48
 * @author:zc
 */
public class Ship extends Vehicle{
    private float weight;

    @Override
    public void run() {
        super.run();
        System.out.println("船在行驶");
    }

    public Ship() {
    }

    public Ship(float speed, float load, float weight) {
        super(speed, load);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Ship{" +
                "speed=" + super.getSpeed() +
                "load=" + super.getLoad() +
                "weight=" + weight +
                '}';
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
}
