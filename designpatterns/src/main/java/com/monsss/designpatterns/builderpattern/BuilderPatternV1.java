package com.monsss.designpatterns.builderpattern;

/**
 * In software engineering, a software design pattern is a general, reusable solution to a commonly occurring problem
 * within a given context in software design. It is not a finished design that can be transformed directly into source
 * or machine code. It is a description or template for how to solve a problem that can be used in many different situations.
 * Design patterns are formalized best practices that the programmer can use to solve common problems when designing an application or system.
 *
 * 在软件工程领域，设计模式是一套通用的可复用的解决方案，用来解决在软件设计过程中产生的通用问题。
 * 它不是一个可以直接转换成源代码的设计，只是一套在软件系统设计过程中程序员应该遵循的最佳实践准则。
 */
public class BuilderPatternV1 {
    public static void main(String[] args) {
        //简单
        ComputerV1 computer=new ComputerV1.Builder("因特尔","三星")
                .setDisplay("三星24寸")
                .setKeyboard("罗技")
                .setUsbCount(2)
                .build();

        System.out.println("computer = " + computer);
    }
}
class ComputerV1 {
    private final String cpu;//必须
    private final String ram;//必须
    private final int usbCount;//可选
    private final String keyboard;//可选
    private final String display;//可选

    private ComputerV1(Builder builder){
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.usbCount=builder.usbCount;
        this.keyboard=builder.keyboard;
        this.display=builder.display;
    }
    public static class Builder{
        private String cpu;//必须
        private String ram;//必须
        private int usbCount;//可选
        private String keyboard;//可选
        private String display;//可选

        public Builder(String cup,String ram){
            this.cpu=cup;
            this.ram=ram;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }
        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }
        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }
        public ComputerV1 build(){
            return new ComputerV1(this);
        }
    }
    //省略getter方法
}