package com.banyuan.day02.practice;

public class p06 {
    static void 乘法表(){
        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.printf("%d*%d=%2d  ",j,i,i*j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        乘法表();
    }
}
