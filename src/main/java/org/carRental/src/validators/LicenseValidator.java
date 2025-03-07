package org.carRental.src.validators;

import org.carRental.src.models.Client;

public class LicenseValidator extends RentalValidator {

    public static boolean validateCNH(String cnh) {
        if (!cnh.matches("\\d{11}")) {
            return false;
        }

        int[] numeros = new int[11];
        for (int i = 0; i < 11; i++) {
            numeros[i] = Character.getNumericValue(cnh.charAt(i));
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += numeros[i] * (i + 1);
        }
        int resto = soma % 11;
        int primeiroDV = (resto == 10) ? 0 : resto;

        soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += numeros[i] * (i);
        }
        resto = soma % 11;
        int segundoDV = (resto == 10) ? 0 : resto;

        return (numeros[9] == primeiroDV) && (numeros[10] == segundoDV);
    }

    public boolean validate(Client client) {
        if(!validateCNH(client.getCnhNumber())) {
            return false;
        }
        return next == null ? true : next.validate(client);
    }
}

