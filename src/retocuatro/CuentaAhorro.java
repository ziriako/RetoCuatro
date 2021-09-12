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
public class CuentaAhorro extends CuentaBase{
    
    protected double interes;
    
    public CuentaAhorro(double montoActual, double apertura, double interes){
            super(montoActual, apertura);
            this.interes=interes;
    }
    
    @Override
    public String tipoCuenta(){
        String cadena = "Cuenta de Ahorro";    
        return cadena;
    }
    
    public void invertir(){
        setSaldo(getSaldo()+(getSaldo()*(this.interes))); 
    }
    
}
