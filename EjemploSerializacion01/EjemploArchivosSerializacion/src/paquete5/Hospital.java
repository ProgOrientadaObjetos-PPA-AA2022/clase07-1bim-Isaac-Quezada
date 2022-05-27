/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

import java.io.Serializable;

/**
 *
 * @author reroes
 */
public class Hospital implements Serializable{
    String nombre;
    int numeroCamas;
    double presupuesto;
    String idHospital;
    
    public Hospital(String n, int nc , double p){
        nombre = n;
        numeroCamas = nc;
        presupuesto = p;
        
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecernumeroCamas(int nc){
        numeroCamas = nc;
    }
    
    public void establecerpresupuesto(double p){
        presupuesto = p;
    }
    
    public void estableceridHospital(String id){
        idHospital = id;
    }
    
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenernumeroCamas(){
        return numeroCamas;
    }
    
    public double obtenerpresupuesto(){
        return presupuesto;
    }
    
    public String obteneridHospital(){
        return idHospital;
    }
    @Override
    public String toString(){
        String valor = String.format("%s-%s-%s-%s\n", obtenerNombre(), 
                obtenernumeroCamas(),
                obtenerpresupuesto(),
                obteneridHospital());
        return valor;
    }
}

