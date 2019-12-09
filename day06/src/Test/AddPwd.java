package Test;

import java.util.Scanner;

public class AddPwd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("输入一个数");
        num = scan.nextInt();
        AddPwd addPwd = new AddPwd();
        num = addPwd.change(num);
        System.out.println(num);
    }

    int[] arr = new int[4];

    private int change(int a) {
        if (a <= 999 || a >= 10000) {
            System.out.println("不合法");
        }
        for (int i = 3; i >= 0; i--) {
            arr[i] = a % 10;
            a /= 10;
        }

        for (int i = 0; i < 4; i++) {
            arr[i] = (arr[i] + 9) % 10;
        }
        arr[0] = arr[0] ^ arr[2];
        arr[2] = arr[0] ^ arr[2];
        arr[0] = arr[0] ^ arr[2];
        arr[1] = arr[1] ^ arr[3];
        arr[3] = arr[1] ^ arr[3];
        arr[1] = arr[1] ^ arr[3];
        return arr[0] * 1000 + arr[1] * 100 + arr[2] * 10 + arr[3];
    }
}

