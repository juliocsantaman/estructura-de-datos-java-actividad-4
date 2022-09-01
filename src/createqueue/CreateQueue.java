/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createqueue;

import java.util.Stack;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class CreateQueue<E> {   
    //Capacidad del arreglo, ponemos un número muy grande para 
    //simular capacidad infinita
    public static final int CAPACITY = 1000;
    
    
    //Lugar para guardar los valores.
    private E[] data;
    
    //La cantidad de elementos de la cola.
    private int size=0;
    
    //Crea un objeto de tipo cola
    public CreateQueue() {
        this.data = (E[]) new Object[this.CAPACITY];
    }
    
    //Regresa TRUE si la cola está vacía.
    public boolean isEmpty() {
        return (this.size==0);
    }
    
    //Regresa el tamaño de la cola.
    public int size(){
        return (this.size);
    }
    
    //Añade un elemento al tope de la cola.
    
    public void push(E value) {
        //Agrega en el tope de la cola el valor correspondiente.
        this.data[this.size] = value;
        
        //Aumenta el tamaño de la cola.
        this.size++;
    }
    
    //Obtiene el primer elemento de la cola y lo borra de la misma.
    public E pop() throws Exception {
        E result=null;
        
        //Si está vacía la cola regresa una excepción.
        if(this.isEmpty()) {
            throw new Exception("La cola está vacía");
            
        }
        
        //Obtenemos el elemento de hasta delante.
        result = this.data[0];
        
        //Movemos todos los elementos una posición.
        for(int i=0; i<this.size-1; i++) {
            data[i] = data[i+1];
        }
        
        this.data[this.size] = null; //Garbage collector.
        
        //Disminuimos el tamaño de la cola.
        this.size--;
        
        return result;
        
        
    }
    
    //Obtiene el primer elemento de la cola sin borrarlo de la misma.
    public E peek() throws Exception {
        
        E result=null;
        
        //Si está vacía la cola regresa una excepción.
        /*if(this.isEmpty()) {
            throw new Exception("La cola está vacía");
            
        }*/
        
        result = this.data[0];
        
        return result;
    }
    
    //Validamos si la cola esta llena
    public boolean IsFull() {
        return size == CAPACITY-1;
    }
   
    //Muestra todos los elementos de la cola.
    public void show() {
        for(int i=0; i<this.size; i++) {
            System.out.println(this.data[i]);
        }
    }
    
    //Muestra el elemento dependiendo del indice.
    public void show(int index) {
        System.out.println(this.data[index]);
    }
    
    //MÉTODO INVERSE, INVIERTE LOS VALORES DE LA COLA.
    public void inverse() {
        
       Stack miPila = new Stack();
       
       for(int i=0; i<this.size; i++) {
           miPila.push(this.data[i]);
       }
       
       for(int i=0; i<this.size; i++) {
           this.data[i] = (E) miPila.pop();
       }
        
        
        
    }
    
      
    public static void main(String[] args) {
        
        
        
        
    }
    
}
