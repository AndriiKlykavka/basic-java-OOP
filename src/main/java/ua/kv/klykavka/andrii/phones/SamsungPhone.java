package ua.kv.klykavka.andrii.phones;

public class SamsungPhone extends Phone implements PhoneMedia, PhoneConnection {

    public SamsungPhone(String name, String model, int storageVolume, int RAMVolume) {
        super(name, model, storageVolume, RAMVolume);
    }

    @Override
    public void call() {
        System.out.println("Hi! I'm calling you from my new Samsung " + super.getModel());
    }

    @Override
    public void sendMessage() {
        System.out.println("How are you doing, darling?");
    }

    @Override
    public void takePhoto() {
        System.out.println("Once - that's it. Very quickly");
    }

    @Override
    public void makeVideo() {
        System.out.println("The quality of this video is amazing!");
    }
}
