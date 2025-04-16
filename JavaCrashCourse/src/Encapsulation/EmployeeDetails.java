package Encapsulation;

class Employee {
    // Private variable (encapsulation)
    private int salary;

    // Public method to set salary (Setter)
    public void setSalary(int amount) {
        salary = amount;
    }

    // Public method to show salary (Getter)
    public void showSalary() {
        System.out.println("Employee salary is: " + salary);
    }
}

public class EmployeeDetails {
    public static void main(String[] args) {
        Employee emp1 = new Employee();

        // emp1.salary = 50000; ❌ Not allowed - salary is private

        emp1.setSalary(50000);  // ✅ Allowed - using public method
        emp1.showSalary();      // Output: Employee salary is: 50000
    }
}
