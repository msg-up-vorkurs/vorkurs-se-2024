package task;

public class BankAccount {

    int accountNumber;
    double balance;
    double overdraftLimit;

    public BankAccount(int accountNumber, double balance, double overdraftLimit) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
    }

    //  TODO Aufgabe 1:
    //  Methode "printInfo", soll Kontonummer und Kontostand auf der Konsole ausgeben



    //  TODO Aufgabe 2:
    //  Methode "deposit" soll einen beliebigen Betrag (angegeben durch den Parameter "amount") dem Konto gutschreiben



    //  TODO Aufgabe 3:
    //  Methode "withdraw" soll einen beliebigen Betrag (angegeben durch den Parameter "amount") vom Konto abbuchen



    //  TODO Aufgabe 4:
    //  Methode "transfer" soll einen Betrag von diesem Konto zu einem Zielkonto transferieren
    //  Welche Objekte und Werte werden für eine Überweisung benötigt?
    //  Welche Parameter braucht die Methode?
    //  Kann man bereits implementierte Methoden der Klasse nutzen?



    public static void main(String[] args) {

        BankAccount aliceAccount = new BankAccount(1, 18000.0, 2000.0);
        BankAccount bobAccount = new BankAccount(2, 10000.0, 0.0);

        // TODO Aufgabe 1-4: Ausführen der implementierten Methoden und Kontrollieren der Veränderungen mithilfe von printInfo()


    }
}