package solution.aufgabe1;

public class Teacher extends Person {
    String discipline;

    public Teacher(int passNumber, String name, String surname, int age, float height, float weight, String discipline) {
        super(passNumber, name, surname, age, height, weight);
        this.discipline = discipline;
    }

    void tellDiscipline() {
        System.out.println("I'm teaching " + this.discipline + "!");
    }
}
