package org.carRental.src.rental.decorators;

import org.carRental.src.rental.Rental;

public class InsuranceDecorator extends  RentalDecorator{
    public InsuranceDecorator(Rental rental) {
        super(rental);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Seguro";
    }

    @Override
    public double getCost() {
        return super.getCost() + 50.00;
    }
}
