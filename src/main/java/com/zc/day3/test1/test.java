package com.zc.day3.test1;

import java.util.Scanner;

/**
 * ClassName:test
 * Package:com.zc.day3.test
 * Description:
 *
 * @date:2023/7/19 14:02
 * @author:zc
 */
public class test {
    public static void main(String[] args) {
        String id, password;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入管理员账号和密码：");
        id = sc.next();
        password = sc.next();
//        System.out.println(id);
//        System.out.println(password);
        if ("admin".equals(id) && "admin".equals(password)) {
            System.out.println("请输入学生账号和身份证号：");
            String name = sc.next();
            String idCard = sc.next();
            student s1 = new student(name, idCard);
//            System.out.println(s1.toString());
            System.out.println("请再次输入学生账号和身份证号：");
            name = sc.next();
            idCard = sc.next();
            student s2 = new student(name, idCard);
//            System.out.println(s2.toString());
            if (s2.equals(s1)) {
                System.out.println("已有该重复数据");
                s2.toString();
            } else System.out.println("添加成功！");
        } else System.out.println("账号或密码错误，请重新登录");
    }
}
