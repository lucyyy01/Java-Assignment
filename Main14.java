class Person {
    void role() {
        System.out.println("Person");
    }
}

class Employee extends Person {
    void role() {
        System.out.println("Employee");
    }
}

class Manager extends Employee {
    void role() {
        System.out.println("Manager");
    }
}

public class Main14 {
    public static void main(String[] args) {
        Person p;

        p = new Person();
        p.role();

        p = new Employee();
        p.role();

        p = new Manager();
        p.role();
    }
}