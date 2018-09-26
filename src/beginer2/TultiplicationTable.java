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
public class TultiplicationTable {
    public static void main ( String args []){
        
        int first;
        int second;
        
        // THE MULTIPLICATION TABLE BEGINS HERE.
        
        for(first = 1 ;first<=9;first++){
           // System.out.println(first+"|");
         //  System.out.println("\n ===============================================================");
            for(second = 1; second <= 9;second++){
                System.out.printf("%4d ",first*second);
            }
            System.out.println();
           
            
            
        }
    }
}
