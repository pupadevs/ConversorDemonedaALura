package com.conversor.infrastructure.principal;

import com.conversor.entity.CurrencyData;

public interface ConversionInterface {

    CurrencyData converter(double cantidad, String baseCode, String targetCode);



    CurrencyData callToApi(String baseCode, String targetCode);
}
