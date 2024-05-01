package com.conversor.app.service;

import com.conversor.entity.ConversionData;
import com.conversor.infrastructure.ApiRequest;
import com.conversor.infrastructure.principal.ConversionInterface;

import java.net.http.HttpResponse;
import java.text.DecimalFormat;

public class CurrencyConverter implements ConversionInterface {


    @Override
    public String Conversion(double cantidad,String baseCode, String targetCode) {

        double resultado =  callToApi(baseCode, targetCode).currencyConverter(cantidad);;
        DecimalFormat df = new DecimalFormat("#.##");

        // Formatear el número
        String formattedNumber = df.format(resultado);
        return  formattedNumber;
    }

    @Override
    public ConversionData callToApi(String baseCode, String targetCode) {

        HttpResponse<String> response = ApiRequest.makeRequest(baseCode, targetCode);
        ConversionData data = ConvertirAJson.toJson(response);

        return data;
    }


}
