
package tareacinco;


public class TareaCinco {

   
    public static void main(String[] args) {
        //Ejrc 1.- Calculo area de una circunferencia de 5 cm de radio
        
        double area;
        int radio = 5;
        area = Math.PI * Math.pow(radio,2);
        
        System.out.println("El area de un circulo de radio: "+radio+" es igual a "+area);
        
        //Ejrc2.- Exprecion
        
        int a=2;
        int b=2;
        int c=2;
        double r;
        
        r= a + b + c;
        r*=4;
        r/= 5 - 2;
        
        System.out.println("El resultado de la Exprecion es igual a: " +r);
        
        //Ejrc 3
        
        //Cast en tipos de datos primitivos en java
//El casting es un procedimiento para transformar una variable primitiva de un tipo a otro. 
//También se utiliza para transformar un objeto de una clase a otra clase siempre y cuando haya una relación de herencia entre ambas. 
//En este caso nos centraremos en el primer ripo de casting.
 //Dentro de este casting de variables primitivas se distinguen dos clases:  
    
    //Casting implícito
    //En este caso no se necesita escribir código para que la conversión se lleve a cabo. 
    //Ocurre cuando se realiza lo que se llama una conversión ancha (widening casting), es decir, cuando se coloca un valor pequeño en un contenedor grande.
       //Ejemplo de casting explícitos serían: 
        
       //int num1 = 100;
       //long num2 = num1;       // Un int cabe en un long
       //long num2 = 100;        // 100 en un int
       
      //Casting explícito
      
      //En el casting explícito sí es necesario escribir código. 
      //Ocurre cuando se realiza una conversión estrecha (narrowing casting), es decir, cuando se coloca un valor grande en un contenedor pequeño. 
      //Son susceptibles de pérdida de datos.
      
      //int num1 = 100;
      //short num2 = (short) num1;       // Aquí hace falta un casting explícito: short tiene menor rango que int
      
      //En este ejemplo, si se sustituye la primera línea int num1=100 por int num1=1000000, el código compilaría bien, pero habría pérdida de datos, pues el 1000000 se sale del rango de short, que comprende desde  -32768 a 32767. 
      //Al mostrar por consola el valor se obtendría un resultado incongruente.
      
      //double num1 = 25.5;
      //float num2 = (float) num1;
      //float num3 = 17.25;
      
      //En este ejemplo se hace un casting explícito en la segunda línea porque float es de menor rango que double. 
      //En la tercera línea el compilador avisaría de que hay un error: cuando escribimos directamente un número en decimal (como aquí el 17.25), Java lo interpreta siempre como un double; por eso sería necesario un casting explícito para que compilase:
        
      //float num3 = (float) num3;
      
       //conviene tener en cuenta lo siguiente:
       //No es posible realizar casting entre una variable primitiva  booleana y cualquier otra variable primitiva.
       //Sí es posible realizar casting entre una variable primitiva char y una variable primitiva que almacene enteros:
       
       
       //int num1 = 164;
       //char letra = (char) num1;
       //System.out.println(letra);
       //System.out.println((char) 164);
       
       //Siendo la salida del programa:
       //ñ-ñ
       
       //convertir desde     Convertir a...
 	                     //boolean	    byte       short	char	int	 long 	float	 double
        //boolean   	 	no 	     no 	no 	no 	no 	 no 	 no 
        //byte 	                no 	 	        si 	cast 	si 	 si 	 si 	  si 
        //short	                no 	    cast	 	cast 	si 	 si 	 si 	  si 
        //char	                no	    cast	cast	 	si 	 si 	 si 	  si 
        //int	                no	    cast	cast 	cast	 	 si 	 si* 	  si* 
        //long	                no	    cast	cast 	cast 	cast 	 	 si* 	  si* 
        //float	                no 	    cast 	cast 	cast 	cast 	 cast 	 	  si 
        //double	        no	    cast	cast	cast	cast 	 cast 	 cast 	 

        //Donde:
        
        //no: indica que no hay posibilidad de conversión.
        //si: indica que el casting es implícito.
        //si*: indica que el casting es implícito pero se puede producir pérdida de precisión.
        //cast: indica que hay que hacer casting explícito.
        
        

       
               
       

        
        
        
    }
    
   
    
}
