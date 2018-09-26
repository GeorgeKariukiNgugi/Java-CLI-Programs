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
public class copyarray {
    public static void main (String args []){
        int[] arr1 = new int[5];
        int[] arr2 = new int[5];
        int k;
        int j;
        int m;
        // THIS CODE ATTEMPS TO COPY ARRAYS FROM ONE TO ANOTHER.
        System.out.println("THE FIRST ARRAY IS AS SHOWN BELOW.");
      for(int i = 1 ; i<=4;i++){
           //System.out.println(i);
           j = i-1;
           // System.out.println(j);
            k = i+j;
           //System.out.println(k);
           
           arr1[i] = k;
           System.out.println("ELEMENT "+ i +" "+ arr1[i]);
      }
      
      // COPYINg FROM NE ARRAY TO THE OTHER.
       System.out.println("THE SECOND ARRAY IS AS SHOWN BELOW.");
      for(int i = 1 ; i<=4;i++){
          m =  arr1[i]+1;
         arr2[i] = m;
          System.out.println("ELEMENT "+ i + " "+ arr2[i]);
      }
      
    }
    
}
