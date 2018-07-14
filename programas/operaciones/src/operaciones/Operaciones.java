
package operaciones;

import java.util.Scanner;


public class Operaciones {
    
    //Primer método: Retornar un mensaje que diga: "Soy el mejor programador".
    public void saludar (){
        System.out.println("soy el mejor programador \n");
    }
 
    public void nota (){
        int n;  
        Scanner lea;
        lea=new Scanner(System.in);
        System.out.println("ingrese la nota del alumno:" );
        n=lea.nextInt();
        if (n>70)
        {
    System.out.println("Aprobado \n");
    }
        else
       { System.out.println("Reprobado \n");} 
    }
    
    //
    public void suma() {
     int num1=4;
      int num2=6;
      int sum=num1+num2;
      System.out.println("\n *suma de dos numero*:");
      System.out.println("El primer numero es:"+num1);
      System.out.println("El segundo numero es:"+num2);
      System.out.println("La suma de los dos sumeros es:"+sum );
      }
   
     public void contador () {
   Scanner lea;
        lea=new Scanner(System.in);
        
        int x;
        int y;
        
        System.out.println(" \n Introdusca el parametro de entrada:");
        x=lea.nextInt();
        
        for( y=1; y<=x; y++){
            System.out.println("Muestra la lista de numeros:"+y);            
        }
}
    public void calculos() {
     Scanner lea;
     lea=new Scanner(System.in);
         double num1;
      double num2;
      double num3;
      double multiplicacion;
      double resta;
      
      System.out.println("\n *Ingrese tres numeros*");
      System.out.println("Ingrese el primer numero:");
      num1=lea.nextInt();
      System.out.println("Ingrese el segundo numero:");
      num2=lea.nextInt();
      System.out.println("Ingrese el tercer numero:");
      num3=lea.nextInt();
      
      multiplicacion= num1*num2*num3;
      resta= num1-num2-num3;
      System.out.println("La multiplicacion de los tres numeros es:"+multiplicacion);
      System.out.println("La resta de los tres numeros es:"+resta);
      }
}
