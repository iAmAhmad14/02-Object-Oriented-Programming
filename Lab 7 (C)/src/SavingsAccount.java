public class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double interestRate) {
        super(accountNumber);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    // You can add additional methods specific to SavingsAccount if needed
}
