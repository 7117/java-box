package sevendays;

public class a052线程堵塞和线程同步Sync {
    public static void main(String[] args) {
        // wait & sleep
        // 1. 名字
        //    wait : 等待
        //    sleep : 休眠
        // 2.从属关系
        //    wait : Object, 成员方法
        //    sleep : Thread, 静态方法
        // 3. 使用方式
        //    wait : 只能使用在同步代码中
        //    sleep : 可以在任意地方法使用
        // 4. 阻塞时间
        //   wait : 超时时间（会发生错误）
        //   sleep : 休眠时间（不会发生错误）
        // 5. 同步处理
        //   wait : 如果执行wait方法，那么其他线程有机会执行当前的同步操作。
        //   sleep : 如果执行sleep方法，那么其他线程没有机会执行当前的同步操作。

        //线程同步：
        //synchronized多个线程访问同步方法时候，只是一个一个的访问
        //synchronized关键字还可以修饰代码块，称之为同步代码块
        Num52 num52 = new Num52();
        User52 user52 = new User52(num52);
        Bank bank = new Bank(num52);
        user52.start();
        bank.start();
    }
}

class Num52 {
}

class Bank extends Thread {
    public Num52 num52;

    public Bank(Num52 num52) {
        this.num52 = num52;
    }

    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("bank 开始发号码牌了");
        num52.notifyAll();
    }
}

class User52 extends Thread {
    public Num52 num52;

    public User52(Num52 num52) {
        this.num52 = num52;
    }

    public void run() {
        synchronized (num52){
            try {
                System.out.println("我是1号等待中");
                num52.wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("到我了");

        }
    }
}

