package solution;

import task.GummyBear;
import task.GummyBearBox;

public class LoopTask {
    public static void main(String[] args) {
        System.out.println(forEachTask());
        System.out.println(forTask());
        System.out.println(whileTask());

        whileGummyBears();
    }

    public static double forEachTask() {
        double[] numbers = {20.0, 16.6, 13.3, 5.0, 0.1, 99.9};

        double sum = 0.0;

        for (double number : numbers) {
            sum = sum + number;
        }

        return sum / numbers.length;
    }

    public static double forTask() {
        double[] numbers = {20.0, 16.6, 13.3, 5.0, 0.1, 99.9};

        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }

        return sum / numbers.length;
    }

    public static double whileTask() {
        double[] numbers = {20.0, 16.6, 13.3, 5.0, 0.1, 99.9};

        int index = 0;
        double sum = 0.0;

        while (index < numbers.length) {
            sum = sum + numbers[index];

            index = index + 1;
        }

        return sum / numbers.length;
    }

    public static void whileGummyBears() {
        GummyBearBox gummyBox = new GummyBearBox(200);
        int taken = 0;

        while (!gummyBox.isEmpty()) {
            GummyBear bear = gummyBox.takeSweet();
            taken = taken + 1;

            System.out.println("Gummibärchen ist: " + bear.getColor());
            System.out.println("Aktuell entnommen: " + taken);
        }
    }
}
