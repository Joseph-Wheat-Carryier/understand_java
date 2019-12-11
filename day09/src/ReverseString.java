import java.sql.SQLOutput;
import java.util.Scanner;

public class ReverseString {
    private static String reverseIndex(String str, int beginIndex, int endIndex) throws Exception {
        if (endIndex > str.length()) {
            System.out.println("不合法");
            throw new Exception("错误");
        } else {
            String[] strtemp = {str.substring(0, beginIndex), str.substring(endIndex + 1, str.length())};
            StringBuffer temp = new StringBuffer(str.substring(beginIndex, endIndex+1));
            return (strtemp[0].concat(temp.reverse().toString()).concat(strtemp[1]));
        }
    }

    private static String reverseWord(String str) {
        String[] temp = str.split(" ");
        StringBuffer sb = new StringBuffer();
        for (String st : temp) {
            sb.append(new StringBuffer(st).reverse()).append(" ");
        }
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        /*Scanner scan = new Scanner(System.in);
        System.out.println("输入字符串");
        String str = scan.nextLine();
        System.out.println("输入起始");
        int begin = scan.nextInt();
        System.out.println("输入终止");
        int end = scan.nextInt();
        try {
            System.out.println(reverseIndex(str, begin, end));
        }catch (Exception e){
            System.out.println(e.getMessage());
        }*/
        System.out.println(reverseWord("to be or not to be"));
    }
}

