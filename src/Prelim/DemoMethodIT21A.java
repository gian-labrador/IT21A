
package Prelim;
import java.util.Scanner;
public class DemoMethodIT21A {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();
        
        System.out.println("Enter your age: ");
        int age = input.nextInt();
        
        System.out.println("Enter your birth year: ");
        int birthYear = input.nextInt();
        int currentYear = 2026;
        int calculateAge = currentYear - birthYear;
        
        System.out.println("\nChoose your favorite pet:(In numbers)");
        System.out.println("1. Dragon");
        System.out.println("2. Shark");
        System.out.println("3. Dinosaur");
        System.out.println("4. Best Friend");
        System.out.print("Enter your choice: ");
        int petChoice = input.nextInt();

        String pet;
        switch (petChoice) { 
        case 1: pet = "Dragon";
            break; 
        case 2: pet = "Shark";
            break; 
        case 3: pet = "Dinosaur";
            break; 
        case 4: pet = "your Best Friend";
            break; 
        default: pet = "UwU!";
            break;
    }
        System.out.print("\nHi, I am " + name);
        System.out.println(" I am " + age + " years old. ");
        System.out.print("Based on your year, your age is " + calculateAge + ", ");

        if (age == calculateAge) {
            System.out.println("so you're honest!");
        } else {
            System.out.println("Shibal! bakakon ka!");
        }   
        System.out.print("and your favorite pet is " + pet + ".");
        
    }
}