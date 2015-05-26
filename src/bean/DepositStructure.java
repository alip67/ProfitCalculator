package bean;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class DepositStructure implements Comparable<DepositStructure> {
    protected String customerNumber;
    protected BigDecimal depositBalance;
    protected Integer durationInDays;
    protected DepositType depositType;
    protected BigDecimal payedInterest;

    public DepositStructure() {
    }

    public DepositStructure(String customerNumber, BigDecimal depositBalance, Integer durationInDays, DepositType depositType, BigDecimal payedInterest) {
        this.customerNumber = customerNumber;
        this.depositBalance = depositBalance;
        this.durationInDays = durationInDays;
        this.depositType = depositType;
        this.payedInterest = payedInterest;
    }

    public BigDecimal getPayedInterest() {
        return payedInterest;
    }

    public void setPayedInterest(BigDecimal payedInterest) {
        this.payedInterest = payedInterest;
    }

    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public BigDecimal getDepositBalance() {
        return depositBalance;
    }

    public void setDepositBalance(BigDecimal depositBalance) {
        this.depositBalance = depositBalance;
    }

    public Integer getDurationInDays() {
        return durationInDays;
    }

    public void setDurationInDays(Integer durationInDays) {
        this.durationInDays = durationInDays;
    }

    public DepositType getDepositType() {
        return depositType;
    }

    public void setDepositType(DepositType depositType) {
        this.depositType = depositType;
    }

    public BigDecimal calculateProfit(Double interestRate, BigDecimal depositBalance, Integer durationInDays) {
        BigDecimal pi;
        pi = depositBalance.multiply(new BigDecimal(interestRate * durationInDays)).divide(new BigDecimal(36500), 3, RoundingMode.CEILING);
        return pi;
    }

    @Override
    public int compareTo(DepositStructure depositStructure) {
        BigDecimal comparePayedInterest = ((DepositStructure) depositStructure).getPayedInterest();
        return comparePayedInterest.subtract(this.payedInterest).intValue();
    }
}
