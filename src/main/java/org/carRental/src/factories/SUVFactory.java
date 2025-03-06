package org.carRental.src.factories;

import org.carRental.src.models.SUV;
import org.carRental.src.models.Vehicle;

public class SUVFactory extends VehicleFactory{
    public Vehicle createVehicle(String model) {
        // Exemplo fixo de preço
        return new SUV(model, 50.0);
    }
}
