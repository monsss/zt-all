package com.monsss.javagrammar;

import java.util.*;

public class Test {

    public static void main(String[] args) {

        String str1=new String("abc");
        String str2="abc";
        System.out.println("str1==str2 = " + str1==str2);//false  new在堆内存中新开了一个对象




        String s1="ja";
        String s2="va";
        String s3="java";
        String s4=s1+s2;
        System.out.println("s3==s4 = " + s3==s4);//java 注意这个+号，java里面重载了+，其实调用了stringBuild，会new对象。
        System.out.println("s3.equals(s4) = " + s3.equals(s4));




        Integer integer1=new Integer(3);
        Integer integer2=new Integer(3);
        Integer integer4=3;
        Integer integer3=3;
        System.out.println("integer1 = " +integer1);
        System.out.println("integer2 = " +integer2);

        System.out.println("(integer3==integer4) = " + (integer3==integer4));
        
        System.out.println("integer1 = integer2" + (integer1==integer2));

        int i=1;

//        int x=i++;
//        int y=++i;
//
//        System.out.println("i = " + i);
//        System.out.println("x = " + x);
//        System.out.println("y = " + y);

        int size=2;
        {
            if(i++<size)
            {
                System.out.println("i = " + i);
            }
            System.out.println("i = " + i);
        }

        List<String> list=new ArrayList<>();

        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });

        list.stream().sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return 0;
            }
        });


        Set<String> set=new HashSet<>();

        set.iterator();
    }
}
