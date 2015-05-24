package util;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.math.BigDecimal;
import java.util.List;

@XmlType(propOrder = {"customerNumber", "depositType", "depositBalance", "durationInDays", "depositConfig"})
public class DepositConfig {
    Integer customerNumber;
    String depositType;
    BigDecimal depositBalance;
    Integer durationInDays;
    List<DepositConfig> depositConfig;


    public Integer getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Integer customerNumber) {
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

    @XmlElement(name = "deposit")
    public List<DepositConfig> getDepositConfig() {
        return depositConfig;
    }

    public void setDepositConfig(List<DepositConfig> depositConfig) {
        this.depositConfig = depositConfig;
    }


}




