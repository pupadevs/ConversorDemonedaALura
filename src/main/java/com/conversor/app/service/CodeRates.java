package com.conversor.app.service;

public enum CodeRates {
    USD("USD", "United States Dollar"),
    DOP("DOP", "Dominican Peso"),
    VEF("VEF", "Venezuelan Bolívar"),
    MXN("MXN", "Mexican Peso"),
    COP("COP", "Colombian Peso"),
    ARS("ARS", "Argentine Peso");

private String code;
private final  String fullName;

    CodeRates(String ars, String fullName) {
        this.code = ars;
        this.fullName = fullName;
    }
    public String getCode() {
        return code;
    }

    public String getFullName(){
        return fullName;
    }
}
