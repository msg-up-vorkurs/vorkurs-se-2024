package solution;

public class BankAccount {

    int accountNumber;
    double balance;
    double overdraftLimit;

    public BankAccount(int accountNumber, double balance, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    void printInfo() {
        System.out.println("Accountnumber: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println("-----------------------");
    }


    void deposit(double amount) {
        this.balance = this.balance + amount;
    }

    void withdraw(double amount) {
        this.balance = this.balance - amount;
    }

    void transfer(double amount, BankAccount to) {
        this.withdraw(amount);
        to.deposit(amount);
    }

    /*
     * TODO Aufgabe 1a: calculateWithdrawlimit
     * Für das Auszahlungslimit wird sowohl der Kontostand als auch das Kreditlimit berücksichtigt
     */

    double calculateWithdrawLimit() {
        return this.balance + this.overdraftLimit;
    }

    /*
     * TODO Aufgabe 1b: transferChecked
     * Vor jeder Überweisung soll sichergestellt werden,
     * ob der Betrag unter Einhaltung des Kreditlimits abgebucht werden kann.
     */

    void transferChecked(double amount, BankAccount to) {
        if (this.calculateWithdrawLimit() >= amount) {
            this.transfer(amount, to);
        } else {
            System.out.println("Überweisung fehlgeschlagen: Konto nicht ausreichend gedeckt.");
        }
    }

    /*
     * TODO Aufgabe 3: Währungskonvertierung
     * Ein Bankkonto ist in mehreren Währungsregionen gültig. Um einen besseren Überblick über die Preise im Ausland
     * zu bekommen, soll der Kontostand in verschiedene ausländische Währungen umgerechnet werden können.
     * Die Währung des Kontos liegt derzeit in "Euro" vor.
     *
     * Implementieren Sie eine Methode `public double convertCurrency(String targetCurrency)`.
     * Diese Methode akzeptiert einen String, welcher die Zielwährung definiert.
     * Die folgenden Wechselkurse sollen unterstützt werden:
     *
     * |   Währung   |   Wechselkurs      |
     * |-------------|--------------------|
     * | USD         | 1 EUR = 1,05 USD   |
     * | NOK         | 1 EUR = 11,49 NOK  |
     * | LIRA        | 1 EUR = 29,17 LIRA |
     * | PESO        | 1 EUR = 19,24 PESO |
     *
     * Verwenden Sie für die Implementierung ein `switch`-Konstrukt. Bei Angabe einer nicht-aufgelisteten Währung soll
     * eine Fehlermeldung angezeigt werden. Die Funktion soll dann `-1` als Wert zurückgeben.
     *
     * Bonusaufgabe: Implementieren Sie die gleiche Funktion unter Verwendung einer switch-Expression.
     */

    public double convertCurrency(String targetCurrency) {
        switch (targetCurrency) {
            case "USD":
                return this.balance * 1.05;
            case "NOK":
                return this.balance * 11.49;
            case "LIRA":
                return this.balance * 29.17;
            case "PESO":
                return this.balance * 19.24;
            default:
                System.out.println("FEHLER: Währung unbekannt!");
                return -1;
        }
    }

    public double convertCurrencyExpression(String targetCurrency) {
        return switch (targetCurrency) {
            case "USD" -> this.balance * 1.05;
            case "NOK" -> this.balance * 11.49;
            case "LIRA" -> this.balance * 29.17;
            case "PESO" -> this.balance * 19.24;
            default -> {
                System.out.println("FEHLER: Währung unbekannt!");
                yield -1;
            }
        };
    }
}
