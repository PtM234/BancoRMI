/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi3;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author tapia
 */
public class Servidor {
    public static void main(String[] args) {
        try{
            ImplementacionBanco ib = new ImplementacionBanco();
            Registry reg = LocateRegistry.createRegistry(1234);
            reg.bind("Cuenta", ib);
            System.out.println("Server on");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
