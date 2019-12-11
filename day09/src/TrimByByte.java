import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class TrimByByte {
    public static void main(String[] args) throws UnsupportedEncodingException {
        Scanner scan = new Scanner(System.in);
        String str = "我ABC汉DEF";
        int bytes = scan.nextInt();
        byte[] b = str.getBytes("GBK");
        System.out.println(Arrays.toString(b));
        byte[] temp = new byte[bytes];
        System.arraycopy(b, 0, temp, 0, bytes);
        if (temp[bytes - 1] < 0) {
            byte[] temp2 = new byte[bytes - 1];
            System.arraycopy(b, 0, temp2, 0, bytes - 1);
            b = temp2;
        } else {
            b = temp;
        }
        System.out.println(Arrays.toString(b));
        System.out.println(new String(b, "GBK"));

    }
}
