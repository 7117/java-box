package sevendays;

public class a028接口 {
    public static void main(String[] args) {
        Computer c = new Computer();
        c.powerSupply();
        Light l = new Light();
        l.powerReceive();
    }
}

interface UsbInterface {
}

interface UsbSupply extends UsbInterface53 {
    public void powerSupply();
}

interface UsbReceive extends UsbInterface53 {
    public void powerReceive();
}

class Computer implements UsbSupply {

    @Override
    public void powerSupply() {
        System.out.println("powerSupply");
    }
}

class Light implements UsbReceive {
    @Override
    public void powerReceive() {
        System.out.println("powerReceive");
    }
}
