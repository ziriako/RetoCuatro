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
public class TarjetaDebito extends CuentaBase{
    
    public TarjetaDebito(double apertura){
            super(apertura);
    }
    
    @Override
    public String tipoCuenta(){
        String cadena = "Tarjeta de débito";    
        return cadena;
    }
    
}