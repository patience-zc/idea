package com.zc.xt.day5;

public class Train extends Vehicle{
    private int jieShu;

    public Train() {
    }

    public Train(int jieShu) {
        this.jieShu = jieShu;
    }


    /**
     * 获取
     * @return jieShu
     */
    public int getJieShu() {
        return jieShu;
    }

    /**
     * 设置
     * @param jieShu
     */
    public void setJieShu(int jieShu) {
        this.jieShu = jieShu;
    }

    @Override
    public void run() {
        System.out.println("火车呜呜呜");
    }
}
