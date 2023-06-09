package sevendays;

public class a030匿名类 {
    public static void main(String[] args) {
        a030Class a = new a030Class();
        a.Name(new a030abstract() {
            public String Say() {
                //sayA
                return "1";
            }
        });

        a030abstract b = new a030abstract();
        a.Name(b);
    }
}


class a030abstract {
    public String Say() {
        return "2";
    }
}

class a030Class {

    public void Name(a030abstract a030abstract) {
        System.out.println("a" + a030abstract.Say());
    }
}
