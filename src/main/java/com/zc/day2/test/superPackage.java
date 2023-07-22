package com.zc.day2.test;

/**
 * ClassName:superman
 * Package:com.zc.day2.test
 * Description:
 *
 * @date:2023/7/18 14:26
 * @author:zc
 */
public class superPackage extends basePackage {
    float duration;
    float number;
    float flow;

    public superPackage() {
    }

    public superPackage(int fee, float duration, float number, float flow) {
        super(fee);
        this.duration = duration;
        this.number = number;
        this.flow = flow;

    }

    public float getDuration() {
        return duration;
    }

    public void setDuration(float duration) {
        this.duration = duration;
    }

    public float getNumber() {
        return number;
    }

    public void setNumber(float number) {
        this.number = number;
    }

    public float getFlow() {
        return flow;
    }

    public void setFlow(float flow) {
        this.flow = flow;
    }


    @Override
    public void optputTechnology() {
        System.out.println("超人套餐：通话时长为"+this.duration+"分钟/月，" +
                "短信条数是"+this.number+"条/月，上网流量是"+this.flow+"GB/月，月租费是"+this.getFee()+"元/月");
    }
}
