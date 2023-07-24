package com.zc.xt.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        ArrayList<Vehicle> list = new ArrayList<Vehicle>();
        while(true){
            System.out.println("=====交通工具管理=======");
            System.out.println("1.添加火车");
            System.out.println("2.添加船");
            System.out.println("3.添飞机");
            System.out.println("4.查询展示");
            System.out.println("5.删除交通工具");
            System.out.println("6.退出");
            Scanner sc = new Scanner(System.in);
            String chose = sc.next();
            switch (chose){
                case "1":addTrain(list);break;
                case "2":addShip(list);break;
                case "3":addAirplane(list);break;
                case "4":queryVehicle(list);break;
                case "5":deleteVehicle(list);break;
                case "6":System.exit(0);
                default:
                    System.out.println("没有这个选项");break;
            }
        }
    }

    private static void deleteVehicle(ArrayList<Vehicle> list) {
        Scanner sc =new Scanner(System.in);

            System.out.println("输入想要删除的名称");
            String name = sc.next();
            int index=getIndex(list,name);
            if(index>=0){
                list.remove(index);
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }

    }

    private static int getIndex(ArrayList<Vehicle> list, String name) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    private static void queryVehicle(ArrayList<Vehicle> list) {
        if(list.size()==0){
            System.out.println("无信息，请添加");
            return;
        }

        System.out.println("类型\t特有属性\t容量\t速度");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof Train){
                System.out.println(list.get(i).getName()+"\t\t"+((Train) list.get(i)).getJieShu()+"\t\t"+list.get(i).getLoad()+"\t\t"+list.get(i).getSpeed());
                list.get(i).run();
            }
            if (list.get(i) instanceof Ship){
                System.out.println(list.get(i).getName()+"\t\t"+((Ship) list.get(i)).getDunWei()+"\t\t"+list.get(i).getLoad()+"\t\t"+list.get(i).getSpeed());
                list.get(i).run();
            }
            if (list.get(i) instanceof Airplane){
                System.out.println(list.get(i).getName()+"\t\t"+((Airplane) list.get(i)).getGsName()+"\t\t"+list.get(i).getLoad()+"\t\t"+list.get(i).getSpeed());
                list.get(i).run();
                ((Airplane) list.get(i)).fly();
            }
        }
    }

    //添加飞机
    private static void addAirplane(ArrayList<Vehicle> list) {
        Airplane air = new Airplane();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入飞机的名称");
            String airName = sc.next();
            boolean flag = contains(list, airName);
            if (flag) {
                System.out.println("飞机已经存在重新输入");
            } else {
                air.setName(airName);
                break;
            }
        }
        System.out.println("输入飞机公司名");
        String gsName = sc.next();
        air.setGsName(gsName);

        System.out.println("输入飞机的容量");
        int load = sc.nextInt();
        air.setLoad(load);

        System.out.println("输入飞机的速度");
        String speed = sc.next();
        air.setSpeed(speed);

        list.add(air);
    }

    //添加船
    private static void addShip(ArrayList<Vehicle> list) {
        Ship ship = new Ship();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入船的名称");
            String shipName = sc.next();
            boolean flag = contains(list, shipName);
            if (flag) {
                System.out.println("船已经存在重新输入");
            } else {
                ship.setName(shipName);
                break;
            }
        }
        System.out.println("输入船的吨位");
        double dunWei = sc.nextDouble();
        ship.setDunWei(dunWei);

        System.out.println("输入船的容量");
        int load = sc.nextInt();
        ship.setLoad(load);

        System.out.println("输入船的速度");
        String speed = sc.next();
        ship.setSpeed(speed);

        list.add(ship);
    }

    //添加火车
    private static void addTrain(ArrayList<Vehicle> list) {
        Train train =new Train();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("请输入火车的名称");
            String trainName = sc.next();
            boolean flag = contains(list, trainName);
            if (flag) {
                System.out.println("火车已经存在重新输入");
            } else {
                train.setName(trainName);
                break;
            }
         }
            System.out.println("输入火车的节数");
            int jieShu = sc.nextInt();
            train.setJieShu(jieShu);

            System.out.println("输入火车的容量");
            int load = sc.nextInt();
            train.setLoad(load);

            System.out.println("输入火车的速度");
            String speed = sc.next();
            train.setSpeed(speed);

            list.add(train);


    }

    private static boolean contains(ArrayList<Vehicle> list, String trainName) {
        for (int i = 0; i < list.size(); i++) {
            Vehicle train = list.get(i);
            if(train.getName().equals(trainName)){
                return true;
            }
        }
        return false;
    }

}
