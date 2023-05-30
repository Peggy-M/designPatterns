package org.peggy.example01.service;

import org.peggy.example01.result.LotteryResult;

import java.util.Date;

/**
 * @Projectname: designPatterns
 * @Filename: LotteryServiceImpl
 * @Author: peggy
 * @Data:2023/5/30 20:21
 * @Description: 开奖服务
 */

public class LotteryServiceImpl extends LotteryService{

    //注入摇号服务
    private DrawHouseService houseService = new DrawHouseService();
    @Override
    public LotteryResult lottery(String uId) {
        //摇号
        String result = houseService.lots(uId);

        return new LotteryResult(uId,result,new Date());
    }
}
