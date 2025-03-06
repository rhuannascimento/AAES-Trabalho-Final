package org.carRental.src.rental.decorators;

import org.carRental.src.rental.Rental;

public class CarSeatDecorator  extends  RentalDecorator{
    public CarSeatDecorator(Rental rental) {
        super(rental);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Cadeira infantil";
    }

    @Override
    public double getCost() {
        return super.getCost() + 200.00;
    }
}
