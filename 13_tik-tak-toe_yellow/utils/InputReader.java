package utils;

import java.util.Scanner;

public class InputReader {

    private Scanner in = new Scanner(System.in);

    public Move requestMove(char player) {
        System.out.println("Jetzt bist du am Zug, Spieler " + player + ".");
        System.out.println("Eingabe: ");

        Move move = null;
        boolean invalidInput;
        do {
            try {
                invalidInput = false;
                String inputString = in.nextLine();
                move = parseMove(player, inputString);
            } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
                invalidInput = true;
            }

            if (invalidInput) {
                System.out.println("Deine Eingabe war ungültig!");
                System.out.println("Die zwei Koordinaten (Wertebereich [0,2]) müssen von einem Komma getrennt werden z.B. '1,2'.");
                System.out.println("Bitte versuche es erneut.");
            }
        } while (invalidInput);

        return move;
    }

    private Move parseMove(char player, String input) {
        String[] inputs = input.split(",");

        return new Move(player,
                parseIntAndCheckRange(inputs[0]),
                parseIntAndCheckRange(inputs[1]));
    }

    private int parseIntAndCheckRange(String input) {
        int value = Integer.parseInt(input.trim());
        if (value < 0 || value >= 3) {
            throw new IllegalArgumentException("Ungültiger Koordinatenwert.");
        }

        return value;
    }
}
