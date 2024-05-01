package com.conversor.app.service;

import com.conversor.entity.ConversionData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.http.HttpResponse;

public class ConvertirAJson {

    public static ConversionData toJson(HttpResponse<String> response){
        Gson gson = new GsonBuilder().create();

        ConversionData conversion = gson.fromJson(response.body(), ConversionData.class);
       return conversion;

    }
}
