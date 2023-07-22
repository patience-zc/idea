package com.zc.day3.test1;

/**
 * ClassName:admin
 * Package:com.zc.day3.test
 * Description:
 *
 * @date:2023/7/19 13:55
 * @author:zc
 */
public class admin {
    private String id;
    private String password;

    public admin(String id, String password) {
        this.id = id;
        this.password = password;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
