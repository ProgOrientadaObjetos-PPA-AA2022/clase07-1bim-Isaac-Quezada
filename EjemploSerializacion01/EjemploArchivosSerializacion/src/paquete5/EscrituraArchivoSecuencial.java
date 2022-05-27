/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


/**
 *
 * @author Matias Quezada
 */
public class EscrituraArchivoSecuencial {
    private String nombreArchivo;
    private ObjectOutputStream salida;
    private Hospital datos;
    private ArrayList<Hospital> lista;
    
    public EscrituraArchivoSecuencial(String nombreArchi) {
        nombreArchivo  = nombreArchi;
        establecerLista();
        try // abre el archivo
        {
            salida = new ObjectOutputStream(
                    new FileOutputStream(nombreArchivo));
            // proceso para ingresar nuevamente los valores del archivo
            if (obtenerLista().size() > 0) {
                for (int i = 0; i < obtenerLista().size(); i++) {
                    establecerDatos(obtenerLista().get(i));
                    establecerSalida();
                }
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al abrir el archivo.");
        } // fin de catch
    }
    
    
    public void establecerNombreArchivo(String n){
        nombreArchivo = n;
    }
    
    public void establecerDatos(Hospital p) {
        datos = p;
    }
    public void establecerSalida() {
        try {
            salida.writeObject(datos); 
        } catch (IOException ex) {
            System.err.println("Error al escribir en el archivo.");
        }
    }
    
    public void establecerLista() {
        LecturaArchivoSecuencial l = new LecturaArchivoSecuencial(obtenerNombreArchivo());
        l.establecerListaCalificaciones();
        lista = l.obtenerlista();
    }
    
    public String obtenerNombreArchivo(){
        return nombreArchivo;
    }
    public ArrayList<Hospital> obtenerLista() {
        return lista;
    }
    public ObjectOutputStream obtenerSalida(){
        return salida;
    }
    public void cerrarArchivo() {
        try // cierra el archivo
        {
            if (salida != null) {
                salida.close();
            }
        } // fin de try
        catch (IOException ioException) {
            System.err.println("Error al cerrar el archivo.");
            
        } // fin de catch
    }
}

    