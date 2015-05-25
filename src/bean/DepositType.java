package bean;

/**
 * @author Maral Khojasteh
 */
public abstract class DepositType {
    protected Double interestRate;

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }
}
