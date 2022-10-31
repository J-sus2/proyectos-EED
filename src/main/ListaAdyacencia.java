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
public class ListaAdyacencia {
    Arco primero;
    Arco ultimo;
    
    public ListaAdyacencia(){
        primero = null;
        ultimo = null;
    }
    
    public boolean EsVacia(){
        return primero == null;
    }
    
    public void NuevaAdy(Object destino){
        if(!adyacente(destino)){
            Arco nodo = new Arco(destino);
            Insertar(nodo, destino);
        }
    }
    
    public void NuevaAdy(Object destino, float peso){
        if(!adyacente(destino)){
            Arco nodo = new Arco(destino);
            Insertar(nodo,destino);
        }
    }
    
    public boolean adyacente(Object dato){
        Arco actual;
        boolean encontrado = false;
        actual = primero;
        
        while(actual != null && !dato.toString().equals(actual.destino.toString())){
            actual = actual.siguiente;
        }
        if(actual != null){
            encontrado = true;
        }return encontrado;
    }
    public void Insertar(Arco nodo, Object destino){
        
        if(EsVacia()){
            primero = nodo;
            ultimo = nodo;
        }else{
            if(destino.toString().compareTo(primero.destino.toString())<=0){
                nodo.siguiente = primero;
                primero = nodo;
            }else{
                if(destino.toString().compareTo(ultimo.destino.toString())>=0){
                    ultimo.siguiente = nodo;
                    ultimo = nodo;
                }else{
                    Arco posicion = primero;
                    while(destino.toString().compareTo(posicion.destino.toString())<0){
                        posicion = posicion.siguiente;
                    }
                    nodo.siguiente = posicion.siguiente;
                    posicion.siguiente = nodo;
                }
            }
        }
        
    }
    public String ImprimirLista(){
        String cadena = "";
        Arco temp = primero;
        while(temp != null){
            cadena = cadena + temp.destino.toString()+"|";
            temp = temp.siguiente;
        }
        return cadena;
    }
}
