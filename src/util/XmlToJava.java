package util;

import bean.DataStructureDeposit;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Maral Khojasteh
 */
public class XmlToJava {


    public static  List<DataStructureDeposit> getXmlData() {
        List<DataStructureDeposit> lisDeposit = new ArrayList<DataStructureDeposit>();
        try {
            File file = new File(".\\file.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(DepositsConfig.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            DepositsConfig depositData = (DepositsConfig) jaxbUnmarshaller.unmarshal(file);
            DataStructureDeposit dsd = new DataStructureDeposit();

            dsd.setCustomerNumber(depositData.depositconfig.getCustomerNumber());
            dsd.setDepositBalance(depositData.depositconfig.getDepositBalance());
            dsd.setDurationInDays(depositData.depositconfig.getDurationInDays());
            dsd.setDepositType(depositData.depositconfig.getDepositType());
            lisDeposit.add(dsd);


        } catch (JAXBException e) {
            e.printStackTrace();
        }
        return lisDeposit;
    }

    public static List<String> example(){
        List<String> messages = Arrays.asList("Hello", "World!", "How", "Are", "You");
        return  messages;
    }
}
