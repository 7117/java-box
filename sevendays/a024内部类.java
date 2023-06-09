package sevendays;

public class a024内部类 {
    public static void main(String[] args) {
        Out o = new Out();
        Out.In in = o.new In();
        System.out.println(in.name);
    }
}

class Out {
    public class In{
        String name = "in box";
    }
}
