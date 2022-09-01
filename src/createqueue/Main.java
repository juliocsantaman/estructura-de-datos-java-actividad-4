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
public class Main {
    
    public static void main(String[] args) {
        
        CreateQueue miCola = new CreateQueue();
        
        miCola.push("Persona 1");
        miCola.push("Persona 2");
        miCola.push("Persona 3");
        
        miCola.show();
        
        System.out.println("Tamaño actual de la cola: " + miCola.size() + ".");
        
        try {
            miCola.pop();
        } catch (Exception e) {
            System.out.println(e);
        }
        
        System.out.println();
        miCola.show();
        
        System.out.println("Tamaño actual de la cola: " + miCola.size() + ".");
        
        if(miCola.isEmpty()) {
            System.out.println("La cola está vacía.");
        } else {
            System.out.println("La cola no está vacía.");
            System.out.println("Tamaño actual de la cola: " + miCola.size() + ".");
        }
        
        
        try {
            System.out.println("Primer valor actual de la cola es: " + miCola.peek() + ".");
        } catch (Exception e) {
            System.out.println(e);
        }
        
        miCola.show(1);
    }
    
}
