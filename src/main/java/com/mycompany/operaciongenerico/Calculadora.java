
package com.mycompany.operaciongenerico;


public class Calculadora <T extends Number> {
    
    private T primerV;
    private T segundoV;
    
    
    
    public Calculadora(){
        
    }
    
    public Calculadora(T primerV, T segundoV){
        this.primerV = primerV;
        this.segundoV = segundoV;
    }
    
    //suma
    public double calculadoraSuma(T primerV, T segundoV){
        double total = primerV.doubleValue()+ segundoV.doubleValue();
        
        return total;         
    }
    
    public double calculadoraSuma(){
        if (primerV == null && segundoV == null) {
            return 0;
        } else {
            return primerV.doubleValue() + segundoV.doubleValue();
        }         
    }
    
    
    
    //resta
    public double calculadoraResta(T primerV, T segundoV){
        double total = primerV.doubleValue()- segundoV.doubleValue();
        
        return total;         
    }
    
    public double calculadoraResta(){
        if (primerV == null && segundoV == null) {
            return 0;
        } else {
            return primerV.doubleValue() - segundoV.doubleValue();
        }         
    }
    
    

    //multiplicacion
    public double calculadoraMultiplicacion(T primerV, T segundoV){
        double total = primerV.doubleValue()* segundoV.doubleValue();
        
        return total;         
    }
    
    public double calculadoraMultiplicacion(){
        if (primerV == null && segundoV == null) {
            return 0;
        } else {
            return primerV.doubleValue() * segundoV.doubleValue();
        }         
    }
    
    //division
    public double calculadoraDivision(T primerV, T segundoV){
        double total = primerV.doubleValue()/ segundoV.doubleValue();
        
        return total;         
    }
    
    public double calculadoraDivision(){
        if (primerV == null && segundoV == null) {
            return 0;
        } else {
            return primerV.doubleValue() / segundoV.doubleValue();
        }         
    }
    
  
    public T getPrimerV() {
        return primerV;
    }

   
    public void setPrimerV(T primerV) {
        this.primerV = primerV;
    }

  
    public T getSegundoV() {
        return segundoV;
    }

   
    public void setSegundoV(T segundoV) {
        this.segundoV = segundoV;
    }
    
    

   
    
    
    
    
    
}
