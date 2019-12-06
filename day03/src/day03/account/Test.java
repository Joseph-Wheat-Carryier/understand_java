package day03.account;

public class Test {
    public static void main(String[] args) {
        Customer jahnSmith = new Customer("Jahn","Smith","1000",2000,0.0123);
        System.out.println(jahnSmith.toString());
        jahnSmith.deposit(100);
        jahnSmith.withdraw(960);
        jahnSmith.withdraw(2000);
    }
}
