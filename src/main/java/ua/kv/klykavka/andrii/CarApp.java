package ua.kv.klykavka.andrii;

import ua.kv.klykavka.andrii.cars.*;

public class CarApp {
    public static void main(String[] args) {
        Driver driver1 = new Driver("Antonio", "Male", "4412234431", 7.0f);
        Engine engine1 = new Engine(270, "Sun Motours");

        Driver driver2 = new Driver("Ricardo", "Male", "123390984", 5.5f);
        Engine engine2 = new Engine(360, "Speed Injection");

        Car sportCar = new SportCar("Audi", "racing car", 2700, driver2, engine2, 300);
        Car lorry = new Track("MAN", "carrying car", 5600, driver1, engine1, 120);
    }
}
