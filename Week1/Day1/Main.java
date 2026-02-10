interface VehicleFeatures {
    void fuelType();
    
}
//Abstraction
abstract class Vehicle{
    // Encapsulation
    private String brand;

    Vehicle(String brand){
        this.brand =brand;
    }

    //Getter Method
    public String getBrand(){
        return brand;
    }

    //abstract method
    abstract void start();

    void Stop() {
        System.out.println("Vehicle Stopped");
    }
}

class Car extends Vehicle implements VehicleFeatures{

    Car(String brand){
        super(brand);
    }

    //Polymorphism
    @Override
    void start() {
        System.out.println(getBrand()+"Car starts with key");
    }

    @Override
    public void fuelType() {
        System.out.println("Car Uses Petrol");
    }


}

class ElectricBike extends Vehicle implements VehicleFeatures{
    ElectricBike(String brand){
        super(brand);
    }
    @Override
    void start() {
        System.out.println(getBrand()+" Electric bike starts silently");
    }

    public void fuelType(){
        System.out.println(getBrand()+" Runs in Electric");
        
    }


}

public class Main {
    public static void main (String args[]){
            // OBJECT CREATION
            Vehicle v1= new Car("Toyota");
            Vehicle v2= new ElectricBike("Ather");


            v1.start();
            v2.start();

            v1.Stop();
            v2.Stop();


            VehicleFeatures f1= new Car("Honda");
            VehicleFeatures f2= new ElectricBike("SimpleOne");

            f1.fuelType();
            f2.fuelType();
        }
    
}
