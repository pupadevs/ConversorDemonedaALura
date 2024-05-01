package com.conversor.infrastructure.principal;

import com.conversor.app.service.CodeRates;
import com.conversor.app.service.CurrencyConverter;
import com.conversor.entity.CurrencyData;
import com.conversor.infrastructure.CurrencyNotFoundException;
import com.conversor.infrastructure.Table;
import com.conversor.infrastructure.input.ValidInput;

import java.util.Scanner;

public class MenuPrincipal {

    private static Scanner input = new Scanner(System.in);

    public static void menuMonedas() {
        int opcion = 0;
        Double cantidad = 0d;
        final String msg = """
                Escoga una opcion...
                1.- Convertir De Dollar a Peso Dominicano
                2.- Convertir De Dollar a Peso Colombiano
                3.- Convertir De Dollar a Peso Mexicano
                4.- Convertir De Dollar a Bolivar
                5.- Convertir las monedas a su eleccion.
                      
                """;
        String msgCantidad = "Digite una cantidad";
        Double verify;
        CurrencyConverter convertirADop = new CurrencyConverter();

        try {
            do {

                opcion = ValidInput.pedirEntero(input, msg);
                switch (opcion) {

                    case 1:
                        cantidad = ValidInput.validCantidad(input, msgCantidad);
                        verify = verifyCantidad(cantidad);
                        CurrencyData resultado = convertirADop.Conversion(verify, CodeRates.USD.getCode(), CodeRates.DOP.getCode());
                        Table.tablero(resultado);
                        break;
                    case 2:
                        cantidad = ValidInput.validCantidad(input, msgCantidad);
                        verify = verifyCantidad(cantidad);
                        resultado = convertirADop.Conversion(verify, CodeRates.USD.getCode(), CodeRates.COP.getCode());
                        Table.tablero(resultado);
                        break;
                    case 3:
                        cantidad = ValidInput.validCantidad(input, msgCantidad);
                        verify = verifyCantidad(cantidad);
                        resultado = convertirADop.Conversion(verify, CodeRates.USD.getCode(), CodeRates.MXN.getCode());
                        Table.tablero(resultado);
                        break;
                    case 4:
                        cantidad = ValidInput.validCantidad(input, msgCantidad);
                        verify = verifyCantidad(cantidad);
                        resultado = convertirADop.Conversion(verify, CodeRates.USD.getCode(), CodeRates.VEF.getCode());
                        Table.tablero(resultado);
                    case 5:
                        input.nextLine();
                        System.out.println("Escriba el base code");
                        String baseCode = input.nextLine();
                        System.out.println("Escriba el targetCode");
                        String targetCode = input.nextLine();
                        System.out.println(msgCantidad);
                        cantidad = input.nextDouble();
                        verify = verifyCantidad(cantidad);

                        resultado = convertirADop.Conversion(verify, baseCode, targetCode);
                        Table.tablero(resultado);


                }

            } while (opcion != 6);
        } catch (CurrencyNotFoundException | AmountNoValidException e) {
            System.err.println(e.getMessage());
        }


    }

    private static Double verifyCantidad(Double cantidad) {

        if (cantidad < 0) {
            throw new AmountNoValidException();
        }
        return cantidad;
    }


}
