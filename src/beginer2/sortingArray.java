/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginer2;
import java.util.*;

/**
 *
 * @author George
 */
public class sortingArray {
    public static void main(String args []){
       int[] arr = {12,45,78,02};
       java.util.Arrays.sort(arr);
       for(int e : arr){
           System.out.print(e+ " ");
       }
      // java.util.binarySearch(arr, 02);
    }
    
}
