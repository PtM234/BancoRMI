/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**
 *
 * @author tapia
 */
public class ImplementacionBanco extends UnicastRemoteObject implements RemoteInterfaceBanco {
    ArrayList<RemoteInterfaceCuentaBancaria> cuentas;
    
    public ImplementacionBanco() throws RemoteException{
        cuentas  = new ArrayList<RemoteInterfaceCuentaBancaria>();
    }
    
    @Override
    public RemoteInterfaceCuentaBancaria crearCuenta(Titular t, double saldo) throws Exception {
        RemoteInterfaceCuentaBancaria rcb = new ImplementacionCuentaBancaria(t);
        rcb.depositar(saldo);
        cuentas.add(rcb);
        
        return rcb;
    }

    @Override
    public ArrayList<RemoteInterfaceCuentaBancaria> listaCuentas() throws Exception {
        return cuentas;
    }

    @Override
    public RemoteInterfaceCuentaBancaria crearCuentaKey(Titular t, int clave, double saldo) throws Exception {
        RemoteInterfaceCuentaBancaria rcb = new ImplementacionCuentaBancaria(t, clave);
        rcb.depositar(saldo);
        return rcb;
    }

}
