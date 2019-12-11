import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class CalTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入年月日:");
        System.out.println("输入年:");
        int year = scan.nextInt();
        System.out.println("输入月:");
        int month = scan.nextInt();
        System.out.println("输入日:");
        int day = scan.nextInt();
        LocalDate date = LocalDate.now();
        LocalDate birth = LocalDate.of(year,month,day);
        System.out.println(date.toEpochDay()-birth.toEpochDay());
    }
}
