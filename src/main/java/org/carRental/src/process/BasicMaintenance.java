package org.carRental.src.process;

import org.carRental.src.models.Vehicle;

class BasicMaintenance extends VehicleMaintenanceProcess {
    @Override
    public String performSpecificMaintenance(Vehicle vehicle) {
        return "Executando manutenção básica: troca de óleo e checagem geral no " + vehicle.getModel() + ".";
    }
}
