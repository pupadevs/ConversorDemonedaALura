package com.conversor.app.service;

import com.conversor.entity.CurrencyData;
import com.conversor.infrastructure.request.ApiRequest;
import com.conversor.infrastructure.principal.ConversionInterface;

import java.io.IOException;
import java.net.http.HttpResponse;

public class CurrencyConverter implements ConversionInterface {


    @Override
    public CurrencyData converter(double cantidad, String baseCode, String targetCode) {
        CurrencyData currency = callToApi(baseCode, targetCode);
        currency.setCantidad(cantidad);
        currency.currencyConverter();
        return   currency;
    }

    @Override
    public CurrencyData callToApi(String baseCode, String targetCode) {

        HttpResponse<String> response = null;
        try {
            response = ApiRequest.makeRequest(baseCode, targetCode);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        return  ToJson.toJson(response);
    }


}
