/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura05;
import lectura05.Estadistica;
import java.util.ArrayList;

/**
 *
 * @author Usuario iTC
 */
public class Principal {
    public static void main(String args[]) {
    double promedio;
      promedio = Estadistica.obtenerPromedio();
      System.out.printf("El promedio de empleados es: %.2f\n", promedio);
    }
}
