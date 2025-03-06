package org.carRental.src.rental.states;

import org.carRental.src.rental.Rental;

public class CompletedState extends RentalState{
    private CompletedState() {};
    private static CompletedState instance = new CompletedState();
    public static CompletedState getInstance() {
        return instance;
    }

    public String getState() {
        return "Concluido";
    }
}
