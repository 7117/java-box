package sevendays;

import java.io.*;

public class a046IOFileCopyBuffer {
    public static void main(String[] args) throws IOException {
        String srcPath = "D:\\github\\java-box\\io\\data";
        File srcFile = new File(srcPath);
        String dstPath = "D:\\github\\java-box\\io\\dataBuff.txt";
        File dstFile = new File(dstPath);

        FileInputStream in = null;
        FileOutputStream out = null;

        BufferedInputStream buffIn = null;
        BufferedOutputStream buffOut = null;

        byte[] cache = new byte[100];

        try {
            buffIn = new BufferedInputStream(new FileInputStream(srcFile));
            buffOut = new BufferedOutputStream(new FileOutputStream(dstFile));
            int data = -1;

            while ((data = buffIn.read(cache)) != -1) {
                buffOut.write(cache, 0, data);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (buffIn != null) {
                buffIn.close();
            }
            if (buffOut != null) {
                buffOut.close();
            }
        }
    }
}
