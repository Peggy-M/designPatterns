package com.peggy.flyweight.example01;

import java.util.HashMap;
import java.util.Map;

/**
 * @Projectname: designPatterns
 * @Filename: BigCharFactory
 * @Author: peggy
 * @Data:2023/5/25 14:48
 * @Description: 生成  BigChar 实例的工厂 实现其共享功能
 */

public class BigCharFactory {

    //管理已经生成的 BigChar 实例
    private Map<String, BigChar> pool = new HashMap<>();
    //单利模式,其保证只有一个工厂对象
    /*!标注[1]*/
    private static BigCharFactory singleton = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getSingleton() {
       return singleton;
    }

    //生成共享 BigChar 唯一对象
    /*!标注[2]*/
    public synchronized  BigChar getBigChar(char charname) {
        BigChar bc = pool.get(String.valueOf(charname));
        if (bc == null) {
            bc = new BigChar(charname);
            pool.put(String.valueOf(charname), bc);
        }
        return bc;
    }
}
