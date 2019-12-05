package practice.banyuan.club;


public class Derived extends Base {
    static final int a=50;
    final double b=1.2F;
    public Derived(String abc) {
        super(abc);
        objType = "I am a Derived type";
    }


    public static void main(String []args) {
        Derived d = new Derived("abc");
    }
}