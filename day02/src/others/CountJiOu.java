package others;

import java.util.Scanner;

public class CountJiOu {
    public static void main(String[] args) {


        int countJi=0;
        int countOu=0;
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("输入一个数,输入-1退出:");
        while ((num = scan.nextInt()) != -1) {
            System.out.println("输入一个数,输入-1退出:");
            if(num%2==0){
                countOu++;
            }else{
                countJi++;
            }
        }

        System.out.printf("奇数%d个,偶数%d个",countJi,countOu);
    }
}
