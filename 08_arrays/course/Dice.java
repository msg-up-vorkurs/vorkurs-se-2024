package course;

import java.util.Random;

public class Dice {

    static Random random = new Random();

    /**
     * Produces a randomly generated number.
     * @return A number between 1 and 6.
     */
    public static int roll() {
        return random.nextInt(1, 7);
    }
}
