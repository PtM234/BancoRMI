/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi3;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author tapia
 */
public class ImplementacionCuentaBancaria extends UnicastRemoteObject implements RemoteInterfaceCuentaBancaria {

    /**
     * @return the clave
     */
    public int getClave() {
        return clave;
    }
    
    public Titular dueno;
    private double saldo = 0;
    private int clave = 0;
    
    public ImplementacionCuentaBancaria(Titular t) throws RemoteException{
        this.dueno = t;
    }
    
    public ImplementacionCuentaBancaria(Titular t, int key) throws RemoteException{
        this.dueno = t;
        this.clave = key;
    }
    
    @Override
    public double revisarSaldo() throws Exception {
        return saldo;
    }

    @Override
    public void depositar(double monto) throws Exception {
        saldo += monto;
    }

    @Override
    public void sacar(double monto) throws Exception {
        if(this.saldo>monto){
        saldo -= monto;
        } else{
            System.out.println("No tienes dinero suficiente");
        }
    }

    @Override
    public Titular duenoCuenta() throws Exception {
        return dueno;
    }
    
}
