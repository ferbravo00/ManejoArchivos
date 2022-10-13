/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alumno Mañana
 */
public class ManejoArchivos {
    
    
    public static void crear(String nombre) {
        File archivo =new File(nombre);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.close();
            
        } catch (FileNotFoundException ex) {
            
            ex.printStackTrace(System.out);
            
        }
                
    }
    
    public static void escribir(String nombre,String contenido) {
        File archivo =new File(nombre);
        try {
            PrintWriter salida = new PrintWriter(archivo);
            salida.println(contenido);
            System.out.println("Se ha creado el fichero");
            salida.close();
            
        } catch (FileNotFoundException ex) {
            
            ex.printStackTrace(System.out);
            
        }
                
    }
    
    public static void agregar(String nombre,String contenido) {
        File archivo =new File(nombre);
        PrintWriter salida =null;
        try {
            salida = new PrintWriter(new FileWriter(nombre, true));
            salida.println(contenido);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } finally {
            salida.close();
        }
                
    }
    
    public static void leer(String nombre){
        BufferedReader entrada = null;
        File archivo =new File(nombre);
        try {
            entrada = new BufferedReader(new FileReader(archivo));
            String lectura = entrada.readLine();
            
            while(lectura != null){
                System.out.println("lectura = " + lectura);
                lectura = entrada.readLine();
            }
            entrada.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
    public static void leerPorPalabra(String nombre){
        File archivo =new File(nombre);
        try {
            Scanner entrada = new Scanner(archivo);
            int cont=0;
            while(entrada.hasNext()){
                String palabra = entrada.next();
                System.out.println(palabra);
                cont++;
            }
            System.out.println("Numero de palabras = "+cont);
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.out);
        }
    }
    
}
