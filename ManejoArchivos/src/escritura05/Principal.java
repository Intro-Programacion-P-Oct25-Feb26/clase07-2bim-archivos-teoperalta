/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import escritura04.Procedimiento;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Principal {
    public static void main(String args[]) {
        Scanner entrada = new Scanner(System.in);
        String cadenaFinal;
  

        boolean bandera = true;
        while (bandera) {
       
            
            System.out.println("Ingrese su nombre:");
            String nombre = entrada.nextLine(); 
            
            System.out.println("Ingrese su cedula:");
            String cedula = entrada.nextLine(); 
            
            System.out.println("Ingrese su placa:");
            String placa = entrada.nextLine();
            String inicial = placa.substring(0, 1);
            
            System.out.println("Ingrese su marca :");
            String marca = entrada.nextLine();
            System.out.println("Desea ingresar mas datos?");
            String opcion = entrada.nextLine();
             if (opcion.equals("No")) {
                bandera = false;
            } else {
                bandera = true;
            }
            cadenaFinal = "";
            cadenaFinal = String.format("%s%s, %s, %s, %s%n", cadenaFinal, nombre, cedula, placa, marca);
             Datos.crearArchivo(inicial, cadenaFinal);
        }
       entrada.close(); 
    }
    
}
