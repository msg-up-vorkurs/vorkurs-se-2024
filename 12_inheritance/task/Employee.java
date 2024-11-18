package task;

public class Employee {
    int passNumber;
    String name;
    String surname;
    int age;
    float height;
    float weight;

    int employeeId;
    String division;
    double salary;

    public Employee(int passNumber, String name, String surname, int age, float height, float weight, int employeeId, String division, double salary) {
        this.passNumber = passNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;

        this.employeeId = employeeId;
        this.division = division;
        this.salary = salary;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + this.name + " " + this.surname);
    }

    // TODO Aufgabe 2: Nachdem Sie Vererbung implementiert haben: Gibt es eine Möglichkeit, die folgenden 4 Methoden zu vereinfachen?
    void sayHelloTo(Person other) {
        System.out.println("Hello, " + other.name + "! My name is " + this.name + ".");
    }

    void sayHelloTo(Employee other) {
        System.out.println("Hello, " + other.name + "! My name is " + this.name + ".");
    }

    void sayHelloTo(Student other) {
        System.out.println("Hello, " + other.name + "! My name is " + this.name + ".");
    }

    void sayHelloTo(Teacher other) {
        System.out.println("Hello, " + other.name + "! My name is " + this.name + ".");
    }

    void celebrateBirthday() {
        this.age = this.age + 1;
    }

    float calculateBMI() {
        return this.weight / (this.height * this.height);
    }

    float heightInInch() {
        return this.height * 39.3700787F;
    }

    void changeDivision(String division) {
        this.division = division;
    }

    void raiseSalary(double raise) {
        this.salary = this.salary + raise;
    }
}
