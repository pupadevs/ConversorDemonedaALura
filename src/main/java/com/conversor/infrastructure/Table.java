package com.conversor.infrastructure;

import com.conversor.entity.CurrencyData;

public class Table {

    public static void tablero(CurrencyData currencyData) {
        System.out.println("+-------------------+-------------------+------------------------+------------------+------------------------+");
        System.out.println("|    Base Code      |    Target Code    |    converter Rate     |     Cantidad     |    Target Full Name    |");
        System.out.println("+-------------------+-------------------+------------------------+------------------+------------------------+");
        System.out.println(currencyData.toString());
        System.out.println("+-------------------+-------------------+------------------------+------------------+------------------------+");
    }
}
