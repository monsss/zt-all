package com.monsss.javagrammar;


/**
 * Java 内部类
 * 在Java中，可以将一个类定义在另一个类里面或者一个方法里面，这样的类称为内部类。
 * 广泛意义上的内部类一般来说包括这四种：成员内部类、局部内部类、匿名内部类和静态内部类。
 * 下面就先来了解一下这四种内部类的用法。
 * https://www.cnblogs.com/dolphin0520/p/3811445.html
 */
public class NestedClassTest {

    public static void main(String[] args) {

        //局部内部类

        Man man =new Man();
        People people=man.getWoman();

        System.out.println("people = " + people);

        // 匿名内部类
        //ForkJoinTask forkJoinTask;

        final Runnable runnable=new Runnable() {
            public void run() {
                System.out.println("runnable = " + this);
            }
        };

        runnable.run();
        //

        NestedClass nestedClass=new NestedClass();
        System.out.println("nestedClass = " + nestedClass);


        //成员内部类
        NestedClass.Inner inner= nestedClass.new Inner();
        System.out.println("inner = " + inner);

        //静态内部类
        NestedClass.StaticInner staticInner=new NestedClass.StaticInner();
        System.out.println("staticInner = " + staticInner);
    }

}

class NestedClass {


    private  int id;

    public void initInner(){
        new Inner();
    }

    /**
     * 成员内部类
     */
    public class Inner {
        public int getOuterId(){
            return id;
        }
    }

    /**
     * 静态内部类
     */
    public static class StaticInner {
        public int getOuterId(){
            return new NestedClass().id;
        }
    }
}

class People{
    public People() {

    }
}

class Man{
    public Man(){

    }

    /**
     * 局部内部类
     * @return
     */
    public People getWoman(){
        class Woman extends People{   //局部内部类
            int age =0;
        }
        return new Woman();
    }
}