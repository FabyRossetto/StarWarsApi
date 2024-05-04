/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Principal;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Faby
 */
public class Principal {

    public static void main(String[] args) {
        ConsultaPelicula peli= new ConsultaPelicula();
        Scanner Leer = new Scanner(System.in);
        System.out.println("Indique el numero de la pelicula que desea consultar"); 
        
        try{
            
        var numeroDePelicula= Integer.valueOf(Leer.next()) ;
        Pelicula pelicula=peli.buscaPelicula(numeroDePelicula);
        System.out.println("La pelicula elegida de Star Wars es: " + pelicula);
        GeneradorDeArchivos gen= new GeneradorDeArchivos();
        gen.guardarJson(pelicula);
        }catch(NumberFormatException e){
            System.out.println("Numero erroneo");
        }catch(RuntimeException |  IOException e){
            System.out.println(e.getMessage());
            System.out.println("Finalizando la aplicacion");
         
    }
}
}
