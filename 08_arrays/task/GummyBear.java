package task;

import java.util.Random;

public class GummyBear {
    private static final Random random = new Random();
    static String[] colors = {"WHITE", "RED", "ORANGE", "GREEN"};

    String color;

    public GummyBear() {
        int index = random.nextInt(0, colors.length);
        color = colors[index];
    }

    public String getColor() {
        return color;
    }
}
