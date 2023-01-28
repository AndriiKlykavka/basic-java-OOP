package ua.kv.klykavka.andrii.phones;

public abstract class Phone {
    private String name;
    private String model;
    private int storageVolume;
    private int RAMVolume;

    public Phone(String name, String model, int storageVolume, int RAMVolume) {
        this.name = name;
        this.model = model;
        this.storageVolume = storageVolume;
        this.RAMVolume = RAMVolume;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getStorageVolume() {
        return storageVolume;
    }

    public void setStorageVolume(int storageVolume) {
        this.storageVolume = storageVolume;
    }

    public int getRAMVolume() {
        return RAMVolume;
    }

    public void setRAMVolume(int RAMVolume) {
        this.RAMVolume = RAMVolume;
    }
}
