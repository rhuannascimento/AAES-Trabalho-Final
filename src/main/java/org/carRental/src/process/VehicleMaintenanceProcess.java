package org.carRental.src.process;

import org.carRental.src.models.Vehicle;

public abstract class VehicleMaintenanceProcess  {

    private String checkVehicleCondition(Vehicle vehicle) {
        return "Verificando condições gerais do veículo " + vehicle.getModel() + "...";
    }

    protected abstract String performSpecificMaintenance(Vehicle vehicle);

    private String testDrive(Vehicle vehicle) {
        return "Realizando test drive no " + vehicle.getModel() + " para garantir que tudo está funcionando...";
    }

    private String finishProcess(Vehicle vehicle) {
        return "Finalizando manutenção e liberando o veículo " + vehicle.getModel() + ".";
    }

    public final void performMaintenance(Vehicle vehicle) {
        this.checkVehicleCondition(vehicle);
        this.performSpecificMaintenance(vehicle);
        this.testDrive(vehicle);
        this.finishProcess(vehicle);
    }
}
