package com.zc.day5.test2;

import java.util.Date;

/**
 * ClassName:group
 * Package:com.zc.day5.test2
 * Description:
 *
 * @date:2023/7/21 14:55
 * @author:zc
 */
public abstract class groupAbstract {
    private String groupName;
    private String groupNum;
    private Date groupDate =  new Date();

    void groupShow(){}

    public groupAbstract(String groupName, String groupNum, Date groupDate) {
        this.groupName = groupName;
        this.groupNum = groupNum;
        this.groupDate = groupDate;
    }

    public groupAbstract() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }

    public Date getGroupDate() {
        return groupDate;
    }

    public void setGroupDate(Date groupDate) {
        this.groupDate = groupDate;
    }
}
