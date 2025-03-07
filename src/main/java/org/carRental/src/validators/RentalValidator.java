package org.carRental.src.validators;

import org.carRental.src.models.Client;

public abstract class RentalValidator {
    protected RentalValidator next;

    public void setNext(RentalValidator next) {
        this.next = next;
    }

    public abstract boolean validate(Client client);
}
