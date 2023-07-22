package com.zc.day3.test3;

/**
 * ClassName:Banker
 * Package:com.zc.day3.test3
 * Description:
 *
 * @date:2023/7/19 15:35
 * @author:zc
 */
public class Banker extends Person {
    public void invest() {
        System.out.printf("投资者在投资");
    }

    @Override
    public void sleep() {
        System.out.printf("投资者在睡觉");
    }

    @Override
    public void walk() {
        System.out.printf("投资者在走路");
    }
}
