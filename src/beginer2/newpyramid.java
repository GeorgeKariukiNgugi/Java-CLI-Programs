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
import java.util.Scanner;
public class newpyramid {
 
public static void main (String args []){
    int rows ;
    
    
    Scanner input = new Scanner(System.in);
    //Scanner
    System.out.println("ENTER THE NUMBER OF ROWS YOU WISH TO VIEW nb.. THE NUMBER SHOULD BE LESS THEN 10 AND MORE THAN 0???");
    rows = input.nextInt();
    System.out.println(rows);
    if(rows > 0 && rows < 10){
        int begin = 0;
      
     // while (begin <= rows){
           int number = 1;
          while(number <= begin){
               
              System.out.println(number);
              number++;
          }
         // ++begin;
         // System.out.println(begin);
     // }
      
    }
} 
}
