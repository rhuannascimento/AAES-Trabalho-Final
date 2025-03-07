package org.carRental.src.process;

import org.carRental.src.models.Vehicle;

public class FullMaintenance extends VehicleMaintenanceProcess{
    @Override
    protected String performSpecificMaintenance(Vehicle vehicle) {
        return "Executando manutenção completa: revisão do motor, troca de fluídos, freios e suspensão no " + vehicle.getModel() + ".";
    }
}
