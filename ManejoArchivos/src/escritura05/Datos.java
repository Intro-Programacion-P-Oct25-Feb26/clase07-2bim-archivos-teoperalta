/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escritura05;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.Formatter;

/**
 *
 * @author Usuario iTC
 */
public class Datos {

    public static void crearArchivo(String inicial, String mensaje) {

        try {
           
            if (inicial.equals("L")) {
                FileOutputStream fos = new FileOutputStream("data/PlacaLoja.txt", true);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);
                salida.format("%s", mensaje);
                salida.close();
            }
            if (inicial.equals("G")) {
                FileOutputStream fos = new FileOutputStream("data/PlacaGuayas.txt", true);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);
                salida.format("%s", mensaje);
                salida.close();
            }
            if (inicial.equals("P")) {
                FileOutputStream fos = new FileOutputStream("data/placaPichincha.txt", true);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);
                salida.format("%s", mensaje);
                salida.close();
            } else {
                FileOutputStream fos = new FileOutputStream("data/Datos sin categoría.txt", true);
                OutputStreamWriter osw = new OutputStreamWriter(fos);
                Formatter salida = new Formatter(osw);
                salida.format("%s", mensaje);
                salida.close();
            }

        } catch (Exception e) {
            System.err.println("Error al crear el archivo.");

        }
    }
}
