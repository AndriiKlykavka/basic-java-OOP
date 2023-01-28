package ua.kv.klykavka.andrii.cars;

public class Car {
    private String mark;
    private  String carClass;
    private int weight;
    private Driver driver;
    private Engine engine;

    public Car(String mark, String carClass, int weight, Driver driver, Engine engine) {
        this.mark = mark;
        this.carClass = carClass;
        this.weight = weight;
        this.driver = driver;
        this.engine = engine;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getCarClass() {
        return carClass;
    }

    public void setCarClass(String carClass) {
        this.carClass = carClass;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        System.out.println("GO!GO!GO!");
    }

    public void stop() {
        System.out.println("Let's stop");
    }

    public void turnRight() {
        System.out.println("We are turning right!");
    }

    public void turnLeft() {
        System.out.println("Quick turn left!");
    }
}
