package com.conversor.infrastructure.principal;

import com.conversor.app.service.ConvertirDeDollarADop;

import java.util.Scanner;

public class MenuPrincipal {

    private static Scanner input = new Scanner(System.in);

    public static void menuMonedas(){
        int opcion = 0;
        String msg = """
                Escoga una opcion...
                1.- Convertir De Dollar a Peso Dominicano
                2.- Convertir De Dollar a Peso Dominicano
                3.- Convertir De Dollar a Peso Mexicano
                4.- Convertir De Dollar a Peso Argentino
      
                """;
        do{
            System.out.println(msg);
            opcion = input.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Digite una cantidad");
                    Double cantidad = input.nextDouble();
                    ConvertirDeDollarADop convertirADop = new ConvertirDeDollarADop();
                   String resultado = convertirADop.Conversion(cantidad);
                    System.out.println("Su resultado de conversion es "+ resultado + "pesos");
                    break;


            }

        }while (opcion != 5);
    }
}
