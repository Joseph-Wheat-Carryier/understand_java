package others;

public class Tongji {
    public static void main(String[] args) {
        int arr[] = new int [30];
        for(int i=0;i<30;i++){
            arr[i] =(int)(Math.random()*10);
        }

        int count[] = new int[10];

        for(int i=0;i<30;i++){
            count[arr[i]]++;
        }

        for(int i=0;i<10;i++){
            System.out.printf("%d有%d个\n",i,count[i]);
        }
    }
}
