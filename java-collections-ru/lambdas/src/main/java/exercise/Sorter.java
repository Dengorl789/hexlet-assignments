package exercise;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        List<String> oldestMansListSortedByDate;
        oldestMansListSortedByDate = users.stream()
                .filter(user -> user.get("gender").equals("male"))
                .map(userDateOfBirth -> userDateOfBirth.get("birthday"))
                .sorted()
                .collect(Collectors.toList());

        List<String> oldestMansListSortedByName = new ArrayList<>();
        for (String manDateOfBirth: oldestMansListSortedByDate) {
            for (Map<String, String> user: users ) {
                if (manDateOfBirth.equals(user.get("birthday"))) {
                    oldestMansListSortedByName.add(user.get("name"));
                }
            }
        }

        return oldestMansListSortedByName;
    }
}
// END
