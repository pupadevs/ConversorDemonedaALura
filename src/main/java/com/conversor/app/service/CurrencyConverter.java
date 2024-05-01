package com.conversor.app.service;

import com.conversor.entity.CurrencyData;
import com.conversor.infrastructure.request.ApiRequest;
import com.conversor.infrastructure.principal.ConversionInterface;

import java.net.http.HttpResponse;
import java.text.DecimalFormat;

public class CurrencyConverter implements ConversionInterface {


    @Override
    public CurrencyData Conversion(double cantidad, String baseCode, String targetCode) {

        CurrencyData currency = callToApi(baseCode, targetCode);
        currency.setCantidad(cantidad);
        currency.currencyConverter();


        DecimalFormat df = new DecimalFormat("#.##");

        // Formatear el número
      //  String formattedNumber = df.format(resultado);
        return   currency;
    }

    @Override
    public CurrencyData callToApi(String baseCode, String targetCode) {

        HttpResponse<String> response = ApiRequest.makeRequest(baseCode, targetCode);
        CurrencyData data = ToJson.toJson(response);

        return data;
    }


}
