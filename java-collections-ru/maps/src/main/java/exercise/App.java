package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map<String, Integer> getWordCount(String sentence) {
        Map<String, Integer> wordsCount = new HashMap<>();
        String[] words = sentence.split(" ");

        for (String word : words) {
            int count = 0;
            wordsCount.put(word, count);
            for (int i = 0; i < words.length; i++){
                if (words[i].equals(word)) {
                    count++;
                    wordsCount.replace(word, count);
                }
            }
            count = 0;
        }
        if (sentence.equals("")) {
            wordsCount.clear();
        }
        System.out.println(wordsCount);
        return wordsCount;
    }
    public static String toString(Map<String, Integer> wordsCount) {
        if (wordsCount.isEmpty()) {
            return "{}";
        }
        String result = "{";
        for (String key : wordsCount.keySet()) {
            result += "\n  " + key + ": " + wordsCount.get(key);
        }
        result += "\n}";
        System.out.println(result);
        return result;
    }
}
//END
