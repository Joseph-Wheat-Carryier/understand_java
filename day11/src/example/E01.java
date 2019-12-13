package example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class E01 {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.println("输入一个字符串:");
        String str = scan.nextLine();
        char [] chr = str.toCharArray();
        HashMap <Character,Integer>map = new HashMap<>();
        HashSet <Character>set = new HashSet<>();
        for(char a:chr){
            set.add(a);
        }

        for(Character a:set){
            map.put(a,0);
        }

        for(char a:chr){
            if(map.containsKey(a)){
                map.replace(a,map.get(a)+1);
            }
        }

        System.out.println(map);
    }
}
