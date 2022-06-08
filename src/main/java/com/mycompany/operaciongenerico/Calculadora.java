
package com.mycompany.operaciongenerico;


public class Calculadora <T> {
    
    private T primerV;
    private T segundoV;
    
    
    
    public Calculadora(){
        
    }
    
    public Calculadora(T primerV, T segundoV){
        this.primerV = primerV;
        this.segundoV = segundoV;
    }
    
    void calculadoraSuma(){
        System.out.println("26.1");
        
                
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
