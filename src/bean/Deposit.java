package bean;

import util.U;

import java.math.BigDecimal;

/**
 * @author Maral Khojasteh
 */
public abstract class Deposit {
    protected Integer customerNumber;
    protected BigDecimal depositBalance;
    protected  Integer durationInDays;
    protected String depositType;

    public Deposit(){
        U.wl("constructor");
    }

    public Deposit(Integer customerNumber,BigDecimal depositBalance, Integer durationInDays, String depositType){
        this.customerNumber = customerNumber;
        this.depositBalance = depositBalance;
        this.durationInDays = durationInDays;
        this.depositType = depositType;
    }

    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
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

    abstract public BigDecimal calc(Integer ir, BigDecimal db, Integer dd);


}
