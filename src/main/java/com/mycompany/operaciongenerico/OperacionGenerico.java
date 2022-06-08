

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
        
        //suma
        suma = cal.calculadoraSuma();
        System.out.println(suma);
        
        //resta
        resta = cal.calculadoraResta();
        System.out.println(resta);
        
        //multiplicacion
        multiplicacion = cal.calculadoraMultiplicacion();
        System.out.println(multiplicacion);
        
        //division
        division = cal.calculadoraResta();
        System.out.println(division);
        
        
        
        
        
    }
}
