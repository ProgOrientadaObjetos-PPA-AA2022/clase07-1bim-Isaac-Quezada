/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author Matias Quezada
 */
public class ejecutor2 {
    public static void main(String[] args) {
        String nombreArchivo = "data/Hospital.data";
        String cedula_buscar = "1152";
        Hospital buscar;
        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerIdentificador(cedula_buscar);
        lectura.establecerBuscado();
        buscar = lectura.obtenerBuscado();
        if(buscar!=null){
            System.out.println(buscar);
        }else{
            System.out.println("Profesor no encontrado");
        }
    }
}
