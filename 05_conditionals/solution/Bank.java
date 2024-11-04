package solution;

public class Bank {

    /*
     * TODO Aufgabe 2: rateCredit, soll Kreditanträge anhand von einfachen Regeln auswerten
     * Für die Annahme eines Antrags muss folgendes gelten:
     *  die antragstellende Person einen Wohnsitz in Deutschland angemeldet haben, volljährig sein und über ein geregeltes Einkommen verfügen
     *  zusätzlich muss eine Bonitätsbewertung von mindestens 70 vorliegen
     *  ab einer Kreditsumme von über 100.000€ darf die Bewertung nicht unter 80 liegen
     *
     * rateCredit kann durch Ausführen von BankTest überprüft werden
     *
     * Erweiterungsregel:
     *  Ab dem frühestmöglichen Renteneintrittsalter (hier vereinfacht das 63. Lebensjahr) wird zusätzlich eine
     *  Sicherheit gefordert, die mindestens der Kreditsumme entspricht, um einen Kredit zu erhalten.
     *
     * residence: 'D' für Deutschland
     */
    boolean rateCredit(char residence, int age, boolean regularIncome, int creditScore, double creditAmount, double creditCollateral) {

        if (residence == 'D' & age >= 18 & regularIncome) {
            if (age < 63 | creditAmount <= creditCollateral) {
                if (creditScore >= 80) {
                    return true;
                } else if (creditScore >= 70 & creditAmount <= 100000) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        } else {
            return false;
        }

        // Alternativ auch ohne Verschachtelung
//        if (residence == 'D' & age >= 18 & regularIncome
//                & (age < 63 | creditAmount <= creditCollateral)
//                & (creditScore >= 80 | (creditScore >= 70 & creditAmount <= 100000))) {
//            return true;
//        } else {
//            return false;
//        }
    }

}
