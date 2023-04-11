package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, String> swapKeyValue(KeyValueStorage storage) {
        Map<String, String> map = storage.toMap();
        Map<String, String> reversedMap = new HashMap<>();
        for (Map.Entry<String, String> keyValue: map.entrySet()) {
            String newKey = keyValue.getValue();
            String newValue = keyValue.getKey();
            reversedMap.put(newKey, newValue);
        }
        System.out.println(reversedMap);
        return reversedMap;
    }
}
// END
