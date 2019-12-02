package com.banyuan.club;

import java.util.Scanner;

public class p01 {
    public static void main(String[] args) {
        String [] str = new String[10];
        int [][] length_order = new int [10][2];
        Scanner scan;
        for(int i=0;i<10;i++){
            System.out.println("输入字符串");
            scan= new Scanner(System.in);
            str[i] = scan.nextLine();
        }

        for(int i=0;i<10;i++){
            length_order[i][0] = i;
            length_order[i][1] = str[i].length();
        }

        for(int i=0;i<10;i++){
            for(int j=i;j<10;j++){
                if(length_order[j][1]>length_order[i][1]){
                    int temp0;
                    int temp1;
                    temp0 = length_order[i][0];
                    temp1 = length_order[i][1];
                    length_order[i][0] = length_order[j][0];
                    length_order[i][1] = length_order[j][1];
                    length_order[j][0] = temp0;
                    length_order[j][1] = temp1;
                }
            }
        }

        for(int i=0;i<10;i++){
            System.out.println(str[length_order[i][0]]);
        }
    }
}
