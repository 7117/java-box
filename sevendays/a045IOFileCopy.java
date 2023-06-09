package sevendays;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class a045IOFileCopy {
    public static void main(String[] args) throws IOException {
        String srcPath = "D:\\github\\java-box\\io\\data";
        File srcFile = new File(srcPath);
        String dstPath = "D:\\github\\java-box\\io\\data.txt";
        File dstFile = new File(dstPath);

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(dstFile);

            int data = -1;

            while ((data = in.read()) != -1) {
                System.out.println(data);
                out.write(data);
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}
