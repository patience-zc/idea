package com.zc.day5.test2;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName:group
 * Package:com.zc.day5.test2
 * Description:
 *
 * @date:2023/7/21 14:59
 * @author:zc
 */
public class groupTemp extends groupAbstract {
    Date groupDateLatest;

    public groupTemp() {
    }

    public groupTemp(String groupName, String groupNum, Date groupDate, Date groupDateLatest) {
        super(groupName, groupNum, groupDate);
        this.groupDateLatest = groupDateLatest;
    }

    public Date getGroupDateLatest() {
        return groupDateLatest;
    }

    public void setGroupDateLatest(Date groupDateLatest) {
        this.groupDateLatest = groupDateLatest;
    }

    @Override
    void groupShow() {
        super.groupShow();
        DateFormat df = new SimpleDateFormat("yyyy年MM月dd日");
        String GroupDate = df.format(super.getGroupDate());

        System.out.println("群名称:"+super.getGroupName()+
                " 人数:"+super.getGroupNum()+
                " 创建时间:"+GroupDate+
                " 最后发言时间:"+df.format(groupDateLatest));
    }
}
