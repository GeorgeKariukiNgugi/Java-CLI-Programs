/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginer2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author George
 */
public class arrayList {
    public static void main(String args []){
        Integer arr[] = {1,2,3,4,1,2,5,3,5};
          Arrays.toString(arr);
        int length = arr.length;
        
        // CREATING AN ARRAY LIST.
        
       // ArrayList<Integer> array = new ArrayList<>(Array.asList(arr));
       System.out.println(length);
        ArrayList<Integer> arrays = new ArrayList<>(Arrays.asList(arr));
        /*for(Integer e : arrays){
           /* while(e == 2){
                arrays.remove(e);
                // System.out.println(length);
            }*/
           
        //}
         int two = arrays.size();
         System.out.println(arrays.get(7));
         System.out.println(two);
          arrays.remove(4);
           System.out.println(arrays.get(4));
         
           for(int e: arrays){
           System.out.print(e);
           }
           
          
    }
    
}
