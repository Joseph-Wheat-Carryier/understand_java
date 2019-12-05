package others;

import java.util.Scanner;

public class findNum {
    public static void main(String[] args) {
        int[] a = new int[10];
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println("查询:");
        int b=scan.nextInt();
        for(int i=0;i<10;i++){
            if(a[i]==b){
                System.out.printf("找到了,下标是%d\n",i);
                break;
            }else if(a[i]!=b&&i==9){
                System.out.println("没找到\n");
            }
        }
    }
}
