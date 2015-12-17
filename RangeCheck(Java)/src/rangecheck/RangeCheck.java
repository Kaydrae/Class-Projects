/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rangecheck;

/**
 *
 * @author Ke'Ondrae
 */
import java.util.Scanner;
public class RangeCheck{

   
    public static void main(String[] args) {
       
        Scanner testNum1 = new Scanner (System.in);
       
        int setNum;
     
        System.out.println("Range Check!!!!!");
        System.out.println("Enter a number between 1 and 30 ");
        
        // Ignore just space
        System.out.println("");
         
        System.out.println("Your Number is?");
         int testNum = testNum1.nextInt();
         
         setNum = 15;
         
         if(testNum < setNum)
         {
         
        System.out.println("Your number is smaller");
             
         }
         else if(testNum == setNum)
         {
         
        System.out.println("Congratulations You have picked the correct number");
         
         }
         else
         {
         
        System.out.println("Your number is bigger");
         
         }
       
         
         
    }
    
}
