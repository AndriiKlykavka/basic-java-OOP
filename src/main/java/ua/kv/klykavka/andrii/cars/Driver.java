package ua.kv.klykavka.andrii.cars;

public class Driver extends Person{
    private float drivingExperience;

    public Driver(String name, String gender, String phoneNumber, float drivingExperience) {
        super(name, gender, phoneNumber);
        this.drivingExperience = drivingExperience;
    }

    public float getDrivingExperience() {
        return drivingExperience;
    }

    public void setDrivingExperience(float drivingExperience) {
        this.drivingExperience = drivingExperience;
    }
}
