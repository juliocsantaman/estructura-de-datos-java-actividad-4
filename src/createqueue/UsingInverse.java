/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createqueue;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class UsingInverse {
    
    public static void main(String[] args) {
        
        /*
            Nota: Realicé mi método inverse en el fichero CreateQueue.
            
        */
        
        CreateQueue miCola = new CreateQueue();
        
        System.out.println("Valores actuales sin hacer el inverso.");
        
        miCola.push("Valor 1");
        miCola.push("Valor 2");
        miCola.push("Valor 3");
        miCola.push("Valor 4");
        
        miCola.show();
        
        System.out.println();
        
        System.out.println("Valores actuales con el método inverse.");
        miCola.inverse();
        
        miCola.show();
        
        
        
    }
    
}
