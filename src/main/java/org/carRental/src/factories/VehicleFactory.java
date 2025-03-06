package org.carRental.src.factories;

import org.carRental.src.models.Vehicle;

public abstract  class VehicleFactory {
    public abstract Vehicle createVehicle(String model);
}
