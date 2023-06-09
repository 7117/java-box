package sevendays;

public class a019多态 {
    public static void main(String[] args) {
        //多态：一个对象在不同场景下表现出的不同形态
        //所归属于类的类型的拥有不同的方法
        Person p0 = new Person();
        p0.testPerson();
        //p1和p2是不同的归属类，所以拥有不同的形态
        Person p1 = new Boy();
        p1.testPerson();
        Boy p2 = new Boy();
        p2.testPerson();
        p2.testBoy();
    }
}

class Person {
    public void testPerson() {
        System.out.println("testPerson1");
    }
}

class Boy extends Person {

    public void testBoy(){
        System.out.println("testBoy1");
    }
}

