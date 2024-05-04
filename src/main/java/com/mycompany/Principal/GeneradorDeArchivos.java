/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Principal;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author Faby
 */
public class GeneradorDeArchivos {
    
    public void guardarJson(Pelicula peli) throws IOException{
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter escritura= new FileWriter(peli.title() + ".json");
        escritura.write(gson.toJson(peli));
        escritura.close();
    }
    
}
