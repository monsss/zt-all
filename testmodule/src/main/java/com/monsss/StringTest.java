package com.monsss;

public class StringTest {



    public static void main(String[] args) {
        String s1=String.valueOf(3);
        String s2=String.valueOf(3);

        String s3="abc";
        String s4="abc";
        System.out.println("s3==s4 = " + (s3==s4));

        System.out.println("s1==s2 = " + (s1==s2));
    }


    StringBuilder sb=new StringBuilder();

    StringBuffer stringBuffer=new StringBuffer();
}
