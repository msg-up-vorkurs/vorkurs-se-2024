package solution;

public class Person {
    String name;
    String surname;
    int age;
    float height;
    float weight;

    public Person(String name, String surname, int age, float height, float weight) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    void sayHello() {
        System.out.println("Hello, my name is " + this.fullName() + " and I am " + this.age + " years old.");
    }

    String fullName() {
        return this.name + " " + this.surname;
    }


    float calculateBMI() {
        return this.weight / (this.height * this.height);
    }

    void printBMI() {
        float bmi = this.calculateBMI();

        if (bmi > 25.0f) {
            System.out.println("Übergewicht, BMI von " + bmi);
        } else if (bmi < 18.5F) {
            System.out.println("Untergewicht: BMI von " + bmi);
        } else {
            System.out.println("Normalgewicht: BMI von " + bmi);
        }
    }

    void printMayEnterFunFair() {
        if (this.age >= 18) {
            System.out.println("Ich darf den Jahrmarkt betreten");

            if (this.height >= 1.80f) {
                System.out.println("Ich darf auch mit Fahrgeschäften fahren");
            } else {
                System.out.println("Ich darf aber nicht mit Fahrgeschäften fahren");
            }

        } else {
            System.out.println("Ich darf den Jahrmarkt nicht betreten");
        }
    }

    public static void main(String[] args) {
        Person john = new Person("John", "Doe", 26, 1.86F, 92.0F);
        john.printBMI();
        Person alice = new Person("Alice", "Doe", 27, 1.75F, 56.0F);

        Person gregor = new Person("Gregor", "Doe", 17, 1.96F, 93.0F);
        alice.printBMI();
        gregor.printBMI();

        System.out.println("----");

        john.printMayEnterFunFair();
        alice.printMayEnterFunFair();
        gregor.printMayEnterFunFair();
    }
}
