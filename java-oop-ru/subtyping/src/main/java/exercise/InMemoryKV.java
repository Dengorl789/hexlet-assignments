package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class InMemoryKV implements KeyValueStorage{
    private final Map<String, String> map = new HashMap<>();

    @Override
    public void set(String key, String value) {
        if (!map.isEmpty() && map.containsKey(key)) {
            map.replace(key, value);
        } else {
            map.put(key, value);
        }
    }

    @Override
    public void unset(String key) {
        if(!map.isEmpty() && map.containsKey(key)) {
            map.remove(key);
        }
    }

    @Override
    public String get(String key, String defaultValue) {
        return map.getOrDefault(key, defaultValue);
    }

    @Override
    public Map<String, String> toMap() {
        return new HashMap<>(map);
    }
    public InMemoryKV(Map<String, String> map) {
        this.map.putAll(map);
    }

}
// END
