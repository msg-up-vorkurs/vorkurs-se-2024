package solution;

public class VariablesTask {

    public static void main(String[] args) {

        /*
         * TODO Aufgabe 1a: Deklarieren und Initialisieren Sie Variablen für die Beschreibung eines Computers
         *  (Hersteller, Preis, Farbe, Lüfter, Arbeitsspeicher, etc.).
         */
        String manufacturer = "Apple";
        String color = "silver";
        float screenSize = 13.6F;
        byte coreCount = 8;
        byte ram = 24;
        short storage = 1024;
        boolean fan = false;
        double retailPrice = 2099.00;

        /*
         * TODO Aufgabe 1b: Ausgabe der Variablen
         *  z.B. System.out.println("Hersteller: " + manufacturer);
         */
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Color: " + color);
        System.out.println("Screen Size: " + screenSize + "\"");
        System.out.println("CPU-core count: " + coreCount);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Fan: " + fan);
        System.out.println("Retail price: " + retailPrice + ",-");
    }
}
