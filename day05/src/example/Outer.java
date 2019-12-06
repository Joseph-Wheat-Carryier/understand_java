package example;

public class Outer {
    static Inter method() {
        return new Inter() {
            @Override
            public void show() {
            System.out.println("Hello world!");
            }
        };
    }
}
