package com.banyuan.club;

import java.util.*;

public class yhtriangle {
    public static void main(String[] args) {
        System.out.println("输入高度");
        Scanner scan = new Scanner(System.in);
        int height = scan.nextInt();
        int [][] abc = new int[height][height];
        abc[0][0] = 1;
        for(int i=1;i<height;i++){
            abc[i][0]=1;
            abc[i][i]=1;
            for(int j=1;j<=i;j++){
                abc[i][j]=abc[i-1][j-1]+abc[i-1][j];
            }
        }

        for(int i=0;i<height;i++){
            for(int j=0;j<=i;j++){
                System.out.print(abc[i][j]+" ");
            }
            System.out.print('\n');
        }
    }
}
