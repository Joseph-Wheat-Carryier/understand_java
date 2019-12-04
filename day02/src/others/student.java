package others;

import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        int sum = 0;
        int max = 0;
        int min = 0;
        int[] score = new int[8];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < score.length; i++) {
            score[i] = scan.nextInt();
            sum += score[i];
        }

        max = score[0];
        min = score[0];


        for (int value : score) {
            if (max < value)
                max = value;
            if (min > value)
                min = value;
        }

        System.out.printf("总分:%d最高分:%d最低分:%d平均分:%.2f",sum,max,min,(double)(sum/score.length));
    }
}
