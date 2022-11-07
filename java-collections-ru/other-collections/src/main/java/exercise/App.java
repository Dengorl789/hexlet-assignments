package exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

// BEGIN
public class App {
    public static LinkedHashMap<String, String> genDiff(Map<String, Object> data1, Map<String, Object> data2) {
        LinkedHashMap<String, String> difference = new LinkedHashMap<>();

        if (data1.isEmpty() && data2.isEmpty()) {
            return difference;
        }

        for (String key: data1.keySet()) {
            if (data2.containsKey(key)) {
                if (data2.get(key).equals(data1.get(key))) {
                    difference.put(key, "unchanged");
                } else {
                    difference.put(key, "changed");
                }
            } else {
                difference.put(key, "deleted");
            }
        }

        for (String data2Key: data2.keySet()) {
            if (!data1.containsKey(data2Key)) {
                difference.put(data2Key, "added");
            }
        }
        return difference;
    }
}
//END
