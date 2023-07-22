package com.zc.day5.test1;

import java.util.Scanner;

/**
 * ClassName:Managment
 * Package:com.zc.day5.test1
 * Description:
 *
 * @date:2023/7/21 13:52
 * @author:zc
 */
public class Management {


    public static void main(String[] args) {
        Vehicle[] vehicles = new Vehicle[100];
        int count = 0;
        System.out.println("=====交通工具管理=====");
        System.out.println("=====1、添加火车工具=====");
        System.out.println("=====2、添加船工具=====");
        System.out.println("=====3、添加飞机工具=====");
        System.out.println("=====4、查询展示=====");
        System.out.println("=====5、删除交通工具=====");
        System.out.println("=====0、退出=====");
        System.out.println("请输入编号：");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        while (a != 0) {
            int speed;
            int capablity;
            int length;
            String name;
            int num;
            switch (a) {
                case 1:
                    System.out.println("即将添加火车工具");
                    System.out.println("请输入火车速度：");
                    speed = scanner.nextInt();
                    System.out.println("请输入火车容量：");
                    capablity = scanner.nextInt();
                    System.out.println("请输入火车长度：");
                    length = scanner.nextInt();
                    vehicles[count] = new Train(speed, capablity, length);
                    count++;
                    System.out.println("请输入编号：");
                    a = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("即将添加船工具");
                    System.out.println("请输入船速度：");
                    speed = scanner.nextInt();
                    System.out.println("请输入船容量：");
                    capablity = scanner.nextInt();
                    System.out.println("请输入船吨位：");
                    length = scanner.nextInt();
                    vehicles[count] = new Ship(speed, capablity, length);
                    count++;
                    a = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("即将添加飞机工具");
                    System.out.println("请输入飞机速度：");
                    speed = scanner.nextInt();
                    System.out.println("请输入飞机容量：");
                    capablity = scanner.nextInt();
                    System.out.println("请输入飞机公司名称：");
                    name = scanner.next();
                    vehicles[count] = new Airplane(speed, capablity, name);
                    count++;
                    System.out.println("请输入编号：");
                    a = scanner.nextInt();
                    break;
                case 4:
                    for (int j = 0; j <= count; j++) {
                        vehicles[j].getName();
                    }
                    break;
                case 5:
                    System.out.println("请输入要删除的是第几辆工具：");
                    num = scanner.nextInt();
                    count--;
                    for (int j = num; j <= count; j++) {
                        vehicles[num]=vehicles[num++];
                    }
            }
        }
    }
}
