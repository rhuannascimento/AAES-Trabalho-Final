package org.carRental.src.strategy;

import org.carRental.src.rental.Rental;

public class NormalPricingStrategy implements PricingStrategy {
    public double calculatePrice(Rental rental) {
        return rental.getCost();
    }
}
