package com.banyuan.club;

import java.util.Scanner;

public class testBubble {
    public static void main(String[] args) {
        int [] a = new int [10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            int num = scan.nextInt();
            a[i] = num;
        }


        for(int i=0;i<10;i++){
            for(int j=i;j<9;j++){
                if(a[j]<a[j+1]){
                    int temp = a[i];
                    a[i] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }

        for(int i=0;i<10;i++){
            System.out.println(a[i]);
        }
    }
}
