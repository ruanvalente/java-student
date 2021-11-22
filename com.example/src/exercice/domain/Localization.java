package exercice.domain;

public class Localization {
    private String address;

    public Localization() {
    }

    public Localization(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
