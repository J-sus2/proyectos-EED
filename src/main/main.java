/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import interfaces.Ventana1;

/**
 *
 * @author Valeria
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       
      
       Ventana1 ventana = new Ventana1(); 
       ventana.setVisible(true);
       
       Grafo nodo = new Grafo();
       Grafo arista = new Grafo();
       nodo.NuevoNodo("A");
       nodo.NuevoNodo("B");
       arista.NuevaArista("A", "B");
       nodo.ImprimirGrafo();
        
    }
    
}
