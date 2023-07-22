package com.zc.day2.test;

/**
 * ClassName:addiction
 * Package:com.zc.day2.test
 * Description:
 *
 * @date:2023/7/18 14:07
 * @author:zc
 */
public class netPackage extends basePackage {
    float flow;

    public netPackage() {
    }

    public netPackage(int fee, float flow) {
        super(fee);
        this.flow = flow;
    }

    public float getFlow() {
        return flow;
    }

    public void setFlow(float flow) {
        this.flow = flow;
    }

    @Override
    public void optputTechnology() {

        System.out.println("网虫套餐：上网流量是"+this.flow+"GB/月，月租费是"+this.getFee()+"元/月");
    }

}
