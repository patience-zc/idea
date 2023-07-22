package com.zc.day3.test3;

/**
 * ClassName:tst
 * Package:com.zc.day3.test3
 * Description:
 *
 * @date:2023/7/19 15:37
 * @author:zc
 */
public class test {
    public static void main(String[] args) {
        Person person = new Person();
        Person banker = new Banker();
        person.sleep();
        person.walk();
        banker.eat();
        banker.walk();
        banker.sleep();
    }
}
