package sevendays;

public class a025单例模式 {
    public static void main(String[] args) {
        Single single1 = Single.getSingle();
        Single single2 = Single.getSingle();

        System.out.println(single1 == single2);
        System.out.println(single1.equals(single2));
    }
}

class Single {
    private static Single single;

    private Single() {
    }

    public static Single getSingle() {
        if (single == null) {
            single = new Single();
            return single;
        } else {
            return single;
        }
    }
}