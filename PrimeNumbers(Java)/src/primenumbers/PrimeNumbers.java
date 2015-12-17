/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primenumbers;

/**
 *
 * @author Ke'Ondrae
 */

import java.util.Scanner;
public class PrimeNumbers {

    
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       int num1;
       int num2;
       //String Again;
       
       
       
       System.out.println("Welcome To the prime Number program.");
       
       System.out.println("Please enter one number : ");
        num1 = input.nextInt();
       
       System.out.println("please enter another number : ");
        num2 = input.nextInt();
       
       System.out.println("The numbers you've entered are " + num1 + ", " + num2);
       
       //Space
       System.out.println("");
       
       System.out.println("The prime numbers that are between " + num1 + " and " + num2 + " are: ");
       
       for (int num = num1; num <= num2; num++) {
           
           if (PrimeMethod(num)) {
               
               System.out.println(num);
           }
       }
    } 
    
           //True False Method 
       static boolean PrimeMethod(int Meth) {
           
       if (Meth <= 1) {
           
           return false;
       }
       
       for (int num = 2; num < Math.sqrt(Meth); num++) {
           
           if (Meth % num == 0) {
               
               return false;
           }
       }
       return true;
          
    }
}