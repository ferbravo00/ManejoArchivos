/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
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
    
    
    
    
}
