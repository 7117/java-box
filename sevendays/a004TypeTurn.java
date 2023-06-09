package sevendays;

public class a004TypeTurn {
    public static void main(String[] args) {
        String name = "zhangsan";
        byte age = 30;
        name = "lishi";
        System.out.println(name);
        System.out.println(age);

        short c = age;
        System.out.println(c);
        float f = c;
        System.out.println(f);
        double r = f;
        System.out.println(r);

        int j = (int) r;
        System.out.println(j);

    }
}
