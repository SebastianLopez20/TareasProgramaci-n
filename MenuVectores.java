
package menuvectores;

import java.util.Scanner;


public class MenuVectores {

    
    public static void main(String[] args) {
       int a = 0;
       int num1 = 0;
       int num2= 0;
       
       Scanner Sc = new Scanner(System.in);
       do{
           
           System.out.println("**Menu de Opciones**");
           System.out.println("1.- Ingrese el tamaño del vector");
           System.out.println("2.- Ingrese los elementos del vector");
           System.out.println("3.- Imprimir Vector");
           System.out.println("0.- Salir");
           a= Sc.nextInt();
       
       
       switch(a){
           case 1:
               a=1;
               System.out.println("INGRESE EL TAMAÑO DEL VECTOR");
               num1=Sc.nextInt();
               System.out.println("***********************************************");
               System.out.println("EL TAMAÑO INGRESADO DEL VECTOR ES DE  : "+num1);    
               System.out.println("***********************************************");
                break;
                
           case 2:
               a=2;
               System.out.println("INGRESE LOS ELEMENTOS DEACUERDO AL TAMAÑO DEL VECTOR");   
                num2=Sc.nextInt();
                break;
                   
           case 3:
               a=3;
               System.out.println("***************************************************");
               System.out.println("LOS VALORES INGRESADOS DEL VECTOR SON : "+ num2     );
               System.out.println("***************************************************");
               break;
               
           case 0:
               break;
    }
       
       }while(a!=0
               );
        System.out.println("Usted eligio salir, hasta luego");
    }
    
}
