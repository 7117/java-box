package sevendays;

public class a054类加载器 {
    public static void main(String[] args) {
        //类加载器
        //1.BootClassLoader 类加载器
        //2.PlatformClassLoader 平台类加载器
        //3.AppClassLoader  应用类加载器
        Class<Student> student = Student.class;
        ClassLoader classLoader = student.getClassLoader();
        System.out.println(classLoader.toString());

        //核心类库--》平台类库---》自己的类
        System.out.println(classLoader.getParent());

    }
}

class Student{

}