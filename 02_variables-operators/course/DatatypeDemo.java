package course;

public class DatatypeDemo {
    public static void main(String[] args) {

        /*
         * Basis-Datentypen
         *
         * boolean: true or false
         * byte: 	-128 bis 127
         * short:	-32.768 bis 32.767
         * int:     -2.147.483.648 bis 2.147.483.647
         * long:    −9.223.372.036.854.775.808 bis 9.223.372.036.854.775.807
         * float:	32-bit Gleitkommazahl (ca. 7 Ziffern)
         * double:	64-bit Gleitkommazahl (ca. 15 Ziffern)
         * char:	Repräsentiert ein einzelnes 16-bit Unicode Zeichen
         * String:  Zeichenketten
         */

        /*
         * Deklaration einer Variable
         * [Datentyp] [Variablenname];
         * Variablennamen:
         *   sind case-sensitive (age, Age, aGe sind verschiedene Variablen)
         *   dürfen keine Leerzeichen enthalten
         *   dürfen keine Java Schlüsselwörter sein (z.B. boolean, byte, short, ..., final, public, static, ...)
         */

        boolean isNiceWeather;
        short age;
        long population;
        double price;
        String name;

        /*
         * Initialisierung / Wertzuweisungen
         * [Variablenname] = [Wert];
         */

        age = 26;
        population = 7868872451L;
        price = 3.99;
        name = "John";
        float temperature = 21.5F;
        char currency = '€';

        isNiceWeather = true;
        System.out.println("Initial weather: " + isNiceWeather);
        isNiceWeather = false;
        System.out.println("Weather after reassigning: " + isNiceWeather);

        System.out.println("Age: " + age);
        System.out.println("Population: " + population);
        System.out.println("Price: " + price);
        System.out.println("Name: " + name);
        System.out.println("Temperature: " + temperature);
        System.out.println("Currency: " + currency);

        /*
         * Arithmetische Operatoren
         * +, -, *, /, % (Modulo)
         */

        int sum = 1 + 1;
        System.out.println("Sum: " + sum);
        int product = 5 * 5;
        System.out.println("Product: " + product);

        double gradeMath = 2.5;
        double gradeGerman = 4.0;
        double gradeEnglish = 1.6;
        double gradeAverage = (gradeMath + gradeEnglish + gradeGerman) / 3;
        System.out.println("My grade average: " + gradeAverage);

        int dayOfMonth = 21;
        System.out.println("Today: " + dayOfMonth);
        dayOfMonth++;
        System.out.println("Tomorrow: " + dayOfMonth);

        /*
         * String Konkatenation
         */

        String message = "Hello World!";
        String concatMessage = "Message: " + message;
        System.out.println(concatMessage);

        String myName = "John " + "Doe";
        System.out.println("My name is " + myName);
    }
}
