package bean;

import util.U;
import util.XmlToJava;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Maral Khojasteh
 */
public class DepositMapper {


    //    DataStructureDeposit dataStructureDeposit = new DataStructureDeposit();
    Deposit deposit;
    Map<String, BigDecimal> output = new HashMap<String, BigDecimal>();

    public Map<String, BigDecimal> depositMapper() throws ClassNotFoundException {

        List<DataStructureDeposit> listDeposit = new ArrayList<DataStructureDeposit>();
        BigDecimal payedInterest;
        DepositType depositType = null;
        listDeposit = XmlToJava.getXmlData();

        Deposit deposit;

        for (DataStructureDeposit ds : listDeposit) {
            deposit = new Deposit();

            deposit.setCustomerNumber(ds.customerNumber);

            deposit.setDepositBalance(ds.depositBalance);
            deposit.setDurationInDays(ds.durationInDays);

            try {
                Class c = Class.forName("bean." + ds.depositType);

                depositType = (DepositType) c.newInstance();

            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }


            deposit.setDepositType(depositType);



            payedInterest = deposit.calculateProfit(deposit.getDepositType().getInterestRate(), deposit.getDepositBalance(), deposit.getDurationInDays());
            U.wl(""+payedInterest);

            output.put(deposit.customerNumber, payedInterest);


        }

        return output;
    }




}
