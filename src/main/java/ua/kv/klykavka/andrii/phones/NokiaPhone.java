package ua.kv.klykavka.andrii.phones;

public class NokiaPhone extends Phone implements  PhoneConnection{
    public NokiaPhone(String name, String model, int storageVolume, int RAMVolume) {
        super(name, model, storageVolume, RAMVolume);
    }


    @Override
    public void call() {
        System.out.println("psh-psh... I can't hear you... You ... psh ... you just called me! psh-psh");
    }

    @Override
    public void sendMessage() {
        System.out.println("h%hwq2 ajs%db&s");
    }
}
