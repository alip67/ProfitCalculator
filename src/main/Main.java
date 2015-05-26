package main;

import bean.DepositMapper;
import bean.DepositStructure;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigDecimal;
import java.util.*;

public class Main {

    static final String filePath = "src/file1.txt";

    public static void main(String args[]) throws ClassNotFoundException, IOException {
        List<DepositStructure> unsortedOutput = new ArrayList<DepositStructure>();
       Map<String, BigDecimal> sortedOutput = new HashMap<String, BigDecimal>();
        DepositMapper depositMapperOutput = new DepositMapper();
        try {
            unsortedOutput = depositMapperOutput.depositMapper();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

       Collections.sort(unsortedOutput);

        for (DepositStructure depositStructure : unsortedOutput){
            sortedOutput.put(depositStructure.getCustomerNumber(),depositStructure.getPayedInterest());
        }
        List<String> ls = new ArrayList<String>();
        for (Map.Entry<String, BigDecimal> entry : sortedOutput.entrySet()) {


            String outputDisplay = entry.getKey().toString() + "#" + entry.getValue().toString();
            ls.add(outputDisplay);

        }

        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        Iterator<String> outputIterator = ls.iterator();
        while (outputIterator.hasNext()) {
            String newLine = System.getProperty("line.separator");
            file.writeBytes(newLine+outputIterator.next().toString() + newLine);
        }
        file.close();


    }


}
