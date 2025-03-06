package org.carRental.src.rental.decorators;

import org.carRental.src.rental.Rental;

public abstract  class RentalDecorator implements Rental {
    protected Rental decoratedBurgerRental;

    public RentalDecorator(Rental rental) {
        this.decoratedBurgerRental = rental;
    }

    public double getCost(){
        return decoratedBurgerRental.getCost();
    };
    public String getDescription(){
        return decoratedBurgerRental.getDescription();
    };
}
