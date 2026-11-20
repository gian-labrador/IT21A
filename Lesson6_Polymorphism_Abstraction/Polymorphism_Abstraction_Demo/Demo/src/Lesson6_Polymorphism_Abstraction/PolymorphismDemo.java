
package Lesson6_Polymorphism_Abstraction;

class Animal {
    
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

class Dog extends Animal {
    
    @Override
    void makeSound() {
        System.out.println("Dog sounds: Woof Woof!");
    }
}

class Cat extends Animal {
    
    @Override
    void makeSound() {
        System.out.println("Cat sounds: Meow Meow!");
    }
}
public class PolymorphismDemo {
    
    public static void main(String[] args) {
        
        Animal animal1 = new Dog();
        Animal animal2 = new Cat();
        
        System.out.println("POLYMORPHISM DEMO");
        
        animal1.makeSound();
        animal2.makeSound();
    }
    
}
