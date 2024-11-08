package task;

public class Example {

    public static void main(String[] args) {
        // Erzeugen eines leeren Arrays
        int[] numbers = new int[3];

        // Erzeugen eines Arrays mit Werten via Initializer
        double[] decimals = {1.0, 2.0, 3.0};

        // Zugriff auf ein Element
        // Den 0-basierten Index nicht vergessen!
        System.out.println(numbers[0]);

        // Ändern eines Elements
        decimals[1] = 4.0;

        // Länge eines Arrays
        System.out.println("Länge von Numbers: " + numbers.length);

    }
}
