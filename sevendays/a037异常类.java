package sevendays;

public class a037异常类 {
    public static void main(String[] args) {
        try {
            int res = 10 / 0;
        } catch (RuntimeException e) {
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            System.out.println(e.fillInStackTrace());
            System.out.println("4:"+new RuntimeException(e));
        } finally {
            System.out.println("结束");
        }
    }
}

class a037User {
    public static String name = "zs";
}

//null
//by zero
//java.lang.ArithmeticException: / by zero
//结束
