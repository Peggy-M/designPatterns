package com.peggy.flyweight.example01;

/**
 * @Projectname: designPatterns
 * @Filename: BigString
 * @Author: peggy
 * @Data:2023/5/25 15:15
 * @Description: 大型字符串创建类
 */

public class BigString {
    //"大型字符" 的数组
    private BigChar[] bigChars;

    //构造函数
    public BigString(String string) {
        bigChars = new BigChar[string.length()];
        BigCharFactory factory = BigCharFactory.getSingleton();
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = factory.getBigChar(string.charAt(i));
        }
    }

    //打印显示
    public void print() {
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i].print();
        }
    }
}
