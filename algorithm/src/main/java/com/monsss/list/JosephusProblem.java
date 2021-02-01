package com.monsss.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 约瑟夫问题（有时也称为约瑟夫斯置换，是一个计算机科学和数学中的问题。在计算机编程的算法中，类似问题又称为约瑟夫环。又称“丢手绢问题”.）
 */
public class JosephusProblem {

    public static int yuesefu(int n, int m){
        if(n == 0 || m == 0)
            return -1;
        if(n == 1 && m == 1)
            return -1;
        List<Integer> alist = new ArrayList<Integer>();
        for(int i = 0; i < n; i++)
            alist.add(i);
        //初值设为-1，
        int index = -1;
        while(alist.size() > 1){
            index = (index+m)%alist.size();
            alist.remove(index);
            //从上一个位置开始计数
            index--;
        }
        return alist.get(0);

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("请输入总人数：");
        int totalNum = s.nextInt();
        System.out.print("请输入报数大小：");
        int cycleNum = s.nextInt();
        s.close();
        int a = yuesefu(totalNum, cycleNum);
        System.out.println("最后一个人的序号：" + a);
    }
}
