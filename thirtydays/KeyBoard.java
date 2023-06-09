package thirtydays;

import java.util.Scanner;

public class KeyBoard {
    public static void main(String[] args) {
        System.out.println("main");

        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入整数");
        int num = scanner.nextInt();
        System.out.println(num+10);

    }
}
