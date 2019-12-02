package com.banyuan.club;

import java.util.Scanner;

public class p02 {
    public static void main(String[] args) {
        int [] num = new int[10];
        int [] count= new int[51];
        Scanner scan;
        for(int i=0;i<10;i++){
            System.out.println("输入数字:");
            scan = new Scanner(System.in);
            num[i] = scan.nextInt();
            count[num[i]]++;
        }

        for(int i=0;i<=50;i++){
            System.out.println(i+"次数:"+count[i]);
        }
    }
}
