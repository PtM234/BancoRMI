/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi3;
import java.rmi.Remote;
import java.util.ArrayList;

/**
 *
 * @author tapia
 */
public interface RemoteInterfaceBanco extends Remote{
    public RemoteInterfaceCuentaBancaria crearCuenta(Titular t, double saldo) throws Exception;
    public RemoteInterfaceCuentaBancaria crearCuentaKey(Titular t, int clave, double saldo) throws Exception;
    public ArrayList<RemoteInterfaceCuentaBancaria> listaCuentas() throws Exception;
}
