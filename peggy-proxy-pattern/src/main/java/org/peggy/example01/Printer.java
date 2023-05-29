package org.peggy.example01;

/**
 * @Projectname: designPatterns
 * @Filename: PrinterProxy
 * @Author: peggy
 * @Data:2023/5/29 18:34
 * @Description: RealSubject 实际主体
 */

public class Printer implements Printable {

    String name;

    public Printer(String name) {
        heavyJob("正在生成 Printer 的实例,(" + name + ")");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return this.name;
    }

    @Override
    public void print(String string) {
        System.out.println("====" + name + "====");
        System.out.println(string);
    }

    private void heavyJob(String msg) {        //重活
        System.out.println(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(5 * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.print(". ");
        }
        System.out.println("结束");
    }
}
