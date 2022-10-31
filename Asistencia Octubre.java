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
