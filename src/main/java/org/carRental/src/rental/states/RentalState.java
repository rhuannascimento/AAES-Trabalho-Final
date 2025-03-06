package org.carRental.src.rental.states;

import org.carRental.src.rental.Rental;

public abstract class RentalState {
    public abstract String getState();

    public boolean cancel(Rental rental) {
        return false;
    }

    public boolean complete(Rental rental) {
        return false;
    }

    public boolean init(Rental rental) {
        return false;
    }

}
