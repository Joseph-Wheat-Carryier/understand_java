package example;

public class Conditional {
    private void change(String a, char[] b) {
        a = "world";
        char[] c = {'e', 'f', 'g'};
        b = c;

    }

    public static void main(String[] args) {
        Conditional c = new Conditional();
        String a = "hello";
        char[] b = {'a', 'b', 'c'};
        c.change(a, b);
        System.out.println(a + b[1]);
    }
}


