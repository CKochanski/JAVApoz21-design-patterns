package pl.sda.builder;

import java.util.Objects;

public class Car {

    private final String brand;
    private final String model;
    private final String color;
    private final String registrationNumber;
    private final String owner;


    private Car(Builder builder) {
        this.brand = builder.brand;
        this.model = builder.model;
        this.color = builder.color;
        this.registrationNumber = builder.registrationNumber;
        this.owner = builder.owner;
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) && Objects.equals(model, car.model) && Objects.equals(color, car.color) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(owner, car.owner);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, color, registrationNumber, owner);
    }

    public static class Builder {
        private String brand;
        private String model;
        private String color;
        private String registrationNumber;
        private String owner;

        private Builder() {
        }

        public Builder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder model(String model) {
            this.model = model;
            return this;
        }

        public Builder color(String color) {
            this.color = color;
            return this;
        }

        public Builder registrationNumber(String registrationNumber) {
            this.registrationNumber = registrationNumber;
            return this;
        }

        public Builder owner(String owner) {
            this.owner = owner;
            return this;
        }

        public Car build() {
            return new Car(this);
        }
    }
}
