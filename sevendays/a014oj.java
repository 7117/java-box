package sevendays;


public class a014oj {
    public static void main(String[] args) {
        Cook c =new Cook();
        System.out.println(c.name);
        c.Fish();
    }
}


class Cook {
    String name = "a";
    int num = 1;

    public void Fish(){
        System.out.println("fish");
    }
}