/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp06;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author chern007
 */
public class PSP06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String respuesta;

        do {
            System.out.println("Por favor introduzca su nombre:");

            respuesta = entrada.nextLine();

        } while (!compruebaNombreUsuario(respuesta));

        do {
            System.out.println("Por favor introduzca el nombre del fichero:");

            respuesta = entrada.nextLine();

        } while (!compruebaNombreFichero(respuesta));

    }

    public static boolean compruebaNombreUsuario(String nombre) {

        int longitud = nombre.length();
        String nombreCorrecto = nombre.toLowerCase();

        if (longitud == 8 && nombre == nombreCorrecto) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean compruebaNombreFichero(String nombreFichero) {

        String patron = "(\\w{1,8})\\.(\\S{3})";

        Pattern r = Pattern.compile(patron);
        Matcher m = r.matcher(nombreFichero);
        if (m.find()) {
            System.out.println("Found value: " + m.group(0));
            System.out.println("Found value: " + m.group(1));
            System.out.println("Found value: " + m.group(2));
            return true;
        } else {
            return false;
        }

    }
}
