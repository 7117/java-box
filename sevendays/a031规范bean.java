package sevendays;

public class a031规范bean {
    public static void main(String[] args) {
        User user = new User();
        user.account = "123";
        user.password = "123";
        System.out.println(login(user));
        ;
    }

    public static boolean login(User User) {
        return true;
    }
}

class User {
    public String account;
    public String password;
}

