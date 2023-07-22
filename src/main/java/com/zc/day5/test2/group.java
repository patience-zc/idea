package com.zc.day5.test2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:groupTemp
 * Package:com.zc.day5.test2
 * Description:
 *
 * @date:2023/7/21 14:59
 * @author:zc
 */
public class group extends groupAbstract {
    private int GroupNumMax =100;
    private String announcement;

    @Override
    void groupShow() {
        super.groupShow();
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String GroupDate = df.format(super.getGroupDate());

        System.out.println("群名称:"+super.getGroupName()+
                " 人数:"+super.getGroupNum()+
                " 创建时间:"+GroupDate+
                " 人数上限:"+GroupNumMax+
                " 公告:"+announcement);
    }

    public int getGroupNumMax() {
        return GroupNumMax;
    }

    public void setGroupNumMax(int groupNumMax) {
        GroupNumMax = groupNumMax;
    }

    public String getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(String announcement) {
        this.announcement = announcement;
    }

    public group() {
    }

    public group(String groupName, String groupNum, Date groupDate, int groupNumMax, String announcement) {
        super(groupName, groupNum, groupDate);
        GroupNumMax = groupNumMax;
        this.announcement = announcement;
    }
}
