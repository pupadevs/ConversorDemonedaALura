package com.conversor.infrastructure.principal;

import com.conversor.entity.ConversionData;

import java.net.http.HttpResponse;

public interface ConversionInterface {

    String Conversion(double cantidad,String baseCode, String targetCode);



    ConversionData callToApi(String baseCode, String targetCode);
}
