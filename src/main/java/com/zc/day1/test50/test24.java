package com.zc.day1.test50;

import java.util.*;

/**
 * ClassName:test24
 * Package:com.zc.test50
 * Description:
 *
 * @date:2023/7/17 17:08
 * @author:zc
 */
public class test24 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("请输入一个正整数");
        long l = scanner.nextLong();
        String ss = Long.toString(l);
        char[] ch = ss.toCharArray();
        int j = ch.length;
        System.out.println(ss.length());
    }
}
