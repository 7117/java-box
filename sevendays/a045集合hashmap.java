package sevendays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class a045集合hashmap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("a","a1");
        map.put("b","b1");
        //添加
        map.putIfAbsent("c","cc");
        map.put("c","c1");
        System.out.println(map);
        //获取
        System.out.println(map.get("a"));
        //删除
        System.out.println(map.remove("a"));
        //输出
        System.out.println(map);
        System.out.println(map.replace("c","dddd"));
        System.out.println(map);
        //清空
        //map.clear();
        //获取key的集合
        Set set = map.keySet();
        for (Object o : set) {
            System.out.println("遍历"+o.toString());
        }
        //删除集合中的key 与设定值相等的时候才会进行删除
        map.remove("b",1);

        //获取所有的值
        System.out.println(map.values());
        System.out.println(map.containsValue("b1"));

        //获取键值对对象
        Set<Map.Entry<String,String>> str = map.entrySet();
        for (Map.Entry<String, String> stringStringEntry : str) {
            System.out.println(stringStringEntry.toString()+" concat "+ stringStringEntry.getValue());
        }

        map.size();
        map.clear();
        map.clone();
    }



}
