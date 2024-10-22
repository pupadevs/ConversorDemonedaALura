package com.conversor.infrastructure.request;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;


public class ApiRequest {

    public static HttpResponse<String> makeRequest(String baseCode, String targetCode) throws IOException, InterruptedException {
        // Crear un cliente HTTP
        HttpClient client = HttpClient.newHttpClient();
        // Construir la URL con los parámetros proporcionados


        // Construir la URL con los parámetros proporcionados
        var baseUrl = "https://v6.exchangerate-api.com/v6/52cf820351779d38cb0661f3/pair/";
        String url = baseUrl + baseCode + "/" + targetCode;


        // Construir la solicitud HTTP GET
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        // Enviar la solicitud y recibir la respuesta
        HttpResponse<String> response;

            response = client.send(request, HttpResponse.BodyHandlers.ofString());


        client.close();
        /* Lanzo exception */
        if (response.statusCode() == 400) {
            throw new CurrencyNotFoundException();
        }
        if (response.statusCode() == 404) {
            throw new CurrencyNotFoundException();
        }

        return response;
    }
}
