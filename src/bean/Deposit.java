package bean;

import util.U;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 * @author Maral Khojasteh
 */
public class Deposit {
    protected String customerNumber;
    protected BigDecimal depositBalance;
    protected Integer durationInDays;
    protected DepositType depositType;

    public Deposit() {
        U.wl("constructor");
    }

    public Deposit(String customerNumber, BigDecimal depositBalance, Integer durationInDays, DepositType depositType) {
        this.customerNumber = customerNumber;
        this.depositBalance = depositBalance;
        this.durationInDays = durationInDays;
        this.depositType = depositType;
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
        BigDecimal pi = BigDecimal.ZERO;
        pi = depositBalance.multiply(new BigDecimal(interestRate * durationInDays)).divide(new BigDecimal(36500), 3, RoundingMode.CEILING);
        return pi;
    }



}
