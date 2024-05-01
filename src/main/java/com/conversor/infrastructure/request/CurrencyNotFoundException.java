package com.conversor.infrastructure.request;

public class CurrencyNotFoundException extends RuntimeException {

    public CurrencyNotFoundException(){
        super("Curency not found");
    }
}
