package sevendays;

public class a016Block {
    public static void main(String[] args) {
        a016User a016User = new a016User();
        a016User.a016Child();
        a016User a016User2 = new a016User();
    }
}

class a016User {
    // 如果多个构造器中都有重复的语句，可以抽取到初始化块中，提高代码的重用性。
    //1.static代码块是类加载时,执行，只会执行一次
    //2.普通代码块是在创建对象时调用的,创建一次，调用一次
    //3.静态代码块只能直接调用静态成员(静态属性和静态方法)，普通代码块可以调用任意成员

    /**
     * 顺序如下:(按照如下顺序执行)
     * ①父类的静态代码块和静态属性(优先级一样,按定义顺序执行)
     * ②子类的静态代码块和静态属性(优先级一样，按定义顺序执行)
     * ③父类的普通代码块和普通属性初始化(优先级一样，按定义顺序执行)
     * ④父类的构造方法
     * ⑤子类的普通代码块和普通属性初始化(优先级一样，按定义顺序执行)
     * ⑥子类的构造方法/面试题
     */

    public a016User() {
        System.out.println("a016User Construct");
    }

    //普通的代码块
    {
        a016Child();
        System.out.println("a016user static1");
    }

    //静态代码块
    static {
        //a016Child()错误的地方
        System.out.println("a016user static2");
    }

    public void a016Child() {
        System.out.println("a016Child");
    }

}
