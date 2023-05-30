package org.peggy.example01.service;

import org.peggy.example01.listener.EventManager;
import org.peggy.example01.listener.MQEventListener;
import org.peggy.example01.listener.MessageEventListener;
import org.peggy.example01.result.LotteryResult;

/**
 * @Projectname: designPatterns
 * @Filename: LotteryService
 * @Author: peggy
 * @Data:2023/5/30 20:19
 * @Description: 摇号的业务处理
 */

public abstract class LotteryService {
    private EventManager eventManager;
    public LotteryService(){
        //设置事件类型
        eventManager = new EventManager(EventManager.EventType.MQ,EventManager.EventType.Message);
        //订阅
        eventManager.subscribe(EventManager.EventType.Message,new MessageEventListener());
        eventManager.subscribe(EventManager.EventType.MQ,new MQEventListener());
    }
    public LotteryResult lotteryAndMsg(String uId){
        LotteryResult result = lottery(uId);
        //发送通知
        eventManager.notify(EventManager.EventType.Message,result);
        eventManager.notify(EventManager.EventType.MQ,result);
        return result;
    }
    public abstract LotteryResult lottery(String uId);
}
