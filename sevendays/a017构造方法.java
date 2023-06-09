package sevendays;

import java.util.Date;

public class a017构造方法 {

    //运行到11
    public static void main(String[] args) {
        Date a = new Date();
        System.out.println(a.getTime());

        new a017child(111222);
    }
}

class a017child {
    static {
        System.out.println("static");
    }

    {
        System.out.println("normal");
    }

    public a017child(int a) {
        System.out.println(a);
    }
}
