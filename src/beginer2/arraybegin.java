/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginer2;

import java.util.Scanner;

/**
 *
 * @author George
 */
public class arraybegin {
    public static void main( String args []){
        //int[] arrs = {};
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER THE NUMBER OF ARRAY ELEMENTS YOU NEED.");
        int numbers = input.nextInt();
        int no = 0;
        int average = 0;
        int sum = 0;
        int[] arr = new int[numbers];
        while(no < numbers){
            arr[no] = (int)(Math.random()*10);
            System.out.println(no +" "+ arr[no]);
             sum += arr[no];
            no++;
            //sum += arr[no];
        }
        average = sum/numbers;
        
       System.out.println("SUM IS     :" + sum + "       AVERAGE IS     :" + average); 
      /* for(int i = 0; numbers <= numbers ; i++){
           if(arr[i] > average){
              // System.out.println("THE NUMBERS THAT ARE ABOVE AVERAE ARE AS FOLLOWS: ");
              int num = arr[i];
               System.out.println(" " + num + " ");
           }*/
      for (int e : arr){
          if(e >= average){
              System.out.println(e);
          }
      }
       }
    }
    

