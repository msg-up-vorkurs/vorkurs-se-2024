package course;

public class Main {

    public static void main(String[] args) {

        int[] numbers = { 7, 3, 2, 10, 8, 1, 7, 4, 9, 5};

//        System.out.println(numbers[1]);

        // for-each
        for (int number : numbers){
            System.out.println(number);
        }

        // for
        for (int index = 0; index < numbers.length; index = index + 1){
            System.out.println("Die Zahl " + numbers[index] + " hat den Index " + index);
        }

        // while
        int result = 0;
        while (result != 6){
            result = Dice.roll();
            System.out.println("Ich habe die Zahl " + result + " gewürfelt");
        }

        System.out.println("---");

        // do-while
        result = 0;
        do {
            result = Dice.roll();
            System.out.println("Ich habe die Zahl " + result + " gewürfelt");

        } while(result != 6);



    }
}
