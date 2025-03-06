package org.carRental.src.rental;

import org.carRental.src.rental.states.RentalState;

import java.util.Observable;

public class BaseRental extends Observable implements Rental {
    private RentalState state;

    public double getCost(){
        return 150.00;
    };
    public String getDescription(){
        return "Plano basico";
    };
    public String toString() {
        return "Aluguel{" + "Estado=" + state.getState() + '}';
    }
    public void setState(RentalState state) {
        this.state = state;
        setChanged();
        notifyObservers();
    }
    public boolean complete() {
        return state.complete(this);
    }

    public boolean cancel() {
        return state.cancel(this);
    }

    public boolean init() {
        return state.init(this);
    }

    public String getNameState() {
        return state.getState();
    }

    public RentalState getState() {
        return state;
    }

}
