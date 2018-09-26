/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginer2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author George
 */
public class distinct {
    public static void main(String args[]){
        Integer[] array = {1,2,7,2,1,8,7,9,5,1,7,5,3};
        // TRANSFORMING THE ARRAY TO AN ARRAYLIST.
        ArrayList<Integer> arrays = new ArrayList<>(Arrays.asList(array));
        int length = arrays.size();
        //System.out.println(length);
       /* for(int i = 0; i<= length-1; i++){
        System.out.println(arrays.get(i));
        }*/
       int i = 0;
       int num = 0;
      /* while(i<=length){
         int number = arrays.get(i);
         if(arrays.get(i) == number){
             
         ++num;
         System.out.println( number + "    " +num);
         }
         else{
         ++i;
         }
       }*/
     // for(int k = 0;i<=length ;k++){
          for(int j : arrays){
              int k = j;
              if(j == k){
                
              }
         // }
      
      }
    }
}
