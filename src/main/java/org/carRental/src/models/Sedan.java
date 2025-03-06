package org.carRental.src.models;

public class Sedan extends Vehicle {
    public Sedan(String model, double pricePerDay) {
        this.model = model;
        this.pricePerDay = pricePerDay;
    }
    public String getType() { return "Sedan"; }
}
