package exam;

import java.util.ArrayList;
import java.util.HashMap;

public class ArrayList_HashMap {
    public static void main(String[] args) {
        ArrayList <HashMap> arr = new ArrayList<>(3);
        HashMap <String,String>hs1 = new HashMap<>();
        HashMap <String,String>hs2 = new HashMap<>();
        HashMap <String,String>hs3 = new HashMap<>();
        hs1.put("周瑜","小乔");
        hs1.put("吕布","貂蝉");
        hs2.put("郭靖","黄蓉");
        hs2.put("杨过","小龙女");
        hs3.put("令狐冲","任盈盈");
        hs3.put("林平之","岳灵珊");
        arr.add(hs1);
        arr.add(hs2);
        arr.add(hs3);
        for(HashMap hs:arr){
            System.out.println(hs.toString());
        }
    }
}
