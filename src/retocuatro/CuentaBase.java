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
    
    private double saldo;
    private double apertura;
    
    public CuentaBase(double saldo, double apertura){
        this.saldo = saldo;
        this.apertura = apertura;
    }
    
    public String tipoCuenta(){
        return null;      
    }
    
    public double abrirCuenta(){
        return apertura;
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
    
    public void retirar(double retiro){ 
        this.saldo-=retiro; 
    }
    
    
}
