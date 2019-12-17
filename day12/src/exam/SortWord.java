package exam;

import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;

public class SortWord {
    public static class MyString implements Comparable{
        private String value;

        MyString(String value) {
            this.value = value;
        }

        public String getValue(){
            return this.value;
        }

        public MyString[] split(String a){
            String []temp =  value.split(a);
            MyString []result = new MyString[temp.length];
            for(int i=0;i<temp.length;i++){
                result[i] = new MyString(temp[i]);
            }
            return result;
        }

        @Override
        public int compareTo(Object o) {
            String temp = ((MyString)o).getValue();
            return value.toLowerCase().compareTo(temp.toLowerCase());
        }

        public String toString(){
            return value;
        }
    }
    public static void main(String[] args) {
        MyString word;
        Scanner scan = new Scanner(System.in);
        System.out.println("输入单词，空格隔开");
        word=new MyString(scan.nextLine());
        MyString []str = word.split(" ");
        TreeSet<MyString> treeSet = new TreeSet<>(Arrays.asList(str));
        for(MyString m:treeSet){
            System.out.print(m);
        }
    }
}
