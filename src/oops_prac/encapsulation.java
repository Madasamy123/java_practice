package oops_prac;

// Encapsulation using private variables and public methods
class Employee {
    private int empId;     // Private variable
    private String name;   // Private variable

    // Setter methods (to set values)
    public void setId(int id) {
        this.empId = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter methods (to get values)
    public int getId() {
        return empId;
    }

    public String getName() {
        return name;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        Employee emp = new Employee();  // Creating object

        // Setting values using setter methods
        emp.setId(105);
        emp.setName("maddy");

        // Getting values using getter methods
        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
    }
}



