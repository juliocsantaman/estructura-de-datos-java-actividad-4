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
public class Servidores_1 {
    
    public static void main(String[] args) throws Exception {
        
        //Se establecen las pilas de trabajo con un buffer de 100 como maximo;
        CreateQueue colaS1 = new CreateQueue();
        CreateQueue colaS2 = new CreateQueue();
        
        //Llenamos las colas con 5 paquetes cada uno.
        colaS1.push(10);
        colaS1.push(20);
        colaS1.push(24);
        colaS1.push(14);
        colaS1.push(10);
        
        colaS2.push(10);
        colaS2.push(20);
        colaS2.push(25);
        colaS2.push(15);
        colaS2.push(10);

        //Se simula el tiempo donde 1 hora = 10 ciclos para fines practicos;
        int ciclo1 = 0;
        int ciclo2 = 0;
        //Por lo tanto Einstein producira un articulo cada 20 ciclos;
        int cicloS1 = 1; //30, 20.
        //mientras que el editor publicara cada 30 ciclos.
        int cicloS2 = 2;

        while (!colaS1.isEmpty()) // 24 Horas de trabajo
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
                } else if(ciclo2 > (int)  colaS2.peek()) {
                    int valor = (int) colaS2.pop();
                    
                    System.out.println("Servidor 2");
                    System.out.println("Se ha eliminado el paquete de tamaño: " + valor);
                    ciclo2= ciclo2 - valor;
                }
            }
            
            
        }
        
        
        
        
            
    }

    
    
}
