package sevendays;

import java.util.HashMap;
import java.util.Hashtable;

public class a046集合hashTable {
    public static void main(String[] args) {
        Hashtable table = new Hashtable();
        //table.put(null,null);这个是有问题的
        System.out.println(table);
        HashMap map = new HashMap();
        map.put(null, null);
        System.out.println(map);

        //1.继承的父类不一样
        //2.底层的容量不一样 map16 table11
        //3.map可以为null table不可为null
        //4.map使用hash算法，table使用hashcode算法
        //5.map性能高,table要低一些
    }
}
