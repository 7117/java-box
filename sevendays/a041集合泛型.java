package sevendays;

import java.util.ArrayList;

public class a041集合泛型 {
    public static void main(String[] args) {
        //ArrayList使用对象泛型
        ArrayList<Person6> list = new ArrayList<Person6>();
        list.add(new Person6());
        list.add(new Person6());
        list.add(new Person6());
        System.out.println(list);
        list.get(0).testPerson();

        //ArrayList使用字符串泛型
        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("a");
        list1.add("a");
        System.out.println(list1);


    }
}

class Person6 {
    public void testPerson() {
        System.out.println("testPerson");
    }
}

