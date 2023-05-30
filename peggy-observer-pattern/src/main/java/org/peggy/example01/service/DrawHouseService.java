package org.peggy.example01.service;

/**
 * @Projectname: designPatterns
 * @Filename: DrawHouseService
 * @Author: peggy
 * @Data:2023/5/30 20:23
 * @Description: 模拟买房摇号服务
 */

public class DrawHouseService {
    //摇号抽签
    public String lots(String uId){
        if(uId.hashCode() % 2 == 0){
            return "恭喜ID为: " + uId + " 的用户,在本次摇号中中签! !";
        }else{
            return "很遗憾,ID为: " + uId + "的用户,您本次未中签!!";
        }
    }
}
