/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura04;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Principal {
 

    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal = "";

        System.out.println("Ingrese de cuántas personas se llevará registro: ");
        int numero = entrada.nextInt();
        
     
        entrada.nextLine(); 


        String cedulaN;

        for (int i = 0; i < numero; i++) {
            cadenaFinal = "";
            
            System.out.println("Ingrese su nombre:");
            String nombre = entrada.nextLine(); 
            
            System.out.println("Ingrese su correo:");
            String correo = entrada.nextLine();
            
            System.out.println("Ingrese su cédula:");
            cedulaN = entrada.nextLine();
            
            cadenaFinal = String.format("%s%s, %s, %s%n", cadenaFinal, nombre, correo, cedulaN);
             Procedimiento.crearArchivo(cedulaN, cadenaFinal);
        }
  
        
        entrada.close(); 
    }
}
