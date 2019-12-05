package com.banyuan.day02.practice;

import java.util.ArrayList;
import java.util.Scanner;
import java.math.*;

public class p05 {
    public void sumGrade(int[] score) {
        int sum = 0;
        for (int value : score) {
            sum += value;
        }
        System.out.println(sum);
    }

    static void toDcimal(int a) {
        char[] ch = new char[32];
        for (int i = 0; i < 32; i++) {
            ch[i] = (char) (48 + (a & 1));
            a = a >> 1;
        }

        for (int i = 0; i < 16; i++) {
            char temp = ch[i];
            ch[i] = ch[31 - i];
            ch[31 - i] = temp;
        }


        int count = 0;
        for (int i = 0; i < 32; i++) {
            if (ch[i] == '0') {
                count++;
            } else {
                break;
            }
        }

        char[] result = new char[32 - count];
        for (int i = 0; i < 32 - count; i++) {
            result[i] = ch[count + i];
        }

        System.out.println(String.valueOf(result));
    }


    private static ArrayList<Integer> constPutinNumbers() {
        System.out.println("请输入数:");
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int num = 0;
        while ((num = scan.nextInt()) != 0) {
            System.out.println("请输入数:");
            arr.add(num);
        }
        return arr;
    }

    private void getMaxNum() {
        int min = 0;
        int max = 0;

        ArrayList<Integer> arr = constPutinNumbers();
        min = arr.get(0);
        max = min;


        for (
                int temp : arr) {
            if (temp > max) {
                max = temp;
            } else if (temp < min) {
                min = temp;
            }
        }

        System.out.printf("最大的数是%d,最小的数是%d", max, min);
    }

    static void getMultiple56() {
        ArrayList<Integer> result = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        arr = constPutinNumbers();
        for (int temp : arr) {
            if (temp % 5 == 0 ^ temp % 6 == 0) {
                result.add(temp);
            }
        }

        System.out.print(result.toString());
    }

    static void isLeapYear() {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println("闰年");
        } else {
            System.out.println("非闰年");
        }
    }

    static void guessNum() {
        int[] numbers = new int[30];
        Scanner scan = new Scanner(System.in);
        System.out.println("请猜一个数");
        int count = 0;
        int guess = scan.nextInt();
        for (int i = 0; i < 30; i++) {
            numbers[i] = (int) (30 * Math.random());
        }

        for (int temp : numbers) {
            if (guess == temp) {
                count++;
            }
        }

        System.out.printf("共有%d个%d", count, guess);
    }


    private int reverseNum(int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        int result = 0;
        if (num <= 0) {
            System.out.println("请输入一个正整数");
        }

        while (num != 0) {
            arr.add(num % 10);
            num /= 10;
        }
        for (int i = 0; i < arr.size(); i++) {
            result += arr.get(i) * Math.pow(10, (arr.size() - 1 - i));
        }

        return result;
    }

    public static void main(String[] args) {
        p05 p = new p05();
        System.out.print(p.reverseNum(1234556));
    }
}
