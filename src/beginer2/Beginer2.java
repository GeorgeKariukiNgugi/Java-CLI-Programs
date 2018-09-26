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
public class Beginer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       // public static void main(String [] args){
       Scanner input = new Scanner(System.in);
       int rows ,number,mpya;
       System.out.println("ENTER THE NUMBER OF ROS YOU WANT TO APPEAR ON THE PYRAMID?");
       rows = input.nextInt();
       final int ROWS = rows;
       number = 1;  
      while(rows>=number){
          if(rows==1){
              break;
          } 
         System.out.printf("%d",rows);  
         rows--;
       }
        while(number <= ROWS){
           
           System.out.printf("%d",number);
           number++;
       }
      
   }
    }
    

