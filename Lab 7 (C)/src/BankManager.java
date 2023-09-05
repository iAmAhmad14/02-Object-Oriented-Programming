public class BankManager {
    public static void main(String[] args) {
        // Create instances of different bank accounts
        CheckingAccount checkingAccount = new CheckingAccount("CHK123", 1000.0);
        SavingsAccount savingsAccount = new SavingsAccount("SAV456", 0.02);
        CertificateOfDeposit cdAccount = new CertificateOfDeposit("CD789", 12, 50.0);

        // Deposit some money into the accounts
        checkingAccount.deposit(500.0);
        savingsAccount.deposit(1000.0);
        cdAccount.deposit(2000.0);

        // Withdraw some money from the accounts
        checkingAccount.withdraw(1200.0);
        savingsAccount.withdraw(300.0);
        cdAccount.withdraw(1800.0);

        // Print the account details
        System.out.println("Checking Account - Account Number: " + checkingAccount.getAccountNumber() +
                ", Balance: " + checkingAccount.getBalance() +
                ", Overdraft Limit: " + checkingAccount.getOverdraftLimit());

        System.out.println("Savings Account - Account Number: " + savingsAccount.getAccountNumber() +
                ", Balance: " + savingsAccount.getBalance() +
                ", Interest Rate: " + savingsAccount.getInterestRate());

        System.out.println("Certificate of Deposit - Account Number: " + cdAccount.getAccountNumber() +
                ", Balance: " + cdAccount.getBalance() +
                ", Term (months): " + cdAccount.getTerm() +
                ", Penalty Amount: " + cdAccount.getPenaltyAmount());
    }
}
