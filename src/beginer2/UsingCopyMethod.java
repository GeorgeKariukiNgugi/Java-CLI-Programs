/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginer2;

import static java.lang.System.arraycopy;

/**
 *
 * @author George
 */
public class UsingCopyMethod {
    public static void main (String args []){
       // int[] arr1 = new int[3];
       /* arr1[1]= 4;
        arr1[0] = 8;
        arr1[2] = 78;*/
        int[] arr2 = new int[37];
        
        // COPYING THE TWO ARRAYS.
        int[] arr1 = {12,45,78};
        arraycopy(arr1,0,arr2,0,arr1.length);
        for(int e : arr2){
            System.out.println(e);
        }
    }
    
}
