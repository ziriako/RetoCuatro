/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retocuatro;

/**
 *
 * @author Ziriako
 */
public class CuentaBase {
    
    protected double saldo;
    
    public CuentaBase(double apertura){
        this.saldo = apertura;
    }
    
    public String tipoCuenta(){
        return null;      
    }
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
      return this.saldo;
    }
    
    public void depositar(double deposito){ 
        this.saldo+=deposito; 
    } 
    
}
