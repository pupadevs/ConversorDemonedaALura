package com.conversor.entity;

public class ConversionData {
    String base_code;
    String target_code;
    Double conversion_rate;

    public ConversionData(String base_code, String target_code, Double conversion_rate) {

        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
    }

    public String getBase_code() {
        return base_code;
    }

    public String getTarget_code() {
        return target_code;
    }

    public Double getConversion_rate() {
        return conversion_rate;
    }

    public Double currencyConverter(Double cantidad){
        return cantidad * this.conversion_rate;
    }

    public String toString() {

        return null;
    }

}
