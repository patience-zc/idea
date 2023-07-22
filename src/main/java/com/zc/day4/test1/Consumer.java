package com.zc.day4.test1;

/**
 * ClassName:Consumer
 * Package:com.zc.day4.test1
 * Description:
 *
 * @date:2023/7/20 13:49
 * @author:zc
 */
public class Consumer extends User implements IBuy{
    @Override
    public void buy(String goods) {
        System.out.print("我购买了商品！");
    }

    public Consumer() {
    }

    public Consumer(String user, String passWord) {
        super(user, passWord);
    }
}
