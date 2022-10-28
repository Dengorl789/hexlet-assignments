package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static int getCountOfFreeEmails(List<String> userEmails) {
        return (int) userEmails.stream()
                .filter(userEmail -> userEmail.endsWith("gmail.com")
                || userEmail.endsWith("yandex.ru")
                || userEmail.endsWith("hotmail.com"))
                .count();
    }
}

// END
