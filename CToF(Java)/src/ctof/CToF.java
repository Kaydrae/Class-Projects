/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ctof;

import java.util.Scanner;

/**
 *
 * @author Ke'Ondrae
 */
public class CToF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner C = new Scanner (System.in);
        
        System.out.println("Welcome to my  Celsius to Faherenheit  converter version 1.0");
        System.out.println("Please Enter The Temperature In Celsius");
        double Celsius = C.nextDouble( ); 
        
        System.out.println("The Temperature you've entered is " + Celsius + " Degrees Celeius");
        
        System.out.println("Which is ");
        
        double Faherenheit = (Celsius) * 9/5 + 32;
        System.out.println(Faherenheit + " Degrees Faherenheit");
        
        System.out.println("Thank you for using my Celsius to Faherenheit converter Example. I hope you enjoyed it, Have a good day. ;)");
     
    }
    
}
