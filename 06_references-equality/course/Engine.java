package course;

public class Engine {

    private final int kilowatts;

    public Engine(int kilowatts) {
        this.kilowatts = kilowatts;
    }

    public void start() {
        System.out.println("Engine started... brrrrm...");
    }

    @Override
    public String toString() {
        return "Engine(" + this.kilowatts + " KW)";
    }
}
