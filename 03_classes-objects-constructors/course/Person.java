package course;

/*
/ Klassendefinition
/ class [Klassenname]{}
 */

public class Person {

    String firstName;
    String lastName;
    short age;

    public Person() {
    }

    public Person(String firstName, String lastName, short age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {

        /*
         * Erzeugen von Objekten
         * [Klassenname] [Objektname] = new [Konstruktor];
         */

        Person bob = new Person();

        /*
         * Auf Instanzvariablen zugreifen
         * [Objektname].[Attributname]
         */

        System.out.println(bob.firstName + " " + bob.lastName + ", " + bob.age);

        bob.firstName = "Bob";
        bob.lastName = "Doe";
        bob.age = 26;
        System.out.println(bob.firstName + " " + bob.lastName + ", " + bob.age);

        Person alice = new Person();
        alice.firstName = "Alice";
        alice.lastName = "Doe";
        alice.age = 28;
        System.out.println(alice.firstName + " " + alice.lastName + ", " + alice.age);

    }
}
