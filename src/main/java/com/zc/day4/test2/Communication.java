package com.zc.day4.test2;

/**
 * ClassName:Communication
 * Package:com.zc.day4.test2
 * Description:
 *
 * @date:2023/7/20 14:08
 * @author:zc
 */
public class Communication {
    public static void Higher(String s) {
        System.out.println(s.toUpperCase());
    }

    public static void countString(String str, String substr) {
        int count = 0;
        for (int i = 0; i < str.length() + 1 - substr.length(); i++) {
            if (str.startsWith(substr, i)) {
                count++;
            }
        }
        System.out.println(count);
    }

    public static void symmetry(String str) {
        char[] chars = str.toCharArray();
        boolean flag = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (chars[i] != chars[str.length() - i - 1]) {
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println(str + "是回文");
        } else System.out.println(str + "不是回文");
    }

    public static void splitString(String str, String s) {
        String[] strings = str.split(s);
        for (int i = 0; i<strings.length; i++) {
            System.out.printf(strings[i] + " ");
        }
    }
}
