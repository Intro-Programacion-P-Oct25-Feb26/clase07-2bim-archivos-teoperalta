/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lectura04;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Procesos {

    public static void promedio() {

        try {
            double suma = 0;
            int contador = 0;
            Scanner entrada = new Scanner(new File("data/datosDos.txt"));
            while (entrada.hasNext()) {
                String linea = entrada.nextLine();
                List<String> lista = Arrays.asList(linea.split("\\|"));
                ArrayList<String> linea_partes = new ArrayList<>(lista);
                String variable = linea_partes.get(3);
                double valor = Double.parseDouble(variable);
                suma = suma + valor;
                contador = contador + 1;

            }
            double promedio = suma / contador;
            System.out.printf("%.2f", promedio);

        } catch (Exception e) {
            System.out.println("Error al leer del archivo.");
        }

    }
}
