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
public class Servidores {
    
    public static void main(String[] args) throws Exception {
        
        
        CreateQueue colaS1 = new CreateQueue();
        CreateQueue colaS2 = new CreateQueue();
        
        
        colaS1.push(10);
        colaS1.push(20);
        colaS1.push(24);
        colaS1.push(14);
        colaS1.push(10);
        
        colaS2.push(10);
        colaS2.push(20);
        colaS2.push(24);
        colaS2.push(14);
        colaS2.push(10);

        
        int ciclo1 = 0;
        int ciclo2 = 0;
        
        //int cicloS1 = 1;
        //int cicloS2 = 2;

        while (!colaS1.isEmpty())
        {
            ciclo1++;
            ciclo2+=2;
            
            if(ciclo1 == (int) colaS1.peek()) {
                System.out.println("Servidor 1");
                System.out.println("Se ha eliminado el paquete de tamaño: " + colaS1.pop());
                ciclo1=0;
                
            }
            
            if(!colaS2.isEmpty()) {
                if(ciclo2 == (int) colaS2.peek()) {
                System.out.println("Servidor 2");
                System.out.println("Se ha eliminado el paquete de tamaño: " + colaS2.pop());
                ciclo2=0;
                }
            }
            
            
        }
        
        
        
        
            
    }

    
    
}
