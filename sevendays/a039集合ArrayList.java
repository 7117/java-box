package sevendays;

import java.util.ArrayList;

public class a039集合ArrayList {
    public static void main(String[] args) {
        // 1. Collection接口
        //    常用的子接口
        //    List ：按照插入顺序保存数据，数据可以重复的
        //         具体的实现类： ArrayList, LinkedList
        //    Set : 集，无序保存，数据不能重复
        //         具体的实现类 HashSet
        //    Queue ： 队列
        //         具体的实现类：ArrayBlockingQueue
        // 2. Map接口
        //    具体的实现 ： HashMap, Hashtable

        ArrayList list = new ArrayList();
        //添加
        list.add("a");
        list.add("b");
        list.add("f");
        System.out.println(list);
        //获取
        System.out.println(list.get(1));
        //删除
        System.out.println(list.remove(1));
        System.out.println(list.set(1, "d"));
        //个数
        System.out.println(list.size());
        //清空
        //list.clear();
        //判断是否为空
        list.isEmpty();
        //索引
        System.out.println("indexOf:" + list.indexOf("a"));
        //转化为数组
        Object[] objects = list.toArray();

        Object clone = list.clone();
        System.out.println("clone:" + clone);

        ArrayList list1 = (ArrayList) clone;
        System.out.println("ArrayList:" + list1);
    }
}
