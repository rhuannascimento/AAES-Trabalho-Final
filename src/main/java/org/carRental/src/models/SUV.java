package org.carRental.src.models;

public class SUV extends Vehicle{
    public SUV(String model, double pricePerDay) {
        this.model = model;
        this.pricePerDay = pricePerDay;
    }
    public String getType() { return "SUV"; }
}
