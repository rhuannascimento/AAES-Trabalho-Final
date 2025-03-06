package org.carRental.src.fleet;

import org.carRental.src.models.Vehicle;

import java.util.ArrayList;

public class FleetManager {
    private static FleetManager instance;
    private ArrayList<Vehicle> fleet;

    private FleetManager() {
        this.fleet = new ArrayList<>();
    }

    public static FleetManager getInstance() {
        if (instance == null) {
            instance = new FleetManager();
        }
        return instance;
    }

    public void addVehicle(Vehicle vehicle) {
        fleet.add(vehicle);
    }

    public void removeVehicle(Vehicle vehicle) {
        fleet.remove(vehicle);
    }

    public ArrayList<Vehicle> getFleet() {
        return fleet;
    }
}
