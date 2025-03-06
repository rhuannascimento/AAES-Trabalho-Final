package org.carRental.src.models;

import org.carRental.src.rental.Rental;

import java.util.Observable;
import java.util.Observer;

public class Client implements Observer {
    private String lastNotification;

    public void linkToRental(Rental rental) {
        if (rental instanceof Observable) {
            ((Observable) rental).addObserver(this); // Adiciona o observador
        }
    }

    @Override
    public void update(Observable rental, Object arg) {
        this.lastNotification = rental.toString();
    }

    public String getLastNotification() {
        return this.lastNotification;
    }
}