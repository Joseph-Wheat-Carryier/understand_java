package P3ToP5;

import java.util.HashSet;

public class Random1_20 {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        do{
            set.add((int)(Math.random()*20));
        }while(set.size()!=10);
        System.out.println(set.toString());
    }
}