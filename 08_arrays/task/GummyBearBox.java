package task;

import java.util.Stack;

public class GummyBearBox {
    private final Stack<GummyBear> sweets = new Stack<>();

    public GummyBearBox(int capacity) {
        for (int i = 0; i < capacity; i++) {
            sweets.push(new GummyBear());
        }
    }

    public boolean isEmpty() {
        return sweets.isEmpty();
    }

    public GummyBear takeSweet() {
        return sweets.pop();
    }
}

