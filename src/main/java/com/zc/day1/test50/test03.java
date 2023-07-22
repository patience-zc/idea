package com.zc.day1.test50;

/**
 * ClassName:test03
 * Package:com.zc.test50
 * Description:
 *
 * @date:2023/7/17 14:43
 * @author:zc
 */
public class test03 {
    public static boolean IsShuiXianHua(int i) {
        int x1 = i % 10, x2 = i % 100 / 10, x3 = i % 1000 / 100;
        if (x1 * x1 * x1 + x2 * x2 * x2 + x3 * x3 * x3 == i)
            return true;
        else return false;
    }

    public static void main(String[] args) {
        for (int i = 100; i < 1000; i++) {
            if (IsShuiXianHua(i))
                System.out.println(i + "是水仙花数");
        }
    }
}
