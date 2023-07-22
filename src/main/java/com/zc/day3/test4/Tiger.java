package com.zc.day3.test4;

/**
 * ClassName:Tiger
 * Package:com.zc.day3.test4
 * Description:
 *
 * @date:2023/7/19 15:47
 * @author:zc
 */
public class Tiger extends Carnivore{
    public Tiger() {
    }

    public Tiger(int age, int numOfLegs) {
        super(age, numOfLegs);
    }

    @Override
    void eat() {
        System.out.printf("年龄为"+super.getAge()+"的"+super.getNumOfLegs()+"条腿的老虎在吃羊");
    }
}
