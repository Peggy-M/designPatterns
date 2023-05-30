package org.peggy.example01.listener;

import org.peggy.example01.result.LotteryResult;

/**
 * @Projectname: designPatterns
 * @Filename: EventListener
 * @Author: peggy
 * @Data:2023/5/30 19:58
 * @Description: 事件监听接口
 */

public interface EventListener {
    void doEvent(LotteryResult result);
}
