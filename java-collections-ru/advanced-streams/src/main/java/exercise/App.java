package exercise;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.stream.Stream;

// BEGIN
public class App {
    public static String getForwardedVariables(String fileName) {
        String[] fileToArray = fileName.split("\n");

        String vars = Arrays.stream(fileToArray)
                .filter(x -> x.startsWith("environment"))
                .flatMap(x -> Stream.of((x.substring(x.indexOf("=") + 2))))
                .map(x -> x.replace("\"",","))
                .flatMap(x -> Stream.of(x.split(",")))
                .filter(x -> x.contains("X_FORWARDED_"))
                .map(x -> x.replace("X_FORWARDED_", ","))
                .collect(Collectors.joining());

        return vars.substring(1);
    }
}
//END
