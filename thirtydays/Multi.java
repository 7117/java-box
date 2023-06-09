package thirtydays;

//同一个事件发生在不同的对象上会产生不同的结果。
public class Multi {
    public static void main(String[] args) {
        show(new CatMulti());  // 以 CatMulti 对象调用 show 方法
        show(new DogMulti());  // 以 DogMulti 对象调用 show 方法

        AnimalMulti a = new CatMulti();     // 向上转型:向父类转型，使用的重写的方法
        a.eat();
        //a.work();
        // 调用的是 CatMulti 的 eat,这个是因为重写的原因
        CatMulti c = (CatMulti) a;          // 向下转型：向子类转型，直接使用子类的方法
        c.eat();
        c.work();                           // 调用的是 CatMulti 的 work


    }

    public static void show(AnimalMulti a) {
        a.eat();
        // 类型判断
        if (a instanceof CatMulti) {  // 猫做的事情
            CatMulti c = (CatMulti) a;
            c.work();
        } else if (a instanceof DogMulti) { // 狗做的事情
            DogMulti c = (DogMulti) a;
            c.work();
        }
    }
}
//    CatMulti吃鱼
//    CatMulti抓老鼠
//    DogMulti吃骨头
//    DogMulti看家

//    CatMulti吃鱼
//    CatMulti抓老鼠

abstract class AnimalMulti {
    abstract void eat();
}

class CatMulti extends AnimalMulti {
    public void eat() {
        System.out.println("CatMulti吃鱼");
    }

    public void work() {
        System.out.println("CatMulti抓老鼠");
    }
}

class DogMulti extends AnimalMulti {
    public void eat() {
        System.out.println("DogMulti吃骨头");
    }

    public void work() {
        System.out.println("DogMulti看家");
    }
}
