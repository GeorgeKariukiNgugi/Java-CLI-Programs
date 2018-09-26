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
public class gcd {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int gcd = 1;
     int gcd2 = gcd;
    System.out.println("ENTER THE FIRST NUMBER:");
    int fno = input.nextInt();
    System.out.println("ENTER THE SECOND NUMBER:");
    int sno = input.nextInt();
    if(fno>=sno){
        while(gcd <= sno){
            if(fno%gcd  == 0 &&  sno%gcd == 0){
             gcd2 = gcd;  
            }                       
            ++gcd;
            
        }
           System.out.println("THE GCD OF THE TWO NUMBERS IS  1st :: " + gcd2);  
    }
    else if(sno >= fno){
        
    while(gcd <= fno){
            if(fno%gcd  == 0 &&  sno%gcd == 0){
             gcd2 = gcd;  
            }                       
            ++gcd;
            
        }
           System.out.println("THE GCD OF THE TWO NUMBERS IS 2nd :: " + gcd2);  
    }
}
}