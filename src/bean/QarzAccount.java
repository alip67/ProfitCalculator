package bean;

import util.U;

import java.math.BigDecimal;

/**
 * @author Maral Khojasteh
 */
public class QarzAccount extends Deposit {

    public QarzAccount(){
        U.wl(" Qarz Constructor");
    }

    public QarzAccount(Integer customerNumber,BigDecimal depositBalance, Integer durationInDays,String depositType){
        super();
        this.customerNumber = customerNumber;
        this.depositBalance = depositBalance;
        this.durationInDays = durationInDays;
        this.depositType = depositType;

    }


    @Override
    public BigDecimal calc(Integer ir, BigDecimal db, Integer dd) {
        return null;
    }


}