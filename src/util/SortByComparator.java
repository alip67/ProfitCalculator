package util;


import java.math.BigDecimal;
import java.util.*;

public class SortByComparator {

    Map<String, BigDecimal> sortedMap = new HashMap<String, BigDecimal>();

    public static Map<String, BigDecimal> sortByComparator(Map<String, BigDecimal> unsortedMap) {

        // Convert Map to List
        List<Map.Entry<String, BigDecimal>> list =
                new LinkedList<Map.Entry<String, BigDecimal>>(unsortedMap.entrySet());

        // Sort list with comparator, to compare the Map values
        Collections.sort(list, new Comparator<Map.Entry<String, BigDecimal>>() {
            public int compare(Map.Entry<String, BigDecimal> o1,
                               Map.Entry<String, BigDecimal> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // Convert sorted map back to a Map
        Map<String, BigDecimal> sortedMap = new LinkedHashMap<String, BigDecimal>();
        for (Iterator<Map.Entry<String, BigDecimal>> it = list.iterator(); it.hasNext(); ) {
            Map.Entry<String, BigDecimal> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }
        return sortedMap;
    }
}
