package com.zc.day2.test;

/**
 * ClassName:test
 * Package:com.zc.day2.test
 * Description:
 *
 * @date:2023/7/18 14:29
 * @author:zc
 */
public class test {
    public static void main(String[] args) {

        basePackage a = new netPackage(68, 3F);
        basePackage c = new speakPackage(58, 500F, 30F);
        basePackage s = new superPackage(78,200F,50F,1F);
        a.optputTechnology();
        c.optputTechnology();
        s.optputTechnology();
    }
}
