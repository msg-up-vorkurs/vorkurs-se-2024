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

    //  TODO Aufgabe 1:
    //  Methode "printInfo", soll Kontonummer und Kontostand auf der Konsole ausgeben

    void printInfo() {
        System.out.println("AccountNumber: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println("-----------------------");
    }


    //  TODO Aufgabe 2:
    //  Methode "deposit" soll einen beliebigen Betrag (angegeben durch den Parameter "amount") dem Konto gutschreiben

    void deposit(double amount) {
        this.balance = this.balance + amount;
    }


    //  TODO Aufgabe 3:
    //  Methode "withdraw" soll einen beliebigen Betrag (angegeben durch den Parameter "amount") vom Konto abbuchen

    void withdraw(double amount) {
        this.balance = this.balance - amount;
    }


    //  TODO Aufgabe 4:
    //  Methode "transfer" soll einen Betrag von diesem Konto zu einem Zielkonto transferieren
    //  Welche Objekte und Wertewerden für eine Überweisung benötigt?
    //  Welche Parameter braucht die Methode?
    //  Kann man bereits implementierte Methoden der Klasse nutzen?

    void transfer(double amount, BankAccount to) {
        this.withdraw(amount);
        to.deposit(amount);
    }


    public static void main(String[] args) {

        BankAccount aliceAccount = new BankAccount(1, 18000.0, 2000.0);
        BankAccount bobAccount = new BankAccount(2, 10000.0, 0.0);

        // TODO Aufgabe 1-4: Ausführen der implementierten Methoden und Kontrollieren der Veränderungen mithilfe von printInfo()

        aliceAccount.printInfo();
        aliceAccount.withdraw(2000.0);
        aliceAccount.printInfo();

        bobAccount.printInfo();
        bobAccount.deposit(2000.0);
        bobAccount.printInfo();

        aliceAccount.transfer(2000.0, bobAccount);
        aliceAccount.printInfo();
        bobAccount.printInfo();

    }
}
