package com.zc.day3.test4;

/**
 * ClassName:Pecker
 * Package:com.zc.day3.test4
 * Description:
 *
 * @date:2023/7/19 15:49
 * @author:zc
 */
public class Pecker extends Carnivore{
    public Pecker() {
    }

    public Pecker(int age, int numOfLegs) {
        super(age, numOfLegs);
    }

    @Override
    void eat() {
        super.eat();
        System.out.printf("年龄为"+super.getAge()+"的"+super.getNumOfLegs()+"条腿的啄木鸟在吃虫子");
    }
}
