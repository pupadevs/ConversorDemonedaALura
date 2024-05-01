package com.conversor.infrastructure.principal;

import com.conversor.infrastructure.request.CurrencyNotFoundException;

import java.util.Scanner;

public class MenuPrincipal {

    private static final Scanner input = new Scanner(System.in);

    public static void currencyMenu() {
        int option;
        try {
            do {

              option=  Switch.switchMenu(input);

            } while (option != 7);
        } catch (CurrencyNotFoundException | AmountNoValidException e) {
            System.err.println(e.getMessage());
        }
    }



}
