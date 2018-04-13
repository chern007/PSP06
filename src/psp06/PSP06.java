/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package psp06;

import java.util.Scanner;

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
        
        do{
            System.out.println("Por favor introduzca su nombre:");
            
            respuesta = entrada.nextLine();
            
            
        }while(!compruebaReglas(respuesta));
        
        

        
        
    }
    
            public static boolean compruebaReglas(String nombre){            
            
            int longitud = nombre.length();
            String nombreCorrecto = nombre.toLowerCase();                  
            
            
            if (longitud==8 && nombre == nombreCorrecto) {
                return true;
            }else{
                return false;
            }
            
        }
    
}
