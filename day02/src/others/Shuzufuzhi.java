package others;

import java.util.Scanner;

public class Shuzufuzhi {
    public static void main(String[] args) {
        int [] a = new int [10];
        int [] b = new int [10];
        Scanner scan = new Scanner(System.in);
        for(int i=0;i<10;i++){
            a[i]= scan.nextInt();
        }
        System.arraycopy(a, 0, b, 0, 10);
        for(int temp:b){
            System.out.print(temp+" ");
        }
    }
}
