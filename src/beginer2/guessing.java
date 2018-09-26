package beginer2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author George
 */
public class guessing {
    public static void main(String args []){
       Scanner input = new Scanner(System.in);
         int number = (int)((Math.random()*101));
         System.out.println("Enter a number that is Between 0 and 100");
          int guess = input.nextInt();
          while(guess!=number){
               if(guess<number){
                   System.out.println("THE NUMBER IS TOO LOW. TRY AGAIN.");
                   guess = input.nextInt();
               }
               else{
                   System.out.println("THE NUMBER IS TOO HIGH.TRY AGAIN");
                   guess = input.nextInt();
               }
          }
          
          System.out.print("HAIYA THE NUMBER IS CORRECT.");
    }
}
