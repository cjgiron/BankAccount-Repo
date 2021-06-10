class BankAccountTest {

    public static void main (String[] args) {
        BankAccount myAccount = new BankAccount(50, 300);

        System.out.println(myAccount.getCheckingBalance());
        System.out.println(myAccount.getSavingsBalance());

        System.out.println(myAccount.getAccountNumber());

        myAccount.depositMoney("checking", 50);
        myAccount.depositMoney("savings", 100);
        System.out.println(myAccount.getCheckingBalance());
        System.out.println(myAccount.getSavingsBalance());

        myAccount.withdrawMoney("checking", 150);
        myAccount.withdrawMoney("savings", 50);
        System.out.println(myAccount.getCheckingBalance());
        System.out.println(myAccount.getSavingsBalance());

        myAccount.seeTotal();
        myAccount.seeNumberOfAccounts();
    }

}