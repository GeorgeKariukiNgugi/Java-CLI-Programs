/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beginer2;
//import java.util.Scanner;
import java.util.Scanner;
/**
 *
 * @author George
 */ 
//import beginner1.*;

public class Beginner1_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int radius , area;
        final int PI = 3;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The Radius Of Your Circle: ");
        radius = input.nextInt();
        area = PI*radius*radius;
        System.out.print("The area of this circle is:"+area+"\n");
    }
    
}
