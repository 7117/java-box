package sevendays;

public class a020方法重载 {
    public static void main(String[] args) {
        a020child a= new a020child();

        a.login("string");
        a.login(111111);
        a.login(2.22F);
    }
}

class a020child {
    public void login(String in) {
        System.out.println("string" + in);
    }

    public void login(int in) {
        System.out.println("int" + in);
    }

    public void login(float in) {
        System.out.println("float" + in);
    }
}