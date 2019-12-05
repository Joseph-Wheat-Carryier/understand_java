package others;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        int [] pwd = new int[8];
        int count=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("请输入小于8位的密码!");
        String str = scan.nextLine();
        while(str.length()>8){
            System.out.println("请输入小于8位的密码!");
            str= scan.nextLine();
        }
        char [] tempArr= str.toCharArray();
        for(int i=0;i<tempArr.length;i++){
            pwd[i] = (int)tempArr[i] - 48;
        }
        
        for(int i=tempArr.length-1;i>=0;i--){
            if(pwd[i]==0){
                count++;
            }else{
                break;
            }
        }
        
        int max_num = tempArr.length-count;
        int []result =new int[max_num];

        for(int i=max_num-1;i>=0;i--){
            result[max_num-1-i] =(pwd[i]+5)%10;
        }

        result[0] = result[0]^result[max_num-1];
        result[max_num-1] = result[0]^result[max_num-1];
        result[0] = result[0]^result[max_num-1];



        for(int temp:result)
        System.out.print(temp);
    }
}
