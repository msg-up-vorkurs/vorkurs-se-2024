package solution.aufgabe3;

public class Student extends Person {
    String studyProgramme;
    int currentSemester;

    public Student(int passNumber, String name, String surname, int age, float height, float weight, String studyProgramme, int currentSemester) {
        super(passNumber, name, surname, age, height, weight);
        this.studyProgramme = studyProgramme;
        this.currentSemester = currentSemester;
    }

    @Override
    void sayHello() {
        System.out.println("Hello, my name is " + this.name + " " + this.surname + " and I'm studying " + this.studyProgramme + ".");
    }

    void changeStudyProgramme(String studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

    void advanceSemester() {
        this.currentSemester += 1;
    }
}
