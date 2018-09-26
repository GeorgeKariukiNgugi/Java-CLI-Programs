/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginer2;

/**
 *
 * @author George
 */
public class adongo {
    
    public static void main(String args []){
         double i;
         double j = 1;
         double k = 0;
        for(i = 1; i<= 2; i++){
         if(i%2 == 1){
           k+=i;
           j*=i;   
         }
        }
                   
        
       System.out.printf("THE PRODUCT OF THE NUMBERS IS : %.0f \n",j);  
        System.out.printf("the sum of the two numbers is : %.0f \n",k);
        System.out.printf("the numbers is : %.0f \n",i-1);
    
    }
    
}
