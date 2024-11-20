package solution.aufgabe3;

public class Teacher extends Person {
    String discipline;

    public Teacher(int passNumber, String name, String surname, int age, float height, float weight, String discipline) {
        super(passNumber, name, surname, age, height, weight);
        this.discipline = discipline;
    }

    @Override
    void sayHello() {
        System.out.println("Hello, my name is " + this.name + " " + this.surname + " and I'm teaching " + this.discipline + ".");
    }

    void tellDiscipline() {
        System.out.println("I'm teaching " + this.discipline + "!");
    }
}
