/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglo1;
import java.util.Arrays;
import java.util.Scanner;

public class Arreglo1 {
    /**
     * @param args the command line arguments
     */
   public static Scanner s = new Scanner(System.in);
   @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
            // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String [] Array5 = new String[] { "Nombre",      "Apellido",    "Carrera de Estudio",    "Lugar Trabajo " };
        String [] Array = new String[] {  "Elizabeth",   "Martinez",    "Ing. en Produccion",    "Maquila "};
        String [] Array1 = new String[] { "Jony",        "Palacios",    "Ing. en Produccion",    "Diunsa "};
        String [] Array2 = new String[] { "German",      "Rivera",      "Ing. en Computacion",   "Cemcol "};
        String [] Array3 = new String[] { "Belky",       "Soriano",     "Ing. en Produccion",    "alcon "};
        String [] Array4 = new String[] { "alejandro",   "Maldonado",   "Ing. en Computacion",   "Acosa "};
        
         System.out.println(Arrays.asList(Array5)); 
         System.out.println(Arrays.toString(Array));
         System.out.println(Arrays.asList(Array1));
         System.out.println(Arrays.asList(Array2));
         System.out.println(Arrays.asList(Array3));
         System.out.println(Arrays.asList(Array4));
         
         
    }
}
    

       
        
        
