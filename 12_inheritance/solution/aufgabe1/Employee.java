package solution.aufgabe1;

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

    void changeDivision(String division) {
        this.division = division;
    }

    void raiseSalary(double raise) {
        this.salary = this.salary + raise;
    }
}
