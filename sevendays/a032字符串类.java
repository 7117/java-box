package sevendays;

import java.util.Arrays;

public class a032字符串类 {
    public static void main(String[] args) {
        Object obj = new Person();
        Object obj1 = obj;
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println(obj.hashCode());
        System.out.println(obj.equals(obj1));
        System.out.println(obj.getClass());
        System.out.println(obj.getClass().getPackage());
        System.out.println(obj.getClass().getSimpleName());
        System.out.println("==========");

        String name1 = "a";
        System.out.println(name1);

        String name2 = new String("name2");
        System.out.println(name2);

        String name3 = "\"";
        System.out.println(name3);
        System.out.println("a\tb");

        System.out.println(name3.hashCode());
        System.out.println(name1.concat("b"));

        System.out.println(name1.equals("a"));

        byte b1 = (byte) 'A';
        byte b2 = (byte) 'a';
        System.out.println(b1);
        System.out.println(name1.compareTo(name2));
        System.out.println(name1.compareToIgnoreCase(name2));

        //截取字符串
        String name5 = "sunxiao@com";
        String[] name5Arr = name5.split("@");
        System.out.println(Arrays.toString(name5Arr));
        //替换
        String name6 = "hello world";
        String name7 = "hello world";
        name6 = name6.replace("l", "a");
        name7 = name7.replaceAll("l", "a");
        System.out.println(name6);
        System.out.println(name7);

        String name8 = "hello world";
        String name9 = "HELLO WORLD";
        System.out.println(name8.toUpperCase());
        System.out.println(name9.toLowerCase());
        System.out.println("===========");

        String name10 = "HelloWorld";
        char[] name10s = name10.toCharArray();
        System.out.println(name10s);
        System.out.println(name10.charAt(1));
        System.out.println(Arrays.toString(name10.getBytes()));
        System.out.println(name10.indexOf("World"));
        System.out.println(name10.lastIndexOf("ld"));
        System.out.println("===========");
        System.out.println(name10.concat("or"));
        System.out.println(name10.startsWith("He"));
        System.out.println(name10.isEmpty());
        System.out.println(name10.isBlank());
        System.out.println("===========");

        StringBuilder name11 = new StringBuilder();
        for (int i = 0; i < 3; i++) {
            name11.append(i);
        }
        System.out.println(name11);
        System.out.println(name11.insert(1,"d"));
        System.out.println(name11.length());
        System.out.println(name11.reverse());


    }
}
