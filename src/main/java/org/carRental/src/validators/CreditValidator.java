package org.carRental.src.validators;

import org.carRental.src.models.Client;

public class CreditValidator extends RentalValidator {
    public static boolean validateCreditCard(String creditCardNumber) {
        if (!creditCardNumber.matches("\\d{13,19}")) {
            return false;
        }

        int soma = 0;
        boolean dobrar = false;

        for (int i = creditCardNumber.length() - 1; i >= 0; i--) {
            int digito = Character.getNumericValue(creditCardNumber.charAt(i));

            if (dobrar) {
                digito *= 2;
                if (digito > 9) {
                    digito -= 9;
                }
            }

            soma += digito;
            dobrar = !dobrar;
        }

        return soma % 10 == 0;
    }

    public boolean validate(Client client) {
        if(!validateCreditCard(client.getCreditCardNumber())) {
            return false;
        }
        return next == null ? true : next.validate(client);
    }
}
