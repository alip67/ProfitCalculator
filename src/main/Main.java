package main;

import bean.DepositMapper;
import util.SortByComparator;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigDecimal;
import java.util.*;

/**
 * @author Maral Khojasteh
 */
public class Main {

    static final String filePath = "src/file1.txt";

    public static void main(String args[]) throws ClassNotFoundException, IOException {
        Map<String, BigDecimal> unsortedOutput = new HashMap<String, BigDecimal>();
        Map<String, BigDecimal> sortedOutput = new HashMap<String, BigDecimal>();
        DepositMapper depositMapperOutput = new DepositMapper();
        try {
            unsortedOutput = depositMapperOutput.depositMapper();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
//        for (Map.Entry<String, BigDecimal> entry : unsortedOutput.entrySet())
//            System.out.println("[Key] : " + entry.getKey()
//                    + " [Value] : " + entry.getValue());


        sortedOutput = SortByComparator.sortByComparator(unsortedOutput);
//        for (Map.Entry<String, BigDecimal> entry : sortedOutput.entrySet())
//            System.out.println("[Key] : " + entry.getKey()
//                    + " [Value] : " + entry.getValue());

        List<String> ls = new ArrayList<String>();
        for (Map.Entry<String, BigDecimal> entry : sortedOutput.entrySet()) {


            String outputDisplay = entry.getKey().toString() + "#" + entry.getValue().toString();
            ls.add(outputDisplay);

        }

        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
        Iterator<String> outputIterator = ls.iterator();
        while (outputIterator.hasNext()) {
            file.writeBytes(outputIterator.next().toString() + "\n");
        }
        file.close();




//ِ
    }

//    private static Long writeToFile(String filePath, String data, int position) throws IOException {
//        RandomAccessFile file = new RandomAccessFile(filePath, "rw");
//        file.seek(position);
//        file.write(data.getBytes());
//        Long pointer = file.getFilePointer();
//        file.close();
//        return pointer;
//
//    }

}
