package sevendays;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class a053反射 {
    public static void main(String[] args) throws Exception {
        User53 User53 = new Child53();

        Class<? extends sevendays.User53> ClassVal = User53.getClass();
        System.out.println(ClassVal.getName());
        System.out.println(ClassVal.getSimpleName());
        System.out.println(ClassVal.getPackageName());
        System.out.println(ClassVal.getSuperclass());

        Class<?>[] interfaces = ClassVal.getInterfaces();
        System.out.println(Arrays.toString(interfaces));

        //public权限的
        Field aaas = ClassVal.getField("name");
        //所有的权限
        Field aaa1 = ClassVal.getDeclaredField("name");
        System.out.println(aaas);
        System.out.println(aaa1);

        //获取所有的方法
        Method method = ClassVal.getMethod("test2");
        Method method1 = ClassVal.getDeclaredMethod("test2");
        System.out.println(method);
        System.out.println(method1);

        //构造方法
        Constructor<? extends User53> constructor = ClassVal.getConstructor();
        Constructor<?>[] constructors = ClassVal.getConstructors();
        System.out.println("构造函数1："+constructor);
        System.out.println("构造函数2："+ClassVal.getDeclaredConstructor());
        System.out.println("构造函数3："+Arrays.toString(constructors));

        //多个修饰符
        int modifiers = ClassVal.getModifiers();
        System.out.println("权限的获取："+Modifier.isPrivate(modifiers));
    }
}
interface UsbInterface53 {
}

class User53  implements UsbInterface53 {
    public void test1() {
        System.out.println(" User53 test1...");
    }
}

class Child53 extends User53 {
    public String name;

    public Child53(){}

    public void test2() {
        System.out.println(" Child53 test2...");
    }
}