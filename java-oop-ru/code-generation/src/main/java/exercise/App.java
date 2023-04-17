package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// BEGIN
public class App {
	public static void save(Path path, Car car) throws IOException {
		String serializedCar = car.serialize(car);
		Files.writeString(path, serializedCar);
	}
	public static Car extract(Path path) throws IOException {
		String stringObject = Files.readString(path);
		Car car = new Car(1,"", "", "", new User(1, "", "", 1));
		car = car.unSerialize(stringObject);
		return car;
	}
}
// END
