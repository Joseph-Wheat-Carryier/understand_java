package others;

import java.util.Scanner;

public class shuzuzuida {
    public static void main(String[] args) {
        int max;
        int []arr = new int[10];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("输入一个数:");
            arr[i] = scan.nextInt();
        }

        max = arr[0];
        int index=0;

        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max = arr[i];
                index = i;
            }
        }

        System.out.printf("最大值数%d,下标是%d",max,index);

    }
}
