class Calculator{

    int add(int a,int b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
    int add(int a, int b,int c){
        return a+b+c;
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class polymorphismDemo {
    public static void main(String[] args) {
        Calculator cal=new Calculator();
        System.out.println(cal.add(1,2));
        System.out.println(cal.add(1,2,3));
        System.out.println(cal.add(10.5,12.6));


        Animal a1=new Dog();
        Animal a2=new Cat();

        a1.sound();
        a2.sound();

    }
}