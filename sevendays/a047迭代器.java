package sevendays;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class a047迭代器 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("a", "a");
        map.put("b", "b");
        map.put("c", "c");

        Set<String> keys = map.keySet();
        Iterator<String> iterator = keys.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            if ("b".equals(key)) {
                iterator.remove();
            }
            System.out.println(map.get(key));
        }
    }
}
