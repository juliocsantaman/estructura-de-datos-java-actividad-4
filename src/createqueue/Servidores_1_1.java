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
public class Servidores_1_1 {
    
    public static void main(String[] args) throws Exception {
        
        
        CreateQueue colaS1 = new CreateQueue();
        CreateQueue colaS2 = new CreateQueue();
        CreateQueue colaP = new CreateQueue();
        
        
        
        /*colaS1.push(10);
        colaS1.push(20);
        colaS1.push(24);
        colaS1.push(14);
        colaS1.push(10);
        
        colaS2.push(10);
        colaS2.push(20);
        colaS2.push(25);
        colaS2.push(15);
        colaS2.push(10);*/
        
        /*colaP.push(10);
        colaP.push(20);
        colaP.push(24);
        colaP.push(14);
        colaP.push(10);
        
        colaP.push(10);
        colaP.push(20);
        colaP.push(25);
        colaP.push(15);
        colaP.push(10);*/
        
        //Rellenamos la colaP con 60 valores aleatorios de 1 a 60.
        for(int i=1; i<=60; i++) {
            colaP.push((int) (Math.random() * 60 + 1));
        }
        
        //Inicializamos la colaS1 y la colaS2.
        colaS1.push(colaP.pop());
        colaS2.push(colaP.pop());
        
        

        //Inicializamos nuestros ciclos, ciclo1 -> servidor1, ciclo2 -> servidor2.
        int ciclo1 = 0;
        int ciclo2 = 0;
        
        //Variable que me dice el total de paquetes procesados.
        int totalP=0;
        
        //Mientras la colaS1 no este vacía o colaS2 no este vacía.
        while (!colaS1.isEmpty() || !colaS2.isEmpty())
        {
            //Vamos aumentando los ciclos por cada vuelta, s1 aumenta 1 y s2 aumenta 2.
            ciclo1++;
            ciclo2+=2;
           
            if(ciclo1 == (int) colaS1.peek()) {
                System.out.println("Servidor 1");
                System.out.println("Se ha eliminado el paquete de tamaño: " + colaS1.pop());
                ciclo1=0;
                totalP++;
                System.out.println();
                
            if(!colaP.isEmpty()) {
                
                colaS1.push(colaP.pop());
            }
                
            }
            
            if(!colaS2.isEmpty()) {
                if(ciclo2 == (int) colaS2.peek()) {
                System.out.println("Servidor 2");
                System.out.println("Se ha eliminado el paquete de tamaño: " + colaS2.pop());
                ciclo2=0;
                totalP++;
                
                    System.out.println();
                
                if(!colaP.isEmpty()) {
                    
                        colaS2.push(colaP.pop());
                }
                
                
                } else if(ciclo2 > (int)  colaS2.peek()) {
                    int valor = (int) colaS2.pop();
                    
                    System.out.println("Servidor 2");
                    System.out.println("Se ha eliminado el paquete de tamaño: " + valor);
                    ciclo2= ciclo2 - valor;
                    totalP++;
                    System.out.println();
                    
                    if(!colaP.isEmpty()) {
                        
                        colaS2.push(colaP.pop());
                    }
                    
                }
            }
            

            
            
        }
        
        
        //Mostramos el total de paquetes procesados.
        System.out.println("Total de paquetes procesados es: " + totalP);
        
            
    }

    
    
}
