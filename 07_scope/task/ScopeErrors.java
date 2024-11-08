package task;

public class ScopeErrors {

    int zahl = 100;

    String variable = "Das hier soll ausgegeben werden!";

    /**
     * TODO Aufgabe 1:
     * a) Korrigiere die Methode, sodass die Variable 'message' ausgegeben wird
     * b) Gib mithilfe von Aufgabe 1a 'Die Zahl ist kleiner als 100' aus! --> main
     **/
    void task1(int zahl) {
        String message;
        if (zahl < 100) {
            message = "Die Zahl ist kleiner als 100!";
        } else {
            message = "Die Zahl ist größer gleich 100!";
        }

        System.out.println(message);
    }

    /**
     * TODO Aufgabe 2:
     * Korrigiere die Methode, sodass die Instanzvariable 'variable' ausgegeben wird
     **/
    void task2() {
        String variable = "Das hier soll nicht ausgegeben werden!";
        System.out.println(this.variable);
    }

    /**
     * TODO Aufgabe 3:
     * a) Lies dir die Methode durch. Was wird ausgegeben?
     * b) Setze geeignete Breakpoints und debugge die Methode, um deine Vermutung zu verifizieren!
     **/
    void task3() {

        int a = 10;
        int b = a + zahl;

        int zahl = 10;

        int ergebnis = b + zahl;

        System.out.println(ergebnis); // Ausgabe: 120
    }

    public static void main(String[] args) {
        ScopeErrors serr = new ScopeErrors();
        serr.task1(50);
        serr.task2();
        serr.task3();
    }
}
