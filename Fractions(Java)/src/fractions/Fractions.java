/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractions;

/**
 *
 * @author Ke'Ondrae
 */
public class Fractions {


    public static void main(String[] args) {
       
        aFraction f1 = new aFraction();
        aFraction f2 = new aFraction();
        aFraction f3 = new aFraction();
        aFraction f4 = new aFraction(2,5);
      
        
        //set Fraction 1
        f1.setFraction(3, 4);
        f1.displayFraction();
        
        //Set Fraction 2
        f2.setFraction(2, 4);
        f2.displayFraction();
        
        //Multiply Fraction by Fraction
        f1.mFraction(f2);
        f1.displayFraction();
        
        //Set Fraction 3
        f3.setFraction(2, 2);
        f1.displayFraction();
        
        //Multiply Fraction By Fraction
        f1.mFraction(f2);
        f1.displayFraction();
        
        //Multiply Fraction By Fraction
        f1.mFraction(f3);
        f1.displayFraction();
        
        //Multiply Fraction by input Fraction
        f1.setFraction(5, 6);
        f1.mFraction(4, 5);
        f1.displayFraction();
        
        //Divide Fraction by input Fraction
        f1.setFraction(1, 2);
        f1.dviFraction(1, 2);
        f1.displayFraction();
        
        //Add Fraction by input Fraction
        f1.setFraction(1, 5);
        f1.addFraction(1, 5);
        f1.displayFraction();
        
        //Add Fraction by input Fraction
        f1.setFraction(1, 3);
        f1.addFraction(1, 6);
        f1.displayFraction();
        
        //Subtract Fraction by input Fraction
        f1.setFraction(2, 5);
        f1.subFraction(1, 5);
        f1.displayFraction();
        
        //Subtract Fraction by input Fraction
        f1.setFraction(1, 3);
        f1.subFraction(1, 6);
        f1.displayFraction();
        
        //Simplifying Fraction
        f1.setFraction(4, 8);
        f1.simpFraction(f1);
        f1.displayFraction();
        
        //Simplifying Fractions
        f2.setFraction(4,15);
        f2.simpFraction(f2);
        f2.displayFraction();
        
        //Simplifying Fractions
        f3.setFraction(5, 25);
        f3.simpFraction(f3);
        f3.displayFraction();
    }
    
}
