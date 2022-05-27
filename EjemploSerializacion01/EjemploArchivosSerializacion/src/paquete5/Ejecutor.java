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
public class Ejecutor {
    public static void main(String[] args) {
        
        
        //Nombre del Archivo
        
        String nombreArchivo = "data/Hospital.data";
        
        Hospital datos = new Hospital("Isidro Ayora ", 150 , 450.30);
        Hospital datos2 = new Hospital("Militar ", 155 , 550.30);
        Hospital datos3 = new Hospital("San Pablo ", 160 , 330.30);
        
        datos.estableceridHospital("1106012527");
        datos2.estableceridHospital("1527");
        datos3.estableceridHospital("1106");
        Hospital[] lista = {datos , datos2 , datos3 };
    
        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial(nombreArchivo);
        
        for (int i = 0; i < lista.length; i++) {
            // establecer el valor del atributo registro
            archivo.establecerDatos(lista[i]);
            // establecer en el archivo el atributo del registro
            archivo.establecerSalida();
        }
        
        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial(nombreArchivo);
        lectura.establecerListaCalificaciones();
        System.out.println(lectura);
    }
}
