package sevendays;

public class a029枚举 {
    public static void main(String[] args) {
        System.out.println(City.Beijing.name);
        System.out.println(City.Beijing.code);
        System.out.println(MyCity.Beijing.name);
        System.out.println(MyCity.Beijing.code);
    }
}

//自定义实现了enum类
class MyCity {
    public String name;
    public int code;

    private MyCity(String name, int code) {
        this.code = code;
        this.name = name;
    }

    public static final MyCity Beijing = new MyCity("北京", 1);
    public static final MyCity Shanghai = new MyCity("上海", 2);
}

enum City {
    Beijing("北京", 1), Shanghai("上海", 2);

    City(String name, int code) {
        this.code = code;
        this.name = name;
    }

    public String name;
    public int code;
}
