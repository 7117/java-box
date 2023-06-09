package thirtydays;

class AnimalSuper {
    public void move() {
        System.out.println("动物可以移动");
    }
}

class DogSuper extends AnimalSuper {
    public void move() {
        super.move(); // 应用super类的方法
        System.out.println("狗可以跑和走");
    }
}

public class OverWriteSuper {
    public static void main(String args[]) {

        AnimalSuper b = new DogSuper(); // Dog 对象
        b.move(); //执行 Dog类的方法

    }
}