class Employee {
    String name;
    int id;
    static int employeeCount = 0;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    static void displayCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class Main17 {
    public static void main(String[] args) {
        Employee e1 = new Employee("Amit", 1);
        Employee e2 = new Employee("Neha", 2);
        Employee e3 = new Employee("Rahul", 3);

        Employee.displayCount();
    }
}