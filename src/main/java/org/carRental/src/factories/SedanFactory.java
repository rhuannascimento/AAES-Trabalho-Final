package org.carRental.src.factories;

import org.carRental.src.models.Sedan;
import org.carRental.src.models.Vehicle;

public class SedanFactory extends VehicleFactory{
    public Vehicle createVehicle(String model) {
        // Exemplo fixo de preço
        return new Sedan(model, 50.0);
    }
}
