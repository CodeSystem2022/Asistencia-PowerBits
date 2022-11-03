/*
    EJERCICIO 11: Diseñar un programa que muestre el producto de los 10 primero numeros impares
    Hacerlo en JOptionPane
 */

// Mendez Lucas 

package ciclos11;

import javax.swing.JOptionPane;

public class Ciclos11 {

    public static void main(String[] args) {

        long producto = 1;
        for(int i = 1; i <= 20; i += 2){
            producto *= i;
        }
        JOptionPane.showMessageDialog(null, "El producto de los numero impares es: "+producto);
    }   
}


// Machuca Juan 

package ciclos12;

import java.util.Scanner;

//import javax.swing.JOptionPane;

public class Ciclos12 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        long factorial = 1; 
        
        System.out.println("Digite un numero: ");
        int numero = Integer.parseInt(entrada.nextLine());
        //int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite un numero: "));
        for(int i = 1; i <= numero; i++){
            factorial *= i;
        }
        
        System.out.println("\nEl factorial del numero ingresado es: "+factorial);
        //JOptionPane.showMessageDialog(null, "El factorial del numero ingresado es: "+factorial);
        
        
    }
}
 

//Machuca Nicolás
package domain;

public class Persona{
    protected String nombre;
    protected char genero;
    protected int edad;
    protected String direccion;
    
    //constructor vacio: este es para crear objetos sin necesidad de inicializar
    //los atributos de la clase
    public Persona(){//Constructor1
        
    }
    public Persona(String nombre){//Constructor2
           this.nombre = nombre;
    }

    public Herencia(String nombre, char genero, int edad, String direccion) {//Constructor3
        this.nombre = nombre;
        this.genero = genero;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return this.direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public char getGenero() {
        return this.genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Herencia{" + "nombre=" + nombre + ", genero=" + genero + ", edad=" + edad + ", direccion=" + direccion + '}';
    }
    
}
package test;

import dominio.Persona;
public class PersonaPrueba {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Osvaldo", 57000,false);
        System.out.println("El nombre de persona1 es: "+persona1.getNombre());
        System.out.println("El sueldo de persona1 es: "+persona1.getSueldo());
        System.out.println("El boooleano de persona1 es: "+persona1.isEliminado());
        
        //Modificamos a traves de los metodos
        persona1.setNombre("Juan Igancio");
        System.out.println("El nuevo nombre de persona1 es: "+persona1.getNombre());
        //persona1.nombre = "Antonela";      //No se pueden usar porque los atributos son privados
        //System.out.println("El nombre de persona1 es: "persona1.nombre);
        
        //Tarea: Crear otro objeto de tipo persona, asiganr valores de manera inicial e imprimirlos,
        //Luego modificar sus valores y volver a imprimirlos
        Persona persona2 = new Persona("Nadia",120000,true);
          System.out.println("\nEl nombre de persona2 es: "+persona2.getNombre());
        System.out.println("El sueldo de persona2 es: "+persona2.getSueldo());
        System.out.println("El boooleano de persona2 es: "+persona2.isEliminado());
        
        //Modificamos los datos de persona2
        persona2.setNombre("Antonela");
        persona2.setSueldo(140000);
        persona2.setEliminado(false);
         System.out.println("\nEl nuevo nombre de persona2 es: "+persona2.getNombre());
         System.out.println("El nuevo sueldo de persona2 es: "+persona2.getSueldo());
         System.out.println("El nuevo booleano de persona2 es: "+persona2.isEliminado()); 
    }
}
