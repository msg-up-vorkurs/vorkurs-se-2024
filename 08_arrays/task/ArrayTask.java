package task;

public class ArrayTask {

    public static void main(String[] args) {
        createArray();
        System.out.println(arrayAccess());
        arrayModification();
    }

    private static void createArray() {
        // TODO: Aufgabe 1: Erstelle mehrere Arrays.
    }

    private static double arrayAccess() {
        double[] numbers = {100.0, 52.0, 28.5, 40.2, 5.5};

        // TODO Aufgabe 2: Berechne den Durchschnitt aus den Zahlen im Array und gib diesen als Wert zurück!
        return 0.0;
    }

    private static void arrayModification() {
        String[] greeting = {"Hallo,", "mein", "Name", "ist", "Java", "!"}; // Nicht verändern!

        // TODO Aufgabe 3: Modifiziere den Namen im Array, sodass dein Name ausgegeben wird!

        System.out.println(String.join(" ", greeting)); // Nicht verändern!
    }
}
