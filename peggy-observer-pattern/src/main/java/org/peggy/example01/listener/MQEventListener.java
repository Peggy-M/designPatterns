package org.peggy.example01.listener;

import org.peggy.example01.result.LotteryResult;

/**
 * @Projectname: designPatterns
 * @Filename: MQEventListener
 * @Author: peggy
 * @Data:2023/5/30 20:05
 * @Description: MQ发送消息事件
 */

public class MQEventListener implements EventListener {
    @Override
    public void doEvent(LotteryResult result) {
        System.out.println("记录摇奖号码结果(MQ),用户 ID:"+result.getuId()+
                "摇奖结果:"+result.getMsg());
    }
}
