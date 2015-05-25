package bean;

import java.math.BigDecimal;

/**
 * @author Maral Khojasteh
 */
public class DataStructureDeposit {
    public String customerNumber;
    public BigDecimal depositBalance;
    public Integer durationInDays;
    public String depositType;

    public DataStructureDeposit() {
    }

    public DataStructureDeposit(String customerNumber, BigDecimal depositBalance, Integer durationInDays, String depositType) {
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

    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }
}
