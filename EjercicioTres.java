
package ejerciciotres;

public class EjercicioTres {

    
    public static void main(String[] args) {
        
/*Conducta
9-10	A	         
8-8.99	B	
7-7.99	C	
6-6.99	D	
< 6	E*/	
        
        
        double notaConducta= 8.5;
        
        if (notaConducta > 9 && notaConducta <= 10){
            System.out.println("Su nota en conducta es A.");
            
            

        }else if (notaConducta > 8 && notaConducta <= 8.99){
            System.out.println("Su nota en conducta es B.");
            
            
            
        }else if (notaConducta > 7 && notaConducta <= 7.99){
            System.out.println("Su nota en conducta es C.");
            
            
        }else if (notaConducta > 6 && notaConducta <= 6.99){
             System.out.println("Su nota en conducta es D.");
             
             
             
        }else if (notaConducta < 6 && notaConducta >= 0){
            System.out.println("Su nota en conducta es E.");
            
            
            
            
        }else{
            System.out.println("Problema en su nota de conducta, acercarse a secretaria.");
        }
             
           
    }
    
}
