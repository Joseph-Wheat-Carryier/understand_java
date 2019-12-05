package e01;

public class teacher2 extends Teacher {
    String name = "老李";
    @Override
    void teachSE() {
        System.out.printf("%s在上javaSE部分的课",this.name);
    }

    void teachEE() {
        System.out.printf("%s在上javaEE部分的课",this.name);
    }
}
