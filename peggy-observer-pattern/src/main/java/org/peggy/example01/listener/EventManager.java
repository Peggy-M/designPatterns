package org.peggy.example01.listener;

import org.peggy.example01.result.LotteryResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Projectname: designPatterns
 * @Filename: EventManager
 * @Author: peggy
 * @Data:2023/5/30 20:07
 * @Description: 事件处理类
 */

public class EventManager {
    public enum EventType{
        MQ,Message;
    }

    //监听器集合
    Map<Enum<EventType>, List<EventListener>> listeners=new HashMap<>();

    public EventManager(Enum<EventType>...operations) {
        for (Enum<EventType> operation : operations) {
            this.listeners.put(operation,new ArrayList<>());
        }
    }

    /**
     * 订阅
     * @param eventType 事件类型
     * @param listener 监听
     */
    public void subscribe(Enum<EventType> eventType,EventListener listener){
        List<EventListener> users=listeners.get(eventType);
        users.add(listener);
    }

    /**
     * 取消订阅
     * @param eventType 事件类型
     * @param listener 监听
     */
    public void unsubscribe(Enum<EventType> eventType,EventListener listener){
        List<EventListener> users=listeners.get(eventType);
        users.remove(listener);
    }

    /**
     * 通知
     * @param eventType 事件类型
     * @param result 结果
     */
    public void notify(Enum<EventType> eventType, LotteryResult result) {
        List<EventListener> users = listeners.get(eventType);
        for (EventListener listener : users) {
            listener.doEvent(result);
        }
    }
}
