package org.peggy.example01.result;

import java.util.Date;

/**
 * @Projectname: designPatterns
 * @Filename: LotteryResult
 * @Author: peggy
 * @Data:2023/5/30 20:00
 * @Description: 彩票信息
 */
public class LotteryResult {
    //用户 ID
    private String uId;
    //摇号信息
    private String msg;
    //业务时间
    private Date dateTime;

    public LotteryResult() {
    }

    public LotteryResult(String uId, String msg, Date dateTime) {
        this.uId = uId;
        this.msg = msg;
        this.dateTime = dateTime;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }
}
