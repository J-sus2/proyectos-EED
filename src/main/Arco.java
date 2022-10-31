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
public class Arco {
    Object destino;
    double peso;
    Arco siguiente;
    
    public Arco(Object d) {
        destino = d;
        siguiente = null;
    }
    
    public Arco(int d, double p) {
        this(d);
        peso = p;
        siguiente = null;
    }
}
