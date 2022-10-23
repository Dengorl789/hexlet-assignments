package exercise;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> foundBooks = new ArrayList<>();

        int criteriasCount = where.size();
        int criteriaOverlap;
        for (Map book: books) {
            criteriaOverlap = 0;
            for (Object key: book.keySet()) {
                if ((where.containsKey(key)) && (where.get(key).equals(book.get(key)))) {
                    criteriaOverlap++;
                }
            }
            if (criteriaOverlap == criteriasCount) {
                foundBooks.add(book);
            }
        }
        return foundBooks;
    }
}
//END
