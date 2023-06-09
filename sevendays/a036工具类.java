package sevendays;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.UUID;

public class a036工具类 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        //UUID
        System.out.println(UUID.randomUUID().toString());

        //随机数
        Random random = new Random();
        int r = random.nextInt(4,6);
        System.out.println(r);

        String from = "from";
        char[] chars = from.toCharArray();
        System.out.println(chars);
        System.out.println(chars[1]);

        //转换编码
        byte[] bytes = from.getBytes("ISO8859-1");
        String str1 = new String(bytes,"ISO8859-1");
        System.out.println(str1);
        String str2 = new String(bytes, StandardCharsets.UTF_8);
        System.out.println(str2);
    }
}
