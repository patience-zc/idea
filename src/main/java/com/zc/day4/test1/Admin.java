package com.zc.day4.test1;

/**
 * ClassName:Admin
 * Package:com.zc.day4.test1
 * Description:
 *
 * @date:2023/7/20 13:48
 * @author:zc
 */
public class Admin extends User implements IAdverse{

    @Override
    public void adverse(String ad) {
        System.out.printf("我发布了广告" +
                ad+
                "，快来看看吧");
    }

    public Admin() {
    }

    public Admin(String user, String passWord) {
        super(user, passWord);
    }
}
