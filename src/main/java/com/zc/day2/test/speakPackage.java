package com.zc.day2.test;

/**
 * ClassName:chatterbox
 * Package:com.zc.day2.test
 * Description:
 *
 * @date:2023/7/18 14:14
 * @author:zc
 */
public class speakPackage extends basePackage {
    float duration;
    float number;


    public speakPackage() {
    }

    public speakPackage(int fee, float duration, float number) {
        super(fee);
        this.duration = duration;
        this.number = number;
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


    @Override
    public void optputTechnology() {
        System.out.println("话痨套餐：通话时长为"+this.duration+"分钟/月，" +
                "短信条数是"+this.number+"条/月，月租费是"+this.getFee()+"元/月");
    }
}
