

package com.mycompany.operaciongenerico;

/**
 *
 * Boris Torres
 */
public class OperacionGenerico {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Calculadora<Double> cal = new Calculadora<>();
        cal.setPrimerV(21.1);
        cal.setSegundoV(5.0);
        
        System.out.println("primer valor : "+cal.getPrimerV());
        System.out.println("segundo valor : "+cal.getSegundoV());

        System.out.println("");
        
        //resultado a suma
        cal.calculadoraSuma();
        
        
        
    }
}
