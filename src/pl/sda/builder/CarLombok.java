package pl.sda.builder;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class CarLombok {

    String brand;
    String model;
    String color;
    String registrationNumber;
    String owner;
}
