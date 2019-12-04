package com.banyuan.day02.practice;

import java.util.Scanner;

public class p04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入一个数");
        int x=scan.nextInt();
        String result = x%2==0? "偶数":"奇数";
        System.out.print(result);
    }
}
