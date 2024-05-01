package com.conversor.app.service;

import com.conversor.entity.CurrencyData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.http.HttpResponse;

public class ToJson {

    public static CurrencyData toJson(HttpResponse<String> response){
        Gson gson = new GsonBuilder().create();

        CurrencyData conversion = gson.fromJson(response.body(), CurrencyData.class);
       return conversion;

    }
}
