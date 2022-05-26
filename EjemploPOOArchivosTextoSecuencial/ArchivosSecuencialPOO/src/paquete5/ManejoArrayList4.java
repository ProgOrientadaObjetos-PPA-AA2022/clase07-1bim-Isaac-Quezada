/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.util.ArrayList;
import paquete1.Calificacion;
import paquete1.Profesor;
import paquete1.Empresa;
/**
 *
 * @author reroes
 */
public class ManejoArrayList4 {
    public static void main(String[] args) {
        
        Empresa empresa1 = new Empresa("Microsoft", "New York");
        Empresa empresa2 = new Empresa("Epic games", "Canada");
        Empresa empresa3 = new Empresa("Samsung", "Usa");
        Empresa empresa4 = new Empresa("Cantaclaro", "Loja");
        
        // ArrayList
        ArrayList <Empresa> empresas = new ArrayList<>();
        empresas.add(empresa1);
        empresas.add(empresa2);
        empresas.add(empresa3);
        empresas.add(empresa4);
        
        for (int i = 0; i < empresas.size(); i++) {
            System.out.printf("%s - %s\n", 
                    empresas.get(i).obtenerNombre(),
                    empresas.get(i).obtenerCiudad()); 
        }
    }
}

