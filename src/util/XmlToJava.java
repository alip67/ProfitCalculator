package util;

import bean.DataStructureDeposit;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Maral Khojasteh
 */
public class XmlToJava {


    public static List<DataStructureDeposit> getXmlData() {
        List<DataStructureDeposit> lisDeposit = new ArrayList<DataStructureDeposit>();
        try {
            File file = new File(".\\file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(DepositsConfig.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            DepositsConfig depositData = (DepositsConfig) jaxbUnmarshaller.unmarshal(file);
            DataStructureDeposit dsd = new DataStructureDeposit();
            dsd.customerNumber = depositData.depositconfig.getCustomerNumber();
            dsd.depositBalance = depositData.depositconfig.getDepositBalance();
            dsd.durationInDays = depositData.depositconfig.getDurationInDays();
            dsd.depositType = depositData.depositconfig.getDepositType();
            lisDeposit.add(dsd);


        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return lisDeposit;
    }
}
