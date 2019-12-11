import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        MyCollection myCollection2 = new MyCollection();
        String a = "你好";
        String b = "中国";
        myCollection.add(a);
        myCollection.add(b);
        myCollection.add("hasaki");
        myCollection.add("hasaki1");
        myCollection.add("hasaki2");
        myCollection.add("hasaki3");


        myCollection2.add("中国");
        myCollection2.add("hasaki1");
        myCollection2.add("你好");
        myCollection2.add("你好");


        for (Object abc : myCollection) {
            System.out.println(abc);
        }

        myCollection.remove("hasaki");
        myCollection.remove("hasaki1");


        System.out.println(Arrays.toString(myCollection.toArray()));
    }
}
