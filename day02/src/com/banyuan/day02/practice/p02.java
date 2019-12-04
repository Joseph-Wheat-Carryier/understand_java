package com.banyuan.day02.practice;

import java.util.Scanner;

public class p02 {
    static String toLower(String ch){
        char []  a = ch.toCharArray();
        for(int i=0;i<a.length;i++){
            a[i] =(char)(a[i] + 'a' - 'A');
        }
        return String.valueOf(a);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String abc ;
        System.out.println("请输入一个大字符串:");
        abc = scan.next();
        abc = toLower(abc);
        System.out.println(abc);
    }
}
