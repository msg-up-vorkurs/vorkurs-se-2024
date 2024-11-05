package course.equality;

public class Equality03 {

    public static void main(String[] args) {

        String hello1 = new String("Hello!");
        String hello2 = new String("Hello!");

        if (hello1 == hello2) {
            System.out.println("Same string.");
        } else {
            System.out.println("Different strings.");
        }
    }
}
