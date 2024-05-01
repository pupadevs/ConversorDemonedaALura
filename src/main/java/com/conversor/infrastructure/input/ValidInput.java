package com.conversor.infrastructure.input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ValidInput {

    public static int pedirEntero(Scanner input, String mensaje) {
        int option = 0;
        do {
            try {
                System.out.println(mensaje);
                option = input.nextInt();
            } catch (InputMismatchException e) {
                System.err.println("Error: Debes introducir un número entero válido.");
                // Limpiar el buffer del scanner
                input.nextLine();
            }
        } while (option == 0); // Cambia esta condición según tus necesidades
        return option;
    }

    public static Double validCantidad(Scanner input, String mensaje) {
        double cantidad = 0d;
        do {
            try {
                System.out.println(mensaje);
                cantidad = input.nextDouble();
            } catch (InputMismatchException e) {
                System.err.println("Error: Debes una cantidad validad.");
                // Limpiar el buffer del scanner
                input.nextLine();
            }
        } while (cantidad == 0); // Cambia esta condición según tus necesidades
        return cantidad;
    }
}
