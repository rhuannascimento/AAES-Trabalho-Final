package org.carRental.src.models;

public abstract class Vehicle {
    protected String model;
    protected double pricePerDay;

    public abstract String getType();

    public String getModel() { return model; }
    public double getPricePerDay() { return pricePerDay; }
}
