package com.conversor.infrastructure;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

public class ApiRequest {

    public static HttpResponse<String> makeRequest(String baseCode, String targetCode){
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
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }


        client.close();
        /* Lanzo exception */
     /*   if (response.statusCode() == 404) {
        }
        if (response.statusCode() == 403) {

        }*/

        return response;
    }
}
