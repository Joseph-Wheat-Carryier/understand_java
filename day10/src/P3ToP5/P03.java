package P3ToP5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class P03 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Grape");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.sort(Comparator.comparing(String::toString));
        System.out.println(fruits.toString());
    }
}
