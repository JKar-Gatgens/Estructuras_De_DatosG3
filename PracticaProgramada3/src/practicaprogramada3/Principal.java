/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaprogramada3;

/**
 *
 * @author User
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         ArbolGenealogico familia = new ArbolGenealogico();
        
        // crear arbol
        familia.construirArbolFamiliar();
        
        //mostrar
        familia.mostrarPreorden(); 
    }
 }
    

