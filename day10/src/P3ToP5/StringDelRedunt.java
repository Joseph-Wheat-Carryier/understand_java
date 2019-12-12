package P3ToP5;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class StringDelRedunt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入一个字符串:");
        String arr = scan.nextLine();
        char[] arrchar = arr.toCharArray();
        LinkedHashSet<Character> set = new LinkedHashSet<>();
        for(char a:arrchar){
            set.add(a);
        }
        char []temp = new char[set.size()];
        int i=0;
        for(char a:set){
            temp[i++] = a;
        }
        System.out.println(new String(temp));
    }
}
