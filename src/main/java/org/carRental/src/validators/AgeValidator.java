package org.carRental.src.validators;

import org.carRental.src.models.Client;

public class AgeValidator extends RentalValidator {
    public boolean validate(Client client) {
        if(client.getAge() < 18) {
            return false;
        }
        return next == null ? true : next.validate(client);
    }
}
