package solution.aufgabe1;

public class Student extends Person {
    String studyProgramme;
    int currentSemester;

    public Student(int passNumber, String name, String surname, int age, float height, float weight, String studyProgramme, int currentSemester) {
        super(passNumber, name, surname, age, height, weight);
        this.studyProgramme = studyProgramme;
        this.currentSemester = currentSemester;
    }

    void changeStudyProgramme(String studyProgramme) {
        this.studyProgramme = studyProgramme;
    }

    void advanceSemester() {
        this.currentSemester += 1;
    }
}
