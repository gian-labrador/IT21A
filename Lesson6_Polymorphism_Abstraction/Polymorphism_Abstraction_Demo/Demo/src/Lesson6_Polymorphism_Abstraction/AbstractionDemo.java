
package Lesson6_Polymorphism_Abstraction;

abstract class Vehicle {
    
    abstract void startEngine();
    
    void displayMessage() {
        System.out.println("Starting the vehicle...");
    }
}

class Car extends Vehicle {
    
    @Override
    void startEngine() {
        System.out.println("Car engine starts with a key.");
    }
}

class Motorcycle extends Vehicle {
    
    @Override
    void startEngine() {
        System.out.println("Motorcycle engine starts with a button.");
    }
}
public class AbstractionDemo {
    
    public static void main(String[] args) {
        
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();
        
        System.out.println("ABSTRACTION DEMO");
        
        car.displayMessage();
        car.startEngine();
        
        motorcycle.displayMessage();
        motorcycle.startEngine();
    }
    
}
