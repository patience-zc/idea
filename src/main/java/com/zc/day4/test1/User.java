package com.zc.day4.test1;

/**
 * ClassName:User
 * Package:com.zc.day4.test1
 * Description:
 *
 * @date:2023/7/20 13:44
 * @author:zc
 */
public abstract class User {
    private String User;
    private String PassWord;

    public User() {
    }

    public User(String user, String passWord) {
        User = user;
        PassWord = passWord;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getPassWord() {
        return PassWord;
    }

    public void setPassWord(String passWord) {
        PassWord = passWord;
    }
}
