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

public class aFraction {
    private int n;
    private int d;
    
    //Constructor Example
    aFraction(){
    n = 0;
    d = 1;
    }
    
    aFraction(int n, int d){
        
    System.out.println(n + "/" + d);
    
    }
    
   /**
    * Build in docs for EVERYTHING!! :D
    * @param num
    * @param dum 
    */
   void setFraction(int n, int d){
   //"This" example
    this.n = n;
    this.d = d;
   
   }
   
   void displayFraction(){
   
   System.out.println(n + "/" + d);
   
   }
   
   //Fraction is F2 numerator and denominator
   void mFraction(aFraction fraction){
   
   n = n * fraction.n;
   d = d * fraction.d;
   
   }
   void mFraction(int num, int dum){
       
   n = n * num;
   d = d * dum;
       
   }
   
   void dviFraction(int num, int dum){
   
   n = n * dum;
   d = d * num;
   
   }
   
   void addFraction (int num, int dum){
   
       if( d ==  dum ){
       
        n = n + num;
       
       }
       else{
       
       n = (n * dum) + (num * d);
       d = d * dum;
       
       }    
   
   }
   
   void subFraction (int num, int dum){
   
       if( d ==  dum ){
       
        n = n - num; 
       
       }
       else{
       
       n = (n * dum) - (num * d);
       d = d * dum;
       
       }  
   
   }
   
   void simpFraction(aFraction simFrac){
   
    while(n % 2 == 0 && d % 2 == 0){
     
        n = n / 2;  
        d = d / 2;
        }
   
    while (n % 3 == 0 && d % 3 == 0){
   
        n = n / 3;  
        d = d / 3;
        }
  
    while(n % 5 == 0 && d % 5 == 0){
        n = n / 5;  
        d = d / 5;
       }
   
   
       
   }
}


