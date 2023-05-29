package org.peggy.example01;

/**
 * @Projectname: designPatterns
 * @Filename: Printable
 * @Author: peggy
 * @Data:2023/5/29 18:31
 * @Description: 功能主体
 */
public interface Printable {
    void setPrinterName(String name); //设计名字
    String getPrinterName(); //显示名字
    void print(String string); //显示文字 (打印输出)
}
