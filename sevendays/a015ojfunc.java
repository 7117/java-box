package sevendays;

public class a015ojfunc {
    public static void main(String[] args) {
        Cook015 c = new Cook015();
        System.out.println(c.name);
        System.out.println(c.Fish(1,4));;
    }
}


class Cook015 {
    String name = "a";
    int num = 1;

    public int Fish(int a,int b) {
        return a+b;
    }
}