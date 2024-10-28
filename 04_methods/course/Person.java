package course;

public class Person {

    String firstName;
    String lastName;
    int age;
    double height;
    double weight;

    public Person(String firstName, String lastName, int age, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + this.fullName() + " and I am " + this.age + " years old.");
    }

    String fullName() {
        return this.firstName + " " + this.lastName;
    }

    void sayHelloTo(String somebody) {
        System.out.println("Hello " + somebody + ", I am " + this.fullName());
    }

    void sayHelloTo(Person other) {
        System.out.println("Hello " + other.fullName() + ", I am " + this.fullName());
    }

    double calculateBMI() {
        return this.weight / (this.height * this.height);
    }

    double heightInInch() {
        return this.height * 39.3700787;
    }

    void celebrateBirthday() {
        this.age = this.age + 1;
    }

    boolean isOlderThan(int years) {
        return this.age > years;
    }

    public static void main(String[] args) {

        Person bob = new Person("Bob", "Doe", 26, 1.78, 75.0);
        Person alice = new Person("Alice", "Doe", 28, 1.65, 55.0);

        /*
         * Methodenaufruf
         * [Objekt].[Methode]([Parameter, ...]);
         */

        bob.sayHello();
        System.out.println(bob.fullName());

        alice.sayHelloTo("John");
        bob.sayHelloTo(alice);

        System.out.println("BMI of Bob: " + bob.calculateBMI());
        System.out.println("BMI of Alice: " + alice.calculateBMI());

        System.out.println("Bob's height: " + bob.heightInInch() + " in");

        System.out.println("Bob's age: " + bob.age);
        bob.celebrateBirthday();
        System.out.println("Bob's age after birthday: " + bob.age);

        System.out.println("Is Bob an adult?: " + bob.isOlderThan(18));

    }
}
