package com.zc.day5.test1;

/**
 * ClassName:Train
 * Package:com.zc.day4.test1
 * Description:
 *
 * @date:2023/7/21 13:43
 * @author:zc
 */
public class Train extends Vehicle {
    private int length;

    @Override
    public void run() {
        super.run();
        System.out.println("火车在行驶");
    }

    public Train() {
    }

    public Train(float speed, float load, int length) {
        super(speed, load);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Train{" +
                "speed=" + super.getSpeed() +
                "load=" + super.getLoad() +
                "length=" + length +
                '}';
    }
}
