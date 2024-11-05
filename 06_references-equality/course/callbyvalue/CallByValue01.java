package course.callbyvalue;

public class CallByValue01 {

    public static void main(String[] args) {

        int year = 2023;
        System.out.println("Year: " + year);

        nextYear(year);

        System.out.println("Year: " + year);
    }

    public static void nextYear(int year) {
        year = year + 1;
        System.out.println(">> Next year: " + year);
    }
}
