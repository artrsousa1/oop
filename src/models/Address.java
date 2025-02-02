package models;

public class Address {
    private String state;
    private String city;
    private String street;
    
    public Address(String state, String city, String street) {
        this.state = state;
        this.city = city;
        this.street = street;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String toString(){
        return "{ State: " + getState() + ", City: " + getCity() + ", Street: " + getStreet() + " }";
    }
}