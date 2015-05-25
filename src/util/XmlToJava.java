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


    public static  List<DataStructureDeposit> getXmlData() {

        List<DataStructureDeposit> lisDeposit = new ArrayList<DataStructureDeposit>();
        DataStructureDeposit dsdTemp = new DataStructureDeposit();

        try {

            File file = new File("src/file.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Deposits.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Deposits depositData = (Deposits) jaxbUnmarshaller.unmarshal(file);

            DataStructureDeposit dsd = new DataStructureDeposit();

            dsd.setCustomerNumber(depositData.deposit.getCustomerNumber());

            dsd.setDepositBalance(depositData.deposit.getDepositBalance());

            dsd.setDurationInDays(depositData.deposit.getDurationInDays());

            dsd.setDepositType(depositData.deposit.getDepositType());

            dsdTemp = dsd;
            lisDeposit.add(dsdTemp);



        } catch (JAXBException e) {
            e.printStackTrace();
        }

        for (DataStructureDeposit aa : lisDeposit){
            U.wl(""+aa.getCustomerNumber());
            U.wl(""+aa.getDepositBalance());
            U.wl(""+aa.getDepositType());
            U.wl(""+aa.getDurationInDays());
        }


        return lisDeposit;


    }



}
