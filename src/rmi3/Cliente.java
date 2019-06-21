/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi3;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;

/**
 *
 * @author tapia
 */
public class Cliente {
        public static void main(String[] args) throws RemoteException, NotBoundException, Exception {
        RemoteInterfaceBanco rib; //Banco donde se almacenan las cuentas
        RemoteInterfaceCuentaBancaria rcb; //Cuenta bancaria
        Registry reg = LocateRegistry.getRegistry("127.0.0.1", 1234); //Se conecta a el registro que se hizo en el servidor
        rib = (RemoteInterfaceBanco) reg.lookup("Cuenta");  //Conectar interfaz banco con el que está en Stack
        Titular t = new Titular("pepe", 12, "Francisco Sarabia", "pepe@hotmail.com");
//        rcb = rib.crearCuenta(t, 5000);
//        rcb.depositar(2000);
        
        //rib.listaCuentas().get(0)
            //System.out.println(rcb.duenoCuenta().getNombre());
        //Titular e = new Titular("carlos", 14, "Aqui", "carlos@hotmail.com");
        //rcb = rib.crearCuenta(e, 5000);
            //System.out.println(rcb.duenoCuenta());
            
            
            //Retirar
//            for(int x=0;x<rib.listaCuentas().size();x++){
//                if(rib.listaCuentas().get(x).duenoCuenta().getClave() == 13){
//                    rcb = rib.listaCuentas().get(x);
//                    rcb.sacar(1000);
//                }
//            }
            
            //Depositar
//            
//            for(int x=0;x<rib.listaCuentas().size();x++){
//                if(rib.listaCuentas().get(x).duenoCuenta().getClave() == 13){
//                    rcb = rib.listaCuentas().get(x);
//                    rcb.depositar(1000);
//                }
//            }
        ArrayList<RemoteInterfaceCuentaBancaria> cuentas = rib.listaCuentas();
        for (RemoteInterfaceCuentaBancaria l: cuentas){
            Titular x = l.duenoCuenta();
            System.out.println(x.getNombre() + ": " + l.revisarSaldo()+ " Clave: " + x.getClave());
        }

    
        
        }

    
}
