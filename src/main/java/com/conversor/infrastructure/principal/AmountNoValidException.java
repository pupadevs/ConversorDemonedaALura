package com.conversor.infrastructure.principal;

public class AmountNoValidException extends RuntimeException {

    public AmountNoValidException(){
        super("Cantidad no valida. Vuelva a intentarlo");
    }
}
