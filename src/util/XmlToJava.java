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
        DataStructureDeposit dsdTemp = new DataStructureDeposit();

        try {

            File file = new File("src/file.xml");

            JAXBContext jaxbContext = JAXBContext.newInstance(Deposits.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Deposits depositData = (Deposits) jaxbUnmarshaller.unmarshal(file);


            List<Deposit> list = depositData.getDeposit();
            for (Deposit deposit : list) {
                DataStructureDeposit dsd = new DataStructureDeposit();
                dsd.setCustomerNumber(deposit.getCustomerNumber());

                dsd.setDepositBalance(deposit.getDepositBalance());

                dsd.setDurationInDays(deposit.getDurationInDays());

                dsd.setDepositType(deposit.getDepositType());
//                U.wl("salay");
//                U.wl("" + deposit.getCustomerNumber());
//                U.wl("" + deposit.getDepositBalance());
//                U.wl("" + deposit.getDepositType());
//                U.wl("" + deposit.getDurationInDays());
//                U.wl("salay salay");
//                U.wl("dsdporshod");
//                U.wl("" + dsd.getCustomerNumber());
//                U.wl("" + dsd.getDepositBalance());
//                U.wl("" + dsd.getDepositType());
//                U.wl("" + dsd.getDurationInDays());
//                U.wl("ojojojojojoj");

                lisDeposit.add(dsd);
            }





        } catch (JAXBException e) {
            e.printStackTrace();
        }

//        for (DataStructureDeposit aa : lisDeposit){
//            U.wl("moshkel?");
//            U.wl(""+aa.getCustomerNumber());
//            U.wl(""+aa.getDepositBalance());
//            U.wl(""+aa.getDepositType());
//            U.wl(""+aa.getDurationInDays());
//            U.wl("ahaaaaaaaaaaaaaaaaaaa");
//        }
//        U.wl("baleeeeeeeeeeeeeee");


        return lisDeposit;


    }


}
