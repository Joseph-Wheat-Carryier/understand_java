import java.util.ArrayList;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        MyCollection myCollection = new MyCollection();
        MyCollection myCollection2 = new MyCollection();
        String a="你好";
        String b="中国";
        myCollection.add(a);
        myCollection.add(b);
        myCollection.add("hasaki");


        myCollection2.add("中国");
        myCollection2.add("你好");


        for( Object abc:myCollection){
            System.out.println(abc);
        }

        myCollection.retainAll(myCollection2);
        System.out.println(Arrays.toString(myCollection.toArray()));
    }
}
