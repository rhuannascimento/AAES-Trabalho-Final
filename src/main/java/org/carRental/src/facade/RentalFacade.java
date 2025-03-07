package org.carRental.src.facade;

import org.carRental.src.fleet.FleetManager;
import org.carRental.src.models.Client;
import org.carRental.src.models.Vehicle;
import org.carRental.src.process.VehicleMaintenanceProcess;
import org.carRental.src.rental.BaseRental;
import org.carRental.src.rental.Rental;
import org.carRental.src.strategy.PricingStrategy;
import org.carRental.src.validators.AgeValidator;
import org.carRental.src.validators.CreditValidator;
import org.carRental.src.validators.LicenseValidator;
import org.carRental.src.validators.RentalValidator;

public class RentalFacade {
    private FleetManager fleetManager;
    private PricingStrategy pricingStrategy;
    private RentalValidator rentalValidator;
    private Rental rental;

    public RentalFacade(PricingStrategy pricingStrategy, Rental rental) {
        this.fleetManager = FleetManager.getInstance();
        this.pricingStrategy = pricingStrategy;
        this.rental = rental;
        setupValidators();
    }

    private void setupValidators() {
        AgeValidator ageValidator = new AgeValidator();
        LicenseValidator licenseValidator = new LicenseValidator();
        CreditValidator creditValidator = new CreditValidator();

        ageValidator.setNext(licenseValidator);
        licenseValidator.setNext(creditValidator);

        this.rentalValidator = ageValidator;
    }

    public boolean rentVehicle(Client client, Vehicle vehicle) {
        if (!rentalValidator.validate(client)) {
            return false;
        }

        if (!fleetManager.getFleet().contains(vehicle)) {
            return false;
        }

        double finalPrice = pricingStrategy.calculatePrice(rental);

        return true;
    }

    public void returnVehicle(Vehicle vehicle, VehicleMaintenanceProcess vehicleMaintenanceProcess) {
        vehicleMaintenanceProcess.performMaintenance(vehicle);
    }
}