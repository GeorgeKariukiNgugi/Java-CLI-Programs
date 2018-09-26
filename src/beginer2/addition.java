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
import java.util.*;
public class addition {
    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER HOW MANT NUMBER YOU WANT ADDED CHRONOLOGICALLY FROM ONE?");
        int number = input.nextInt();
        int sum = 0;
        int count = 1;
        while( count<= number){
            /*if(count == 0){
                continue;
            }*/
            sum+=count;
           System.out.print(count);
            count++;
            if(count<=number){
            System.out.print("+");
            }
        }
       // System.out.print("THE SUM OF THE FIRST  " + number+ " NUMBERS IS ");
                    System.out.println( "="+sum);
                     
    }
    
}
