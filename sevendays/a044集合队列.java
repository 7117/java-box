package sevendays;

import java.util.concurrent.ArrayBlockingQueue;

public class a044集合队列 {
    public static void main(String[] args) throws Exception {
        ArrayBlockingQueue queue = new ArrayBlockingQueue(3);
        //第一种：添加队列的方式 会进行报错
        //queue.add("a");
        //queue.add("b");
        //queue.add("c");
        //System.out.println(queue);
        //Exception in thread "main" java.lang.IllegalStateException: Queue full
        //queue.add("d");
        //System.out.println(queue);

        //第二种：添加队列的方式 会产生等待
        //queue.put("a1");
        //queue.put("a2");
        //queue.put("a3");
        //System.out.println(queue);
        //queue.put("a4");
        //System.out.println(queue);

        //第三种：添加后返回对错的
        boolean a1 = queue.offer("a1");
        System.out.println(a1);
        boolean a2 = queue.offer("a2");
        System.out.println(a2);
        boolean a3 = queue.offer("a3");
        System.out.println(a3);
        boolean a4 = queue.offer("a4");
        System.out.println(a4);
        System.out.println(queue.poll());
        System.out.println(queue);
        System.out.println("take1:"+queue.take());
        System.out.println("take2:"+queue.take());
        //没有的时候会进行等待
        System.out.println("take3:"+queue.take());

        System.out.println(queue.isEmpty());
    }
}
