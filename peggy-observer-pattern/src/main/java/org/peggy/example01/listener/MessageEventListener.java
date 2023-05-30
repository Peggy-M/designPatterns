package org.peggy.example01.listener;

import org.peggy.example01.result.LotteryResult;

/**
 * @Projectname: designPatterns
 * @Filename: MessageEventListener
 * @Author: peggy
 * @Data:2023/5/30 20:03
 * @Description: 短信发送事件
 */

public class MessageEventListener implements EventListener{
    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("发送短信通知用户 ID 为:"+result.getuId()+
                "您的摇号结果如下:"+result.getMsg());
    }
}
