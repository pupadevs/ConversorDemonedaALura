package com.conversor.app.service;

import com.conversor.entity.ConversionData;
import com.conversor.infrastructure.ApiRequest;
import com.conversor.infrastructure.principal.ConversionInterface;

import java.net.http.HttpResponse;
import java.text.DecimalFormat;

public class ConvertirDeDollarADop implements ConversionInterface {
    private final String baseCode ="USD";
    private final String targetCode ="DOP";


    @Override
    public String Conversion(double cantidad) {

        double resultado = cantidad * callToApi().getConversion_rate();;
        DecimalFormat df = new DecimalFormat("#.##");

        // Formatear el número
        String formattedNumber = df.format(resultado);
        return  formattedNumber;
    }

    @Override
    public ConversionData callToApi() {

        HttpResponse<String> response = ApiRequest.makeRequest(this.baseCode, this.targetCode);
        ConversionData data = ConvertirAJson.toJson(response);

        return data;
    }


}
