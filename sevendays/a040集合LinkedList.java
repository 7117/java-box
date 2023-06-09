package sevendays;

import java.util.LinkedList;

public class a040集合LinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("a");
        list.add("b");
        list.add("c");
        //添加
        System.out.println(list);
        list.addFirst("j");
        list.addLast("e");
        System.out.println("第1部分"+list);
        //获取
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(1));
        //修改
        System.out.println(list.set(1,"d"));
        System.out.println("第2部分"+list);
        //删除
        System.out.println(list.remove("d"));
        System.out.println("第3部分"+list);
        //添加数据
        list.push("q");//在头部推入
        System.out.println("第4部分"+list);
        System.out.println(list.pop());//在头部探出
        System.out.println("第5部分"+list);
    }
}
