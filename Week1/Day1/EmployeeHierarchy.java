class Employee{
    String name;
    Employee(String name){
        this.name=name;
    }
    void work(){
        System.out.println(name+" is working");
    }

}

class Developer extends Employee{
    Developer(String name){
        super(name);
    }

    void code(){
        System.out.println(name+" is writing code");
    }
}

class Tester extends Employee{
    Tester(String name){
        super(name);
    }

    void test(){
        System.out.println(name + " is Testing the application");
    }
}

public class EmployeeHierarchy {
    public static void main(String[] args) {
        Developer dev= new Developer("Rahul");
        Tester Test= new Tester("Saaqib");

        dev.work();
        Test.work();

        dev.code();
        Test.test();
    }
}