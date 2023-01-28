package ua.kv.klykavka.andrii;

import ua.kv.klykavka.andrii.phones.NokiaPhone;
import ua.kv.klykavka.andrii.phones.Phone;
import ua.kv.klykavka.andrii.phones.PhoneConnection;
import ua.kv.klykavka.andrii.phones.SamsungPhone;

public class PhoneApp {
    public static void main(String[] args) {
        NokiaPhone nokia = new NokiaPhone("Rebecca", "3310",16, 16 );
        SamsungPhone samsung = new SamsungPhone("Rodrigo", "Galaxy S10", 512000, 8000);
        samsung.call();
        nokia.call();
        samsung.sendMessage();
        nokia.sendMessage();
        samsung.takePhoto();
        samsung.makeVideo();
    }
}
