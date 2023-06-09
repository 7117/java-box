package sevendays;

import java.io.*;


public class a047IOFileCopyString {
    public static void main(String[] args) throws IOException {

        String srcPath = "D:\\github\\java-box\\io\\data";
        File srcFile = new File(srcPath);
        String dstPath = "D:\\github\\java-box\\io\\dataString.txt";
        File dstFile = new File(dstPath);

        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream(srcFile);
            out = new FileOutputStream(dstFile);
            int data = -1;

            StringBuilder ss = new StringBuilder();

            while ((data = in.read()) != -1) {
                ss.append((char) data);
            }
            System.out.println(ss);

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
