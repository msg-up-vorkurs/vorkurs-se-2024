package task;

public class Teacher {
    int passNumber;
    String name;
    String surname;
    int age;
    float height;
    float weight;

    String discipline;

    public Teacher(int passNumber, String name, String surname, int age, float height, float weight, String discipline) {
        this.passNumber = passNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.discipline = discipline;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + this.name + " " + this.surname);
    }

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

    void tellDiscipline() {
        System.out.println("I'm teaching " + this.discipline + "!");
    }
}
