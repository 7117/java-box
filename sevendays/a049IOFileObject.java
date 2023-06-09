package sevendays;

import java.io.*;

public class a049IOFileObject {

    public static void main(String[] args) throws IOException {
        a049User a049User = new a049User();

        String srcPath = "D:\\github\\java-box\\io\\obj.txt";
        File srcFile = new File(srcPath);
        String dstPath = "D:\\github\\java-box\\io\\objCopy.txt";
        File dstFile = new File(dstPath);

        ObjectOutputStream ObjectOut = null;
        FileOutputStream out = null;
        ObjectInputStream ObjectIn = null;
        FileInputStream in = null;

        try {

            out = new FileOutputStream(srcPath);
            ObjectOut = new ObjectOutputStream(out);
            ObjectOut.writeObject(a049User);

            in = new FileInputStream(srcFile);
            ObjectIn = new ObjectInputStream(in);
            Object o = ObjectIn.readObject();
            System.out.println(o);

        } catch (RuntimeException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (out != null) {
                out.close();
            }
            if (ObjectOut != null) {
                ObjectOut.close();
            }

        }
    }
}

class a049User implements Serializable {
}
