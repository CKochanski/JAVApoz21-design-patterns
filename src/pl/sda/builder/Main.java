package pl.sda.builder;

public class Main {

    public static void main(String[] args) {
	    Car car = Car.builder()
                .brand("Volkswagen")
                .model("Golf")
                .color("Piano black")
                .build();

        System.out.println(car);

        CarLombok carLombok = CarLombok.builder()
                .brand("Toyota")
                .model("Auris")
                .color("Platinum Bronze")
                .build();

        System.out.println(carLombok);
    }
}
