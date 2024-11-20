package solution.aufgabe3;

public class Employee extends Person {
    int employeeId;
    String division;
    double salary;

    public Employee(int passNumber, String name, String surname, int age, float height, float weight, int employeeId, String division, double salary) {
        super(passNumber, name, surname, age, height, weight);
        this.employeeId = employeeId;
        this.division = division;
        this.salary = salary;
    }

    @Override
    void sayHello() {
        System.out.println("Hello, my name is " + this.name + " " + this.surname + " and I'm working in " + this.division + ".");
    }

    void changeDivision(String division) {
        this.division = division;
    }

    void raiseSalary(double raise) {
        this.salary = this.salary + raise;
    }
}
