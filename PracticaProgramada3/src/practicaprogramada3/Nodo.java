/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprogramada3;

/**
 *
 * @author User
 */
public class Nodo {
    private Miembro elemento;
    private Nodo izquierda, derecha;

    public Nodo(Miembro elemento) {
        this.elemento = elemento;
        this.izquierda = this.derecha = null; 
    }

    public Miembro getElemento() {
        return elemento;
    }

    public void setElemento(Miembro elemento) {
        this.elemento = elemento;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    
    
}
