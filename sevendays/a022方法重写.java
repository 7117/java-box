package sevendays;

public class a022方法重写 {
    //方法名相同，返回值类型相同，参数列表要相同
    public static void main(String[] args) {
        a022child a = new a022child();
        a.test();
    }
}

class a022parent {
    void test() {
        System.out.println("parent");
    }
}

class a022child extends a022parent {
    void test() {
        System.out.println("child overWrite");
    }

}