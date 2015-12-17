/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package circlemath;

/**
 *
 * @author Ke'Ondrae
 */

import java.util.Scanner;

public class CircleMath {

    
    public static void main(String[] args) {
        
       Scanner Dm = new Scanner (System.in);
      
       
      
        
       System.out.println("Welcome to circle math program version 1.0.");
       System.out.println("Please enter the diameter of the circle.");
        double diameter = Dm.nextDouble( );
       
       System.out.println("The diameter you have entered is: " + diameter);
       
       System.out.println("Your answers are as following...");
       
       double radius = (diameter / 2);
       System.out.println("Your radius is: " + radius);
       
       double circumference = (3.14 * diameter);
       System.out.println("Your circumference is: " + circumference);
       
       double surfaceArea = (4 * 3.14 * radius * radius);
       System.out.println("Your Surface Area is: " + surfaceArea);
       
       System.out.println("Thank you for using my circle math Example. I hope you enjoyed it, Have a good day. ;)");
     
    }
    
}
