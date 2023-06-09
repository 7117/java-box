package sevendays;

public class a021关键字this {
    public static void main(String[] args) {
        new a021child();
    }
}

class a021parent{
    String parent = "parent";
}

class a021child extends a021parent{
    String parent = "child";

    a021child() {
        //必须声明在第一行
        this(" wo empty ");
        System.out.println("in empty construct");
        System.out.println(this.parent);
        System.out.println(super.parent);
    }

    a021child(String in) {
        System.out.println("in string construct" + in);
    }



}