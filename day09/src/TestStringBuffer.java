public class TestStringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        for(int i=97;i<97+26;i++)
        stringBuffer.append((char)i);
        System.out.println(stringBuffer.reverse());
        stringBuffer.delete(0,4);
        System.out.println(stringBuffer);
    }
}
