/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Valeria
 */


public class Grafo {
   
    private NodoGrafo primero;
    private NodoGrafo ultimo;
    
    public Grafo(){
        primero = null;
        ultimo = null;
    }
    public boolean EsVacio(){
        return primero == null;
    }
    
    public boolean ExisteVertice(Object dato){
        boolean existe = false;
        if(!EsVacio()){
            NodoGrafo temp = primero;
            while(temp != null && !existe){
                if(temp.dato.toString().equals(dato.toString())){
                    existe = true;
                }
            }
        }
        return existe;
    }
    
    public void NuevaArista(Object origen, Object destino){
        if(ExisteVertice(origen) && ExisteVertice(destino)){
            NodoGrafo posicion = primero;
            while(!posicion.dato.equals(origen.toString())){
                posicion = posicion.siguiente;
            }
        }
    }
    
    public void NuevoNodo(Object dato){
        if(!ExisteVertice(dato)){
            NodoGrafo nodo = new NodoGrafo(dato);
            if(EsVacio()){
                primero = nodo;
                ultimo = nodo;
            }else{
                if(dato.toString().compareTo(primero.dato.toString())<=0){
                    nodo.siguiente = primero;
                    primero = nodo;
                }else{
                    if(dato.toString().compareTo(ultimo.dato.toString())>=0){
                        ultimo.siguiente = nodo;
                        ultimo = nodo;
                    }else{
                        NodoGrafo temp = primero;
                        while(dato.toString().compareTo(temp.dato.toString())<0){
                            nodo.siguiente = temp.siguiente;
                            temp.siguiente = nodo;
                        }
                    }
                }
            }
        }
    }
    public String ImprimirGrafo(){
        String cadena = "";
        NodoGrafo temp = primero;
        while(temp != null){
            cadena = cadena + temp.dato.toString()+"|"+temp.lista.toString()+"\n";
            temp = temp.siguiente;
        }
        return cadena;
    }
  
}
