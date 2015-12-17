/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ftoc;

/**
 *
 * @author Ke'Ondrae
 */

import java.util.Scanner;

public class FToC {

   
    public static void main(String[] args) {
       
        Scanner F = new Scanner (System.in);
        
        System.out.println("Welcome to my Faherenheit to celsius converter version 1.0");
        System.out.println("Please Enter The Temperature In Faherenheit");
        double Faherenheit = F.nextDouble( ); 
        
        System.out.println("The Temperature you've entered is " + Faherenheit + " Degrees Faherenheit");
        
        System.out.println("Which is ");
        
        double Celsius = (Faherenheit - 32) * 5/9;
        System.out.println(Celsius + " Degrees Celsius");
        
        System.out.println("Thank you for using my Faherenheit to Celsius converter Example. I hope you enjoyed it, Have a good day. ;)");
     
    }
    
}
