/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

/**
 *
 * @author Faby
 */
public class ConsultaPelicula {
    
   
    
    public Pelicula buscaPelicula(int numeroDePelicula){
        
        URI direccion= URI.create("https://swapi.py4e.com/api/films/" + numeroDePelicula +"/");
    HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(direccion)
                        .build();
               
        try {
             HttpResponse<String> response;
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            
                String json = response.body();
                //System.out.println(json);

                
                return new Gson().fromJson(json, Pelicula.class);
                
        } catch (Exception e) {
            throw new RuntimeException("Pelicula no encontrada");
        }     
                

}
    
     
    
}
