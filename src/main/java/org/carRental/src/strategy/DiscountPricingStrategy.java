package org.carRental.src.strategy;

import org.carRental.src.rental.Rental;

public class DiscountPricingStrategy implements PricingStrategy {
    private double discountRate;

    public DiscountPricingStrategy(double discountRate) {
        this.discountRate = discountRate;
    }

    public double calculatePrice(Rental rental) {
        return rental.getCost() * (1 - discountRate);
    }
}
