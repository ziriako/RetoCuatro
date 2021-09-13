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
public class TarjetaCredito extends CuentaBase{
    
    protected double interes;
    
    public TarjetaCredito(double apertura, double interes){
            super(apertura);
            this.interes=interes;
    }
    
    @Override
    public String tipoCuenta(){
        String cadena = "Tarjeta de crédito";    
        return cadena;
    }
    public void calcularInteres(){
        setSaldo(getSaldo()+(getSaldo()*((this.interes)))); 
    }
}
