package bean;

import util.U;

import java.math.BigDecimal;

/**
 * @author Maral Khojasteh
 */
public class ShortTermAccount extends Deposit {

    public ShortTermAccount(){
        U.wl(" ShortTerm Constructor");
    }

    public ShortTermAccount(Integer customerNumber,BigDecimal depositBalance, Integer durationInDays,String depositType){
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
