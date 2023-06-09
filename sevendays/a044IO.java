package sevendays;

import java.io.File;
import java.io.IOException;

public class a044IO {
    public static void main(String[] args) throws IOException {
        String path = "../io/data";
        File file = new File(path);
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());

        if (file.exists()){
            if (file.isFile()){
                System.out.println(file.getAbsoluteFile());
                System.out.println(file.length());
                System.out.println(file.lastModified());
                System.out.println(file.getName());
            }else if (file.isDirectory()){
                System.out.println(file.getName());
                String[] list = file.list();
                for (String s : list) {
                    System.out.println(s);
                }
            }
        }
        //file.mkdir();
        //file.createNewFile();
    }
}
