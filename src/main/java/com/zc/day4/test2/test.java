package com.zc.day4.test2;

/**
 * ClassName:test
 * Package:com.zc.day4.test2
 * Description:
 *
 * @date:2023/7/20 14:09
 * @author:zc
 */
public class test {
    public static void main(String[] args) {
        String str = "abc,ddc,ba,bab,ab,bc,abc,aac,b";
        String substr = "abc";
        String string = "asdffdsa";


        Communication.Higher(str);
        Communication.countString(str, substr);
        Communication.symmetry(string);
        Communication.splitString(str,",");
    }
}
