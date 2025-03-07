package org.carRental.src.strategy;

import org.carRental.src.rental.Rental;

public interface PricingStrategy {
    public double calculatePrice(Rental rental);
}
