package sevendays;

import java.io.*;

public class a048IOFileCopyStringLine {
    public static void main(String[] args) throws IOException {
        String srcPath = "D:\\github\\java-box\\io\\data";
        File srcFile = new File(srcPath);
        String dstPath = "D:\\github\\java-box\\io\\dataLine.txt";
        File dstFile = new File(dstPath);

        BufferedReader reader = null;
        PrintStream writer = null;

        try {
            reader = new BufferedReader(new FileReader(srcFile));
            writer = new PrintStream(dstFile);

            String line = null;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
                writer.println(line);
            }
            writer.flush();

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (reader != null){
                reader.close();
            }
            if (writer != null){
                writer.close();
            }
        }
    }
}
