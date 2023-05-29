package org.peggy.example01;

/**
 * @Projectname: designPatterns
 * @Filename: Main
 * @Author: peggy
 * @Data:2023/5/29 18:46
 * @Description: 客户端类
 */

public class Main {
    public static void main(String[] args) {
        Printable p = new PrinterProxy();
        System.out.println("现在的名字是:" + p.getPrinterName());
        p.setPrinterName("Bob");
        System.out.println("现在的名字是:" + p.getPrinterName());
        p.print("Hello World");
    }
}
