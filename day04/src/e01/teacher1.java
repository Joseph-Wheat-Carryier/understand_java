package e01;

public class teacher1 extends Teacher {
    String name = "老周";
    @Override
    void teachSE() {
        System.out.printf("%s在上javaSE部分的课",this.name);
    }

    void teachEE() {
        System.out.printf("%s在上javaEE部分的课",this.name);
    }
}
