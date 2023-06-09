package sevendays;

public class a038异常抛出类 {
    public static void main(String[] args) throws Exception {
        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            throw new Exception("除数为0");
        }
    }
}
