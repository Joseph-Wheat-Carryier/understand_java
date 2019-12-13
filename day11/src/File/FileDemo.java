package File;

import java.io.File;

public class FileDemo {
    static  void find(File file, String str) {
        if (file.isDirectory()) {
            System.out.println(file.getName()+"===================================");
            File[] fileContent = file.listFiles();

            assert fileContent != null;
            for (File f : fileContent) {
                find(f, str);
            }
        } else {
            if (file.getName().contains(str)) {
                System.out.println(file.getName());
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("/Users/captain_cat/project/understand_java/day05");
        System.out.println(file.isDirectory());
        find(file,"");
    }
}
