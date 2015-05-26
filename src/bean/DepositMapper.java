package bean;

import util.Writeline;
import util.XmlToJava;

import java.util.ArrayList;
import java.util.List;

public class DepositMapper {
    public List<DepositStructure> depositMapper() throws ClassNotFoundException {
        List<DepositStructure> listDeposit = new ArrayList<DepositStructure>();
        try {
            listDeposit = XmlToJava.getInstance().getXmlData();
        } catch (Exception ex) {
            Writeline.wl("" + ex);
        }
        for (DepositStructure ds : listDeposit) {
            ds.setPayedInterest(ds.calculateProfit(ds.getDepositType().getInterestRate(), ds.getDepositBalance(), ds.getDurationInDays()));
        }
        return listDeposit;
    }
}
