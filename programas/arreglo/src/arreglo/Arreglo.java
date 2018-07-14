package arreglo;

import static java.time.Clock.system;
import java.util.Scanner;


public class Arreglo {

    public static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
            
        String nombres [] = new String [10];
        
        System.out.println("Ingrese primer nombre de su compañero de clase:");
        nombres [0]= s.nextLine();
       
       System.out.println("Ingrese segundo nombre de su compañero de clase:");
        nombres [1]= s.nextLine();

         System.out.println("Ingrese tercer nombre de su compañero de clase:");
        nombres [2]= s.nextLine();
        
        System.out.println("Ingrese cuarto nombre de su compañero de clase:");
        nombres [3]= s.nextLine();
        
        System.out.println("Ingrese quinto nombre de su compañero de clase:");
        nombres [4]= s.nextLine();
        
        System.out.println("Ingrese sexto nombre de su compañero de clase:");
        nombres [5]= s.nextLine();
        
        System.out.println("Ingrese septimo nombre de su compañero de clase:");
        nombres [6]= s.nextLine();
        
        System.out.println("Ingrese octavo nombre de su compañero de clase:");
        nombres [7]= s.nextLine();
        
        System.out.println("Ingrese noveno nombre de su compañero de clase:");
        nombres [8]= s.nextLine();
        
        System.out.println("ingrese desimo nombre de su compañero de clase:");
        nombres [9]= s.nextLine();
        
        System.out.println("el primer nombre es:"+nombres[0]);
        System.out.println("el segundo nombre es:"+nombres[1]);
        System.out.println("el tercer nombre es:"+nombres[2]);
        System.out.println("el cuarto nombre es:"+nombres[3]);
        System.out.println("el quinto nombre es:"+nombres[4]);
        System.out.println("el sexto nombre es:"+nombres[5]);
        System.out.println("el septimo nombre es:"+nombres[6]);
        System.out.println("el octavo nombre es:"+nombres[7]);
        System.out.println("el noveno nombre es:"+nombres[8]);
        System.out.println("el decimo nombre es:"+nombres[9]);
        
        // TODO code application logic here
    }
    
}
