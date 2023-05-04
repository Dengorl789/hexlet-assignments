package exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class App {
    public static List<String> buildApartmentsList(List<Home> apartments, int positions) {
        if (apartments.isEmpty()) {
            return new ArrayList<>();
        }
        List<Home> sortedApartmentsList = apartments.stream()
                .sorted(Home::compareTo)
                .toList();
        List<String> sortedApartmentsListString = new ArrayList<>(positions);
        for(int i = 0; i < positions; i++) {
            var home = sortedApartmentsList.get(i);
            sortedApartmentsListString.add(home.toString());
        }
        return sortedApartmentsListString;
    }


}
// END
