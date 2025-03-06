package org.carRental.src.rental.states;

import org.carRental.src.rental.Rental;

public class CancelledState extends  RentalState{
    private CancelledState() {};
    private static CancelledState instance = new CancelledState();
    public static CancelledState getInstance() {
        return instance;
    }

    public String getState() {
        return "Cancelado";
    }

}
