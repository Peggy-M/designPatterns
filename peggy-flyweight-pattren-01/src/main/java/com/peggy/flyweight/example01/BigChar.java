package com.peggy.flyweight.example01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @Projectname: designPatterns
 * @Filename: BigChar
 * @Author: peggy
 * @Data:2023/5/25 11:14
 * @Description: 根据字符生成字符串
 */

public class BigChar {

    //字符名字
    private char charname;

    //大型字符对应的字符串
    private String fontdata;

    //字符串文件路径
    private static String PATH = "E:\\workspaces\\java\\designPatterns\\peggy-flyweight-pattren-01\\src\\main\\resources\\";

    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(PATH + "big" + charname + ".txt"));
            String line;
            int n=0;
            StringBuilder buf = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                //写入到内存
                buf.append(line);
                buf.append("\n");
            }
            this.fontdata = buf.toString();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void print() {
        System.out.print(fontdata);
    }
}
