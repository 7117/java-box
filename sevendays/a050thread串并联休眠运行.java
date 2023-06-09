package sevendays;

public class a050thread串并联休眠运行 {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        t1.start();

        MyThread2 t2 = new MyThread2();
        t2.start();

        t1.join();
        t2.join();

        int i = 0;
        while (i <= 2) {
            Thread.sleep(1000);
            i++;
            System.out.println("Main : " + Thread.currentThread().getName() + i);
        }

        Thread t3 = new Thread(
                ()->{
                    System.out.println("t3 run");
                }
        );
        t3.start();

        Thread t4 = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("t4 run");
                    }
                }
        );
        t4.start();


    }
}

class MyThread1 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread1 : " + Thread.currentThread().getThreadGroup());
        System.out.println("MyThread1 : " + Thread.currentThread().getId());
        System.out.println("MyThread1 : " + Thread.currentThread().getName());
        System.out.println("MyThread1 : " + Thread.currentThread().getUncaughtExceptionHandler());
    }
}

class MyThread2 extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread2 : " + Thread.currentThread().getThreadGroup());
        System.out.println("MyThread2 : " + Thread.currentThread().getId());
        System.out.println("MyThread2 : " + Thread.currentThread().getName());
        System.out.println("MyThread2 : " + Thread.currentThread().getUncaughtExceptionHandler());
    }
}
