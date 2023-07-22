package com.zc.day5.test1;

/**
 * ClassName:Airplane
 * Package:com.zc.day5.test1
 * Description:
 *
 * @date:2023/7/21 13:50
 * @author:zc
 */
public class Airplane extends Vehicle implements Flyable{

    private String name;

    @Override
    public void fly() {
        System.out.println("飞机能飞");
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "speed=" + super.getSpeed() +
                "load=" + super.getLoad() +
                "weight=" + name +
                '}';
    }

    @Override
    public void run() {
        super.run();
        System.out.println("飞机在飞");

    }

    public Airplane() {
    }

    public Airplane(float speed, float load, String name) {
        super(speed, load);
        this.name = name;
    }
}
