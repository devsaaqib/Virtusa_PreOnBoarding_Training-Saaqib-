abstract class Device{
    abstract void start();

}

class Laptop extends Device{
    @Override
    void start() {
        System.out.println("Laptop is starting with operating system boot");
    }
}
class Mobile extends Device{
    @Override
    void start(){
        System.out.println("Mobile is starting with touch interaction");
    }

}

public class smartDevice {
    public static void main(String[] args) {
        Device d1 = new Laptop();
        Device d2 = new Mobile();

        d1.start();
        d2.start();
    }
}