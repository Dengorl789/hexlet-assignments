package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

// BEGIN
@Value
// END
class Car {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    // BEGIN
    public String serialize(Car car) throws JsonProcessingException {
        ObjectMapper oMapper = new ObjectMapper();
        return oMapper.writeValueAsString(car);
    }
    public Car unSerialize(String jsonString) throws IOException {
        ObjectMapper oMapper = new ObjectMapper();
        return oMapper.readValue(jsonString, Car.class);
    }
    // END
}
