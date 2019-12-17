package exam;

import java.util.HashMap;

public class CountNum {
    public static void main(String[] args) {
        char[] ch = "123,456,789,456".toCharArray();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : ch) {
            if (c <= 57 && c >= 48) {
                if (!map.containsKey(c)) {
                    map.put(c, 1);
                } else {
                    map.replace(c, map.get(c) + 1);
                }
            }
        }
        System.out.print(map.toString());
    }
}
