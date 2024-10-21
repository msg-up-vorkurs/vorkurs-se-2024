package solution;

/*
 * TODO Aufgabe 2: Für die Zubereitung von 12 Schokoladenkekse werden 250g Butter, 350g Zucker, 210g Mehl,
 *  150g Schokolade und 2 Eier benötigt. Es soll ein Programm erstellt werden, das die Kosten für die benötigten
 *  Zutaten berechnet und ausgibt (für die Gesamtmenge und pro Keks).
 */
public class RecipeCostCalculator {
    public static void main(String[] args) {

        // Preis pro Kilo
        double butterPrice = 9.56;
        double sugarPrice = 0.79;
        double flourPrice = 2.30;
        double chocolatePrice = 12.9;

        // Preis pro 6er Pack
        double eggPrice = 1.99;

        // TODO Aufgabe 2a: Variablen für die Mengenangaben anlegen
        int portions = 12;
        double butter = 0.250;
        double sugar = 0.350;
        double flour = 0.210;
        double chocolate = 0.150;
        int egg = 2;

        // TODO Aufgabe 2b: Gesamt- und Stückpreis für das Rezept berechnen
        double recipePrice = butter * butterPrice
                + sugar * sugarPrice
                + egg * (eggPrice / 6)
                + flour * flourPrice
                + chocolate * chocolatePrice;
        double portionPrice = recipePrice / portions;

        // TODO Aufgabe 2c: Ausgabe der berechneten Preise
        System.out.println("Gesamtpreis: " + recipePrice);
        System.out.println("Portionspreis: " + portionPrice);
    }
}
