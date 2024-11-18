package course;

public class GenericMain1Demo {
    public static void main(String[] args) {
        Integer[] inputIntegerArray = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
        String[] inputStringArray = {"Hallo!", "Hello!", "¡Hola!", "Salut!"};

        GenericMethodDemo demo = new GenericMethodDemo();
        int firstInteger = demo.getFirstElementFromIntegerArray(inputIntegerArray);
        System.out.println(firstInteger);
        // Neue Methode in GenericMethodDemo für String implementieren
        String firstString = demo.getFirstElementFromStringArray(inputStringArray);
        System.out.println(firstString);

        // Eine Methode für beide Datentypen
        firstInteger = demo.getFirstElementFromArray(inputIntegerArray);
        firstString = demo.getFirstElementFromArray(inputStringArray);

        System.out.println(firstInteger);
        System.out.println(firstString);
    }
}