

package com.mycompany.operaciongenerico;

/**
 *
 * Boris Torres
 */
public class OperacionGenerico {

    public static void main(String[] args) {
        double suma = 0;
        double resta = 0;
        double multiplicacion = 0;
        double division = 0;
        
        Calculadora<Integer> cal = new Calculadora<Integer>(21, 5);
        
        System.out.println("Valor A: 21");
        System.out.println("Valor B: 5");
        System.out.println("");
        
        //suma
        suma = cal.calculadoraSuma();
        System.out.println("suma: "+suma);
        
        //resta
        resta = cal.calculadoraResta();
        System.out.println("resta: "+resta);
        
        //multiplicacion
        multiplicacion = cal.calculadoraMultiplicacion();
        System.out.println("multieplicación: "+multiplicacion);
        
        //division
        division = cal.calculadoraResta();
        System.out.println("Division: " +division);
        
        
        
        
        
    }
}
