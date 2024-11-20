package solution.aufgabe2;

public class Person {
    int passNumber;
    String name;
    String surname;
    int age;
    float height;
    float weight;

    public Person(int passNumber, String name, String surname, int age, float height, float weight) {
        this.passNumber = passNumber;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + this.name + " " + this.surname);
    }

    // Lösung Aufgabe 2: Da es sich nach Integrierung der Vererbung bei Employee, Teacher und Student um Kindklassen
    // von Person handelt, können diese auch wie Instanzen von "Person" gehandhabt werden.
    // Insofern können die sayHelloTo-Methoden mit den Parametern Employee, Teacher bzw. Student entfernt werden.
    void sayHelloTo(Person other) {
        System.out.println("Hello, " + other.name + "! My name is " + this.name + ".");
    }

    void celebrateBirthday() {
        this.age = this.age + 1;
    }

    float calculateBMI() {
        return this.weight / (this.height*this.height);
    }

    float heightInInch() {
        return this.height * 39.3700787F;
    }
}
