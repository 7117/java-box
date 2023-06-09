package sevendays;

import java.util.Arrays;
import java.util.HashSet;

public class a043集合set {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println("第1部分：" + set);
        //删除数据
        set.remove("a");
        System.out.println("第2部分：" + set);
        //查询数据
        for (Object o : set) {
            System.out.println(o);
        }

        System.out.println(set);
        Object[] objects = set.toArray();
        System.out.println(Arrays.toString(objects));

        HashSet<a043User> set1 = new HashSet<>();
        a043User u1 = new a043User();
        a043User u2 = new a043User();
        a043User u3 = new a043User();
        set1.add(u1);
        set1.add(u2);
        set1.add(u3);
        Object[] set1s = set1.toArray();
        for (int i = 0; i < set1.size(); i++) {
            System.out.println("一步一步的：" + set1s[i].toString());
        }
    }
}

class a043User {
    public int id;
    public String name;
}
