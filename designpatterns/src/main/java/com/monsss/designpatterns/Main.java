package com.monsss.designpatterns;

public class Main {
    public static void main(String[] args) {
        System.out.println("test");

        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        Outer.StaticInner inner0 = new Outer.StaticInner();
    }

    static class Outer {
        private  int id;
        class Inner {
            public int getOuterId(){
                return id;
            }
        }
        static class StaticInner {
            public int getOuterId(){
                return new Outer().id;
            }
        }
    }

}

