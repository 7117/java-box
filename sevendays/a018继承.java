package sevendays;

public class a018继承 {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.name);
        System.out.println(son.namesuper);
    }
}

class Father {
    String name = "father";
}

class Son extends Father {
    String name = "son";
    String namesuper = super.name;
}