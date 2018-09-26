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
public class arraylargest {
    public static void main (String args []){
        int number;
        int placing = 0;
        //double[] numbers = {};
        int largest = 0;
         int total = 0;
        System.out.println("ENTER THE NUMBER OF ARRAY ELEMENTS YOU WANT:");
        Scanner input =new Scanner(System.in);
        number = input.nextInt();
        //double[] numbers;
        int[] numbers = new int[number];
        while(placing < number){
            numbers[placing] = (int)(Math.random()*70);
            System.out.println( placing+ " " + numbers[placing]);
                    total += numbers[placing];
          placing++;
        }
       // System.out.println("THE LAREST NUMBER OF THE VALUES IS :"+largest);
       int max = numbers[0];
       for(int i = 1; i < numbers.length ; i++){
           if(numbers[i]> max){
               max = numbers[i];
           }
       }
        System.out.println("THE TOTAL NUMBER OF THE VALUES IS :"+total);
        System.out.println("THE LARGEST NUMBER  IS :"+ max);
    }
    
}
