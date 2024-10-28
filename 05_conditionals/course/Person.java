package course;

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
        return this.weight / (this.height*this.height);
    }

    public static void main(String[] args) {

    }
}
