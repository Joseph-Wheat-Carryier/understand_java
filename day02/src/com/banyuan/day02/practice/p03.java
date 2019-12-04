package com.banyuan.day02.practice;

import java.util.Scanner;

public class p03 {
    public static void main(String[] args) {
        int a,b;
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入第一个数:");
        a=scan.nextInt();
        System.out.println("请输入第二个数");
        b=scan.nextInt();

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.printf("a:%d,b:%d",a,b);
    }
}
