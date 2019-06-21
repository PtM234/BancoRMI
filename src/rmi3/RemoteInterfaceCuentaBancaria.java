/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi3;
import java.rmi.Remote;

/**
 *
 * @author tapia
 */
public interface RemoteInterfaceCuentaBancaria extends Remote {
    public double revisarSaldo() throws Exception;
    public void depositar(double monto) throws Exception;
    public void sacar(double monto) throws Exception;
    public Titular duenoCuenta() throws Exception;
}
