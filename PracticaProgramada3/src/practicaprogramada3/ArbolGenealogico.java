/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practicaprogramada3;

/**
 *
 * @author user
 */
public class ArbolGenealogico {
    private Nodo raiz; 

    public ArbolGenealogico() {
        this.raiz = null; 
    }
    
    public Nodo getRaiz() {
        return raiz; 
    }

    
    public void construirArbolFamiliar() {
        // Nivel 0: Raíz
        Miembro abueloM = new Miembro("Abuelo");
        raiz = new Nodo(abueloM);

        // Nivel 1: Hijos del Abuelo
        Nodo padreN = new Nodo(new Miembro("Padre"));
        Nodo tioN = new Nodo(new Miembro("Tio"));
        
        // agregar  hijos padre y tio  a la raíz (Abuelo)
        raiz.setIzquierda(padreN);
        raiz.setDerecha(tioN);
        
        // Nivel 2: Hijos del Padre
        Nodo yoN = new Nodo(new Miembro("Yo"));
        Nodo hermanaN = new Nodo(new Miembro("Hermana"));
        
        padreN.setIzquierda(yoN);
        padreN.setDerecha(hermanaN);
        
        // Nivel 2: Hijos del Tío
        Nodo primo1N = new Nodo(new Miembro("Primo1"));
        Nodo primo2N = new Nodo(new Miembro("Primo2"));
        
        tioN.setIzquierda(primo1N);
        tioN.setDerecha(primo2N);
        
        System.out.println("Arbol familiar construido exitosamente.");
    }
    
    
    private void preordenFamiliar(Nodo n) {
        if (n != null) {
           System.out.print(n.getElemento().getNombre() + "");
            preordenFamiliar(n.getIzquierda());
            preordenFamiliar(n.getDerecha());
        }
    }
    
    public void mostrarPreorden() {
        System.out.println("\nRecorrido Preorden del Arbol Genealogico:");
        preordenFamiliar(raiz);
        System.out.println();
    }
}
