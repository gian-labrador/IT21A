package Midterm;

class Employee{

    String name;
    String employeeId;
    String salary;

    Employee(String name, String employeeId, String salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }
}

class Manager extends Employee {
    int department;

    Manager(String name, String employeeId, String salary, int department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    void displayInfo() {
        System.out.println("=== EMPLOYEE INFORMATION ===");
        System.out.println("Name: " + name + " Employee Id: " + employeeId + " Salary: " + salary);
    }

    void displayInfo1() {
        System.out.println("=== MANAGER INFORMATION ===");
        System.out.println("Name: " + name + " Employee Id: " + employeeId + " Salary: " + salary);
    }
}

public class LabradorEmployeeInheritance {
    public static void main(String[] args) {
        Employee myEmployee = new Employee("Labrador", "1234567", "100,000");
        Manager myManager = new Manager("Gian Labrador", "2025123456", "1,000,000", 1);

        myManager.displayInfo1();
        myEmployeeDisplayInfo(myEmployee);
    }

    static void myEmployeeDisplayInfo(Employee myEmployee) {
        System.out.println("=== EMPLOYEE INFORMATION ===");
        System.out.println("Name: " + myEmployee.name + " Employee Id: " + myEmployee.employeeId + " Salary: " + myEmployee.salary);
    }
}
