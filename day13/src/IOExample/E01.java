package IOExample;

import java.io.*;

public class E01 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("src/IOExample/E01.java");
        File file2 = new File("/Users/captain_cat/project/understand_java/day13/src/IOExample","E01copy.java");
        InputStream is = new FileInputStream(file1);
        byte []b = new byte[(int) file1.length()];
        is.read(b);
        is.close();

        OutputStream os = new FileOutputStream(file2);
        os.write(b);
        os.close();
    }
}
