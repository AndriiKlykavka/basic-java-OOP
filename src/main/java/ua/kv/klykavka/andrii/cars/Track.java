package ua.kv.klykavka.andrii.cars;

public class Track extends Car{
    private int carryingCapacity;

    public Track(String mark, String carClass, int weight, Driver driver, Engine engine, int carryingCapacity) {
        super(mark, carClass, weight, driver, engine);
        this.carryingCapacity = carryingCapacity;
    }

    public int getMaxSpeed() {
        return carryingCapacity;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.carryingCapacity = maxSpeed;
    }
}
