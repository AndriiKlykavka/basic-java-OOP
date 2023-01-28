package ua.kv.klykavka.andrii.cars;

public class SportCar extends Car{
    private int maxSpeed;

    public SportCar(String mark, String carClass, int weight, Driver driver, Engine engine, int maxSpeed) {
        super(mark, carClass, weight, driver, engine);
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
