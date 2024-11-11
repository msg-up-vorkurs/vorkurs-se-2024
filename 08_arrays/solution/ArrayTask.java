package solution;

import task.BankAccount;

public class ArrayTask {

    public static void main(String[] args) {
        createArray();
        System.out.println(arrayAccess());
        arrayModification();
    }

    private static void createArray() {
        int[] numbers = {1, 42, 2012, 11};
        String[] strings = {"Hallo", "Welt", "das", "ist", "ein", "Test!"};

        BankAccount[] accounts = new BankAccount[3];
        accounts[0] = new BankAccount(39283, 1000.0, 1000.0);
        accounts[1] = new BankAccount(12345, 10000.0, 0.0);
        accounts[2] = new BankAccount(95493, 500.0, 1500.0);
    }

    private static double arrayAccess() {
        double[] numbers = {100.0, 52.0, 28.5, 40.2, 5.5};
        return (numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4]) / numbers.length;
    }

    private static void arrayModification() {
        String[] greeting = {"Hallo,", "mein", "Name", "ist", "Java", "!"}; // Nicht verändern!

        greeting[4] = "Daniel";

        System.out.println(String.join(" ", greeting)); // Nicht verändern!
    }
}
