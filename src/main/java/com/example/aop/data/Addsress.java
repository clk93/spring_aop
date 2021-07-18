package com.example.aop.data;

public class Addsress {
    private String streetAndNumber;
    private String city;
    private String postalCode;

    public Addsress() {
    }

    public Addsress(String streetAndNumber, String city, String postalCode) {
        this.streetAndNumber = streetAndNumber;
        this.city = city;
        this.postalCode = postalCode;
    }

    public String getStreetAndNumber() {
        return streetAndNumber;
    }

    public void setStreetAndNumber(String streetAndNumber) {
        this.streetAndNumber = streetAndNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
}
