package com.conversor.entity;

import com.conversor.app.service.CodeRates;

import java.text.DecimalFormat;

public class CurrencyData {
    private String base_code;
    private String target_code;
    private Double conversion_rate;
    private Double cantidad;
    private String formateddDouble;

    public CurrencyData(String base_code, String target_code, Double conversion_rate) {

        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
    }

    public void setCantidad(Double cantidad) {
        this.cantidad = cantidad;
    }

    public void currencyConverter() {


        DecimalFormat df = new DecimalFormat("#.##");

        // Formatear el número
        formateddDouble= df.format(cantidad * this.conversion_rate);
    }

    private String getFullName(String code) {
        for (CodeRates codeRate : CodeRates.values()) {
            if (codeRate.getCode().equals(code)) {
                return codeRate.getFullName();
            }
        }
        return ""; // Devuelve una cadena vacía si no se encuentra el código
    }

    @Override

    public String toString() {

        String targetFullName = getFullName(target_code);
        return String.format("| %-17s | %-17s | %-22s | %-16s | %-22s |",
                base_code,
                target_code,
                conversion_rate,
                formateddDouble,
                targetFullName
        );
    }


}

