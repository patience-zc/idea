package com.zc.day1.test50;


import static java.lang.Math.sqrt;

/**
 * ClassName:test02
 * Package:com.zc.test50
 * Description:
 *
 * @date:2023/7/17 14:27
 * @author:zc
 */
public class test02 {
    public static boolean IsPrimeNum(int i) {
        boolean b = true;
        for (int x = 2; x <= sqrt(i); x++) {
            if (i % x == 0) {
                b = false;
                break;
            }
        }
        return b;
    }

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 101; i <= 200; i++) {
            if (IsPrimeNum(i)) {
                System.out.println(i + "是素数");
                sum++;
            }

        }
    }
}
