package main;

import bean.DepositMapper;
import util.SortByComparator;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

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

        sortedOutput = SortByComparator.sortByComparator(unsortedOutput);


        for (Map.Entry<String, BigDecimal> entry : sortedOutput.entrySet()) {
            String outputDisplay = String.format("%s#%s", entry.getKey(), entry.getValue());
            RandomAccessFile file = new RandomAccessFile(filePath, "rw");
            file.writeBytes(outputDisplay);
//            String newLine = "\n","\r\n";
//            file.writeBytes(newLine);
            file.close();
        }


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
