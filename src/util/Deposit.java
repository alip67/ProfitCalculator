package util;

import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;

@XmlType(propOrder = {"customerNumber", "depositType", "depositBalance", "durationInDays", })
public class Deposit {
    String customerNumber;
    String depositType;
    BigDecimal depositBalance;
    Integer durationInDays;
//    List<Deposit> deposit;


    public String getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(String customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getDepositType() {
        return depositType;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
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

//    @XmlElement(name = "deposit")
//    public List<Deposit> getDeposit() {
//        return deposit;
//    }
//
//    public void setDeposit(List<Deposit> deposit) {
//        this.deposit = deposit;
//    }


}




