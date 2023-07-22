package com.zc.day1.test50;

import java.util.Scanner;

/**
 * ClassName:test04
 * Package:com.zc.test50
 * Description:
 *
 * @date:2023/7/17 14:54
 * @author:zc
 */
public class test04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个正整数：");
        int n = scanner.nextInt();

        int k = 2;
        System.out.printf(n + " = ");
        while (k <= n) {
            if (k == n) {
                System.out.println(n);
                break;

            } else if (n % k == 0) {
                System.out.printf(k + "*");
                n /= k;
            } else k++;
        }
    }
}
