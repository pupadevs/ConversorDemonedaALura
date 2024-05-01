package com.conversor.infrastructure.principal;

import com.conversor.app.service.CodeRates;
import com.conversor.app.service.CurrencyConverter;

import java.util.Scanner;

public class MenuPrincipal {

    private static Scanner input = new Scanner(System.in);

    public static void menuMonedas() {
        int opcion = 0;
        Double cantidad;
        String msg = """
                Escoga una opcion...
                1.- Convertir De Dollar a Peso Dominicano
                2.- Convertir De Dollar a Peso Colombiano
                3.- Convertir De Dollar a Peso Mexicano
                4.- Convertir De Dollar a Peso Argentino
                5.- Convertir las monedas a su eleccion.
                      
                """;
        CurrencyConverter convertirADop = new CurrencyConverter();

        do {
            System.out.println(msg);
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Digite una cantidad");
                    cantidad = input.nextDouble();
                    String resultado = convertirADop.Conversion(cantidad, CodeRates.USD.getCode(), CodeRates.DOP.getCode());
                    System.out.println("Su resultado de conversion es " + resultado + "pesos");
                    break;
                case 2:
                    System.out.println("Digite una cantidad");
                    cantidad = input.nextDouble();
                   resultado= convertirADop.Conversion(cantidad, CodeRates.USD.getCode(), CodeRates.COP.getCode());
                    System.out.println("Su resultado de conversion es " + resultado + "pesos");


                    break;
                case 5:
                    System.out.println("Escriba el base code");
                    String baseCode = input.nextLine();
                    System.out.println("Escriba el targetCode");
                    String targetCode = input.nextLine();
                    System.out.println("Digite una cantidad");
                    cantidad = input.nextDouble();


            }

        } while (opcion != 6);
    }
}
