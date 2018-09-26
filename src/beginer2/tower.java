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
public class tower {
    public static void main(String args []){
        int number1 = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("PLEASE ENTER A NUMBER?");
        int number = input.nextInt();
        while(number1 <= number){
            int number2 = 1;
            while(number2 <= number1){
                System.out.printf("%d",number1);
                number2++;
            }
            System.out.println();
            number1++;
        }
        
     
    }
    
}
