package org.peggy;

import org.junit.Test;
import org.peggy.example01.result.LotteryResult;
import org.peggy.example01.service.LotteryService;
import org.peggy.example01.service.LotteryServiceImpl;

/**
 * @Projectname: designPatterns
 * @Filename: Test
 * @Author: peggy
 * @Data:2023/5/30 20:24
 * @Description: TODO
 */

public class MyTest {
    @Test
    public void test2(){
        LotteryService ls = new LotteryServiceImpl();
        LotteryResult result = ls.lotteryAndMsg("1234567887654322");
        System.out.println(result);
    }
}
