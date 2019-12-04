package com.banyuan.day02.practice;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        int a[] = new int[3];
        int sum=0;
        int diff=0;
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<3;i++){
            System.out.printf("请输入第%d个数\n",i);
            a[i] = scan.nextInt();
            sum += a[i];
            if(i==0){
                diff=a[i];
            }else {
            diff = diff - a[i] ;}
        }

        System.out.printf("和是%d,差是%d",sum,diff);
    }
}
