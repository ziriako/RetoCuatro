/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package retocuatro;

import java.util.Scanner;

/**
 *
 * @author Ziriako
 */
public class RetoCuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        boolean salir = false;
        int tipoCuenta;
        int operacion;
        
        TarjetaCredito credito = new TarjetaCredito(-100.00, 100.00 , 0.15);
        
        TarjetaDebito debito = new TarjetaDebito(900.00, 100.00);
        
        CuentaAhorro ahorro = new CuentaAhorro(3000.00, 1000.00, 0.10);
        
        //CuentaBase prueba = new CuentaBase();

        while(salir != true){
            
            System.out.println("Seleccione el tipo de cuenta: \n"
                    + "1.- Tarjeta de Crédito \n"
                    + "2.- Tarjeta de Débito \n"
                    + "3.- Cuenta de Ahorro \n"
                    + "4.- Salir \n");

            tipoCuenta = Integer.parseInt(entrada.nextLine()); 

            switch(tipoCuenta){
                
                case 1:
                    System.out.println("Usted seleccionó: \n" + credito.tipoCuenta() + "\n");

                    System.out.println("Seleccione la operación a realizar: \n"
                        + "1.- Consulta de saldo \n"
                        + "2.- Depósito \n"
                        + "3.- Retiro \n"
                        + "4.- Calcular Interés \n"
                    ) ;

                    operacion = Integer.parseInt(entrada.nextLine()); 

                    if(operacion == 1){
                        System.out.println("Su saldo es: \n" + credito.getSaldo()+ "\n");
                        
                    }
                    if(operacion == 2){
                        System.out.println("Ingrese la cantidad a depositar: \n");
                        double deposito = Double.parseDouble(entrada.nextLine());

                        credito.depositar(deposito);

                        System.out.println("Su saldo después del depósito es: \n" + credito.getSaldo() + "\n");
                        
                        break;
                    }
                    if(operacion == 3){
                        System.out.println("Ingrese la cantidad a retirar: \n");
                        double retiro = Double.parseDouble(entrada.nextLine());

                        credito.retirar(retiro);

                        System.out.println("Su saldo después del retiro es: \n" + credito.getSaldo() + "\n");
                    }
                    
                    if(operacion == 4){
                        System.out.println("Calculando interés, Espere... \n");
                        
                        credito.calcularInteres();

                        System.out.println("Su saldo después de calcular interés es: \n" + credito.getSaldo() + "\n");
                        
                        break;
                    }
                                        
                    break;
                
                case 2:
                    System.out.println("Usted seleccionó: " + debito.tipoCuenta()+ "\n");

                    System.out.println("Seleccione la operación a realizar: \n"
                        + "1.- Consulta de saldo \n"
                        + "2.- Depósito \n"
                        + "3.- Retiro \n");

                    operacion = Integer.parseInt(entrada.nextLine()); 

                    if(operacion == 1){
                        System.out.println("Su saldo es: \n" + debito.getSaldo() + "\n");
                        break;
                    }
                    if(operacion == 2){
                        System.out.println("Ingrese la cantidad a depositar: \n");
                        double deposito = Double.parseDouble(entrada.nextLine());

                        debito.depositar(deposito);

                        System.out.println("Su saldo después del depósito es: \n" + debito.getSaldo() + "\n");
                        
                        break;
                    }
                    if(operacion == 3){
                        System.out.println("Ingrese la cantidad a retirar: \n");
                        double retiro = Double.parseDouble(entrada.nextLine());

                        debito.retirar(retiro);

                        System.out.println("Su saldo después del retiro es: \n" + debito.getSaldo() + "\n");
                        
                        break;
                    }
                    
                case 3:
                    System.out.println("Usted seleccionó: " + ahorro.tipoCuenta()+ "\n");
                    
                    System.out.println("Seleccione la operación a realizar: \n"
                        + "1.- Consulta de saldo \n"
                        + "2.- Depósito \n"
                        + "3.- Retiro \n"
                        + "4.- Invertir \n");

                    operacion = Integer.parseInt(entrada.nextLine()); 

                    if(operacion == 1){
                        System.out.println("Su saldo es: \n" + ahorro.getSaldo() + "\n");
                        break;
                    }
                    if(operacion == 2){
                        System.out.println("Ingrese la cantidad a depositar: \n");
                        double deposito = Double.parseDouble(entrada.nextLine());

                        ahorro.depositar(deposito);

                        System.out.println("Su saldo después del depósito es: \n" + ahorro.getSaldo() + "\n");
                        
                        break;
                    }
                    if(operacion == 3){
                        System.out.println("Ingrese la cantidad a retirar: \n");
                        double retiro = Double.parseDouble(entrada.nextLine());

                        ahorro.retirar(retiro);

                        System.out.println("Su saldo después del retiro es: \n" + ahorro.getSaldo() + "\n");
                        
                        break;
                    }
                    if(operacion == 4){
                        System.out.println("Calculando interés, Espere... \n");
                        
                        ahorro.invertir();

                        System.out.println("Su saldo después de invertir es: \n" + ahorro.getSaldo() + "\n");
                        
                        break;
                    }
                    
                    
                    break;
                case 4:
                    salir = true;
                    break;
                            
            }
        }
    }
    
}
