package com.conversor.infrastructure;

public class CurrencyNotFoundException extends RuntimeException {

    public CurrencyNotFoundException(){
        super("Curency not found");
    }
}
