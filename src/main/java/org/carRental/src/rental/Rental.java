package org.carRental.src.rental;

import org.carRental.src.rental.states.RentalState;

public interface Rental {
    public double getCost();
    public String getDescription();
    public void setState(RentalState state);
    public String toString();
    public boolean complete();
    public boolean cancel();
    public boolean init();
    public String getNameState();
    public RentalState getState();
}
