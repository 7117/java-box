package sevendays;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class a055反射练习 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class<Emp> empClass = Emp.class;
        Constructor c = empClass.getDeclaredConstructor();
        Object emp = c.newInstance();

        Field account = empClass.getField("account");
        Field password = empClass.getField("password");
        //属性赋值
        account.set(emp,"22");
        password.set(emp,"222");

        Method login = empClass.getMethod("login");
        Object invoke = login.invoke(emp);
        System.out.println(invoke);
    }
}

class Emp {
    public String account;
    public String password;

    public boolean login() {
        if ("admin" == account && "admin" == password) {
            return true;
        } else {
            return false;
        }
    }
}

//