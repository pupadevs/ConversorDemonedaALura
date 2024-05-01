package com.conversor.infrastructure.principal;

import com.conversor.app.service.CodeRates;
import com.conversor.app.service.CurrencyConverter;
import com.conversor.entity.CurrencyData;
import com.conversor.infrastructure.Table;
import com.conversor.infrastructure.input.ValidInput;
import java.util.List;
import java.util.Scanner;
public class Switch {
    public static int switchMenu( Scanner input){
        double amount ;
        int option;
        final String msg = """
                Seleccione una option...
                7.- Salir de la Application
                1.- Convertir De Dollar a Peso Dominicano
                2.- Convertir De Dollar a Peso Colombiano
                3.- Convertir De Dollar a Peso Mexicano
                4.- Convertir De Dollar a Peso Argentino
                5.- Convertir las monedas por código.
                6.- Ver Lista de códigos
                      
                """;
        String msgCantidad = "Digite una cantidad";
        double verify;
        CurrencyData resultado;
        CurrencyConverter currencyConverter = new CurrencyConverter();
        option = ValidInput.pedirEntero(input, msg);
        switch (option) {

            case 1:
                amount = ValidInput.validCantidad(input, msgCantidad);
                verify = verifyCantidad(amount);
                resultado = currencyConverter.converter(verify, CodeRates.USD.getCode(), CodeRates.DOP.getCode());
                Table.tablero(resultado);
                break;
            case 2:
                amount = ValidInput.validCantidad(input, msgCantidad);
                verify = verifyCantidad(amount);
                resultado = currencyConverter.converter(verify, CodeRates.USD.getCode(), CodeRates.COP.getCode());
                Table.tablero(resultado);
                break;
            case 3:
                amount = ValidInput.validCantidad(input, msgCantidad);
                verify = verifyCantidad(amount);
                resultado = currencyConverter.converter(verify, CodeRates.USD.getCode(), CodeRates.MXN.getCode());
                Table.tablero(resultado);
                break;
            case 4:
                amount = ValidInput.validCantidad(input, msgCantidad);
                verify = verifyCantidad(amount);
                resultado = currencyConverter.converter(verify, CodeRates.USD.getCode(), CodeRates.ARS.getCode());
                Table.tablero(resultado);
            case 5:
                input.nextLine();
                System.out.println("Escriba el base code");
                String baseCode = input.nextLine();
                System.out.println("Escriba el targetCode");
                String targetCode = input.nextLine();
                System.out.println(msgCantidad);
                amount = input.nextDouble();
                verify = verifyCantidad(amount);

                resultado = currencyConverter.converter(verify, baseCode, targetCode);
                Table.tablero(resultado);

                break;

            case 6:
                List<String> codes = CodeRates.getAllCodes();
                for( String code : codes){
                    System.out.println(code);
                }
                break;

        }
        return option;
    }
    private static Double verifyCantidad(double cantidad) {

        if (cantidad < 0) {
            throw new AmountNoValidException();
        }
        return cantidad;
    }
}
