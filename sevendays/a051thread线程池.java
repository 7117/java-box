package sevendays;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class a051thread线程池 {
    public static void main(String[] args) {
        //创建固定数量的线程池
        ExecutorService pool1 = Executors.newFixedThreadPool(3);
        //动态变化
        ExecutorService pool2 = Executors.newCachedThreadPool();
        //单一线程
        ExecutorService pool3 = Executors.newSingleThreadExecutor();
        //定时调度
        ExecutorService pool4 = Executors.newScheduledThreadPool(3);

        for (int i = 0; i < 5; i++) {
            pool4.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
    }
}
