package org.peggy.example01;

/**
 * @Projectname: designPatterns
 * @Filename: PrinterProxy
 * @Author: peggy
 * @Data:2023/5/29 18:41
 * @Description: 代理者
 */

public class PrinterProxy implements Printable {
    private String name;    //名字
    private Printer real;   //"本人" 被代理的对象

    @Override
    public void setPrinterName(String name) {
        if (real != null) {
            real.setPrinterName(name);
        }
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        realized();
        return real.name;
    }

    @Override
    public void print(String string) {
        realized();
        real.print(string);
    }

    private synchronized void realized() {
        if (real == null) {
            real = new Printer(name);
        }
    }
}
