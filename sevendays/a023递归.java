package sevendays;

public class a023递归 {
    public static void main(String[] args) {
        //1+3+....+19
        int result = count(5);
        System.out.println(result);
    }

    public static int count(int num) {
        num = num % 2 == 0 ? num - 1 : num;
        if (num == 1) {
            return 1;
        } else {
            return num + count(num - 2);
        }
    }

    /*
     *1. private : 私有的, 同一个类中可以使用
     *2. (default) : 默认权限, 当不设定任何权限时，JVM会默认提供权限，包(路径)权限
     *3. protected : 受保护的权限, 子类可以访问
     *4. public : 公共的, 任意使用
     */
}

