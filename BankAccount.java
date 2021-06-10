import java.util.Random;
import java.lang.Math;
public class BankAccount {

    private String accountNumber;
    private double checkingBalance;
    private double savingsBalance;
    public static int numberOfAccounts = 0;
    public static double total = 0;

    public BankAccount (double checkingBalance, double savingsBalance) {
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
        total += checkingBalance + savingsBalance;
        this.accountNumber = this.generateAccount();
    }

    private String generateAccount () {

        long number = (long) Math.floor(Math.random() * 9000000000L) + 1000000000L;
        String rand10 = number + "";
        return rand10; 
    }

    public double getCheckingBalance() {
        return checkingBalance;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void depositMoney (String checkingOrSavings, double deposit) {
        if(checkingOrSavings == "checking") {
            this.checkingBalance += deposit;
        } else {
            this.savingsBalance += deposit;
        }
        total += deposit;
    }

    public void withdrawMoney (String checkingOrSavings, double withdrawal) {
        if(checkingOrSavings == "checking" && withdrawal < checkingBalance) {
            this.checkingBalance -= withdrawal;
        }
        else if (checkingOrSavings == "savings" && withdrawal < savingsBalance){
            this.savingsBalance -= withdrawal;
        } else {
            System.out.println("Insufficient funds, your withdrawal failed.");
        }
        total -= withdrawal;
    }

    public void seeTotal () {
        double accountTotal = checkingBalance + savingsBalance;
        System.out.println(accountTotal);
    }

    public void seeNumberOfAccounts () {
        System.out.println(numberOfAccounts);
    }

}