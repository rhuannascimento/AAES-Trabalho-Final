package org.carRental.src.rental.states;

import org.carRental.src.rental.Rental;

public class ProgressState extends  RentalState {
    private ProgressState() {};
    private static ProgressState instance = new ProgressState();
    public static ProgressState getInstance() {
        return instance;
    }

    public String getState() {
        return "Em progresso";
    }

    public boolean cancel(Rental rental) {
        rental.setState(CancelledState.getInstance());
        return true;
    }

    public boolean complete(Rental rental) {
        rental.setState(CompletedState.getInstance());
        return true;
    }
}
