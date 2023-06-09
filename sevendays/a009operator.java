package sevendays;

public class a009operator {
    public static void main(String[] args) {
        int i = 10;
        int j = 10;
        System.out.println(i == j);

        int k = -1;
        boolean d = i > 10 || k < 100;
        System.out.println(d);

        boolean e = true;
        System.out.println(!e);
//        &和&&区别是第一个会计算两边的值；第二个会考虑计不计算第二个值

    }
}
