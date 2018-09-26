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

public class subtractions {
  public static void main(String args []){
      Scanner input = new Scanner(System.in);
      long starttime = System.currentTimeMillis();
      int count = 0;
      int corectcount =0;
      while(count<5){
          int number1 = (int)(Math.random()*10);
          int number2 = (int)(Math.random()*10);
          if(number1>number2){
              System.out.println("WHAT IS:  "+ number1 +   " - "  + number2);
              int guess = input.nextInt();
              if(guess == number1-number2){
                  corectcount++;
              }
             count++; 
          }  
      }
      long endtime = System.currentTimeMillis();
      long timetaken = ((endtime-starttime)/1000);
      if(corectcount <= 2){
          System.out.println("POOR SCORE.");
      }
      else if(corectcount == 3){
          System.out.println(" AVERAGE SCORE.");
      }
      else if( corectcount == 4){
          System.out.println(" GOOD SCORE.");
      }
      else{
          System.out.println(" EXCELLENT SCORE.");
      }
      System.out.println("YOU HAVE SCORED  "+corectcount+"  Out of 5");
      System.out.println("IT TOOK YOU :  " + timetaken + "  SECONDS FOR YOU TO DO IT.");
  }    
}
