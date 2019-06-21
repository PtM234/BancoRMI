/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi3;

import java.io.Serializable;

/**
 *
 * @author tapia
 */
public class Titular implements Serializable{
    
    private String nombre;
    private int clave;
    private String direccion;
    private String correo;
    
    public Titular(String name, int key, String address, String mail){
        this.nombre = name;
        this.clave = key;
        this.direccion = address;
        this.correo = mail;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }


    /**
     * @return the clave
     */
    public int getClave() {
        return clave;
    }


    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }


    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }
   

    
}
