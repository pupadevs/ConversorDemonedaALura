package com.conversor.app.service;

public enum CodeRates {
    USD("USD"),
    DOP("DOP"),
    MXN("MXN"),
    COP("COP"),
    ARS("ARS");
private String code;
    CodeRates(String ars) {
        this.code = ars;
    }
    public String getCode() {
        return code;
    }
}
