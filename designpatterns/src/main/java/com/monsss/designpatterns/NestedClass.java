package com.monsss.designpatterns;

public class NestedClass {

    public static void main(String[] args) {


        //HashMap

        NestedClass nestedClass=new NestedClass();


        Inner inner= nestedClass.new Inner();


        StaticInner staticInner=new StaticInner();
    }
    private  int id;

    public void initInner(){
        new Inner();
    }

    public class Inner {
        public int getOuterId(){
            return id;
        }
    }
    public static class StaticInner {
        public int getOuterId(){
            return new NestedClass().id;
        }
    }
}