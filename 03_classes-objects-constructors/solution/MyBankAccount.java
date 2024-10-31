package solution;

public class MyBankAccount {

    int accountNumber;
    double balance;
    double overdraftLimit;
    double monthlyFee;
    double interestRate;

    public MyBankAccount(int accountNumber, double balance, double overdraftLimit, double monthlyFee, double interestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.overdraftLimit = overdraftLimit;
        this.monthlyFee = monthlyFee;
        this.interestRate = interestRate;
    }

    public static void main(String[] args) {
        MyBankAccount account = new MyBankAccount(1, 1000.0, 2000.0, 0.99, 0.005);
        System.out.println("Account number: " + account.accountNumber);
        System.out.println("Balance: " + account.balance);
        System.out.println("Overdraft limit: " + account.overdraftLimit);
        System.out.println("Monthly fee: " + account.monthlyFee);
        System.out.println("Interest rate: " + account.interestRate);
    }

}
