package com.zc.day3.test1;

/**
 * ClassName:student
 * Package:com.zc.day3.test
 * Description:
 *
 * @date:2023/7/19 14:03
 * @author:zc
 */
public class student {
    private String name;
    private String idCard;

    public student(String name, String idCard) {
        this.name = name;
        this.idCard = idCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "学生" +
                "姓名为：" + name +
                "身份证号为：" + idCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof student)) return false;
        student student = (student) o;
        return this.name.equals(student.getName())&&this.idCard.equals(student.getIdCard());
    }

}
