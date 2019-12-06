package day03.account;

public class TestArr {
    public static void main(String[] args) {
        int [] a =new int [10];
        for(int temp:a){
            temp = 10;
        }

        for(int i=0;i<10;i++){
            System.out.println(a[i]);
        }
    }
}
