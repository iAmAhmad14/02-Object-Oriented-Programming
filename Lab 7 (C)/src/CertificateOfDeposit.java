public class CertificateOfDeposit extends BankAccount {
    private int term; // The term of the certificate in months
    private double penaltyAmount;

    public CertificateOfDeposit(String accountNumber, int term, double penaltyAmount) {
        super(accountNumber);
        this.term = term;
        this.penaltyAmount = penaltyAmount;
    }

    public int getTerm() {
        return term;
    }

    public double getPenaltyAmount() {
        return penaltyAmount;
    }

    // You can add additional methods specific to CertificateOfDeposit if needed
}
