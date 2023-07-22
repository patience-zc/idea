package com.zc.day5.test2;

import java.util.Date;
import java.util.Scanner;

/**
 * ClassName:management
 * Package:com.zc.day5.test2
 * Description:
 *
 * @date:2023/7/21 15:16
 * @author:zc
 */
public class management {
    public <T> int countAndShow(T[] group) {
        int count = 0;
        for (int i = 0; group[i]!=null; i++) {
            count++;
        }
        return count;
    }

    groupTemp[] groupTemps = new groupTemp[100];
    group[] group = new group[100];

    public static void main(String[] args) {
        System.out.println("****************************************");
        System.out.println("1.查看全部组信息 2.添加组 3.修改组名 4.模糊查找 5.删除组 6.退出");
        System.out.println("****************************************");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        management management = new management();
        while (a != 0) {
            switch (a) {
                case 1:
                    System.out.println("当前共有" + management.countAndShow(management.group) +
                            "个组群，以及" + management.countAndShow(management.groupTemps) + "个临时群");
                    System.out.println("请输入选项：");
                    a = scanner.nextInt();
                    break;
                case 2:
                    int grouptype;
                    int length = 0;
                    System.out.println("请输入要添加的组的种类（1：临时组 2：群组）：");
                    grouptype = scanner.nextInt();
                    switch (grouptype) {
                        case 1:
                            length = management.countAndShow(management.groupTemps);
                            System.out.println("请输入要添加的组的组名：");
                            String setGroupTempName = scanner.next();
                            System.out.println("请输入要组的人数：");
                            String setGroupTempNum = scanner.next();
                            management.groupTemps[length] = new groupTemp(setGroupTempName,setGroupTempNum,new Date(),new Date());
                            break;
                        case 2:
                            length = management.countAndShow(management.group);
                            System.out.println("请输入要添加的组的组名：");
                            String setGroupName = scanner.next();
                            System.out.println("请输入要组的人数：");
                            String setGroupNum = scanner.next();
                            System.out.println("请输入要组的公告：");
                            String setGroupAnnouncement = scanner.next();
                            management.group[length] = new group(setGroupName,setGroupNum,new Date(),100,setGroupAnnouncement);
                            break;
                    }
                    System.out.println("请输入选项：");
                    a = scanner.nextInt();
                    break;
                case 3:
                    System.out.println("请输入要修改的组的组名：");
                    String s_update = scanner.next();
                    for (int i = 0; i < management.countAndShow(management.group); i++) {
                        if (s_update.equals(management.group[i].getGroupName()))
                            management.group[i].setGroupName(s_update);
                    }
                    for (int i = 0; i < management.countAndShow(management.groupTemps); i++) {
                        if (s_update.equals(management.groupTemps[i].getGroupName()))
                            management.groupTemps[i].setGroupName(s_update);
                    }
                    System.out.println("请输入选项：");
                    a = scanner.nextInt();
                    break;
                case 4:
                    System.out.println("请输入要查找的组的组名：");
                    String s_search = scanner.next();
                    for (int i = 0; i < management.countAndShow(management.group); i++) {
                        if (s_search.equals(management.group[i].getGroupName()))
                            management.group[i].toString();
                    }
                    for (int i = 0; i < management.countAndShow(management.groupTemps); i++) {
                        if (s_search.equals(management.groupTemps[i].getGroupName()))
                            management.groupTemps[i].toString();
                    }
                    System.out.println("请输入选项：");
                    a = scanner.nextInt();
                    break;
                case 5:
                    System.out.println("请输入要删除的组的组名：");
                    String s_delete = scanner.next();
                    for (int i = 0; i < management.countAndShow(management.group); i++) {
                        if (s_delete.equals(management.group[i].getGroupName())) {
                            for (int j = i; j < management.countAndShow(management.group) - 2; j++)
                                management.group[j] = management.group[j + 1];
                        }
                    }
                    for (int i = 0; i < management.countAndShow(management.groupTemps); i++) {
                        if (s_delete.equals(management.groupTemps[i].getGroupName()))
                            for (int j = i; j < management.countAndShow(management.groupTemps) - 2; j++)
                                management.group[j] = management.group[j + 1];
                    }
                    System.out.println("请输入选项：");
                    a = scanner.nextInt();
                    break;
            }
        }
    }
}
