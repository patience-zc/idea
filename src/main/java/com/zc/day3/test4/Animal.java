package com.zc.day3.test4;

/**
 * ClassName:Animal
 * Package:com.zc.day3.test4
 * Description:
 *
 * @date:2023/7/19 15:44
 * @author:zc
 */
public class Animal {
    private int age;
    private int numOfLegs;

    public Animal() {
    }

    public Animal(int age, int numOfLegs) {
        this.age = age;
        this.numOfLegs = numOfLegs;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    void eat(){

    }
}
