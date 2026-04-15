public class CellPhone {
    private int serialNumber = 0;
    private String model = "";
    private String carrier = "";
    private String phoneNumber = "";
    private String owner = "";


    public int getSerialNumber() {
        return serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;

    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
