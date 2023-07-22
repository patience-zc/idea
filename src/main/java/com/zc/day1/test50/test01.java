package com.zc.day1.test50;

/**
 * ClassName:test01
 * Package:com.zc.test50
 * Description:
 *
 * @date:2023/7/17 13:59
 * @author:zc
 */
public class test01 {
    public static void main(String[] args) {
        System.out.println("第1个月的兔子数量为：2");
        System.out.println("第2个月的兔子数量为：2");
        int f1 = 1,f2 = 1,f;
        int M=24;
        for (int i=3;i<=M;i++){
            f = f2;
            f2 = f2 +f1;
            f1 = f;
            System.out.println("第"+i+"个月的兔子数量为："+f2*2);
        }
    }
}
