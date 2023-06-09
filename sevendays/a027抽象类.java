package sevendays;

public class a027抽象类 {
    public static void main(String[] args) {
    //    抽象方法只是声明，没有实现的方法
        a027Child a = new a027Child();
        a.eat();
        a.test();
    }
}

abstract class a027Parent {
    public abstract void eat();
    public void test(){
        System.out.println("a027Parent");
    };
}

class a027Child extends a027Parent {
    @Override
    public void eat() {
        System.out.println("重写了abstract");
    }
    //可以重写
    public void test(){
        System.out.println("aaa");
    }

}


