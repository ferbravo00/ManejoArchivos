/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import manejoarchivos.*;

/**
 *
 * @author Alumno Mañana
 */
public class Principal {
    
    
    public static void main(String[] args) {
        String nombreArchivo = "prueba2.txt";
        String contenido = "Hola esto es una prueva";
        ManejoArchivos.crear(nombreArchivo);
        ManejoArchivos.escribir(nombreArchivo, contenido);
        ManejoArchivos.agregar(nombreArchivo, " para ver si funciona");
        ManejoArchivos.leerPorPalabra(nombreArchivo);
    }
    
}
