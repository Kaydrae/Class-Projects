/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiorlow;

/**
 *
 * @author Ke'Ondrae
 */
import java.util.Random;
import java.util.Scanner;
public class HiorLow {

    
    public static void main(String[] args) {
        Random rm = new Random();
        Scanner nme = new Scanner (System.in);
        Scanner number = new Scanner (System.in);
        Scanner pw = new Scanner (System.in);
        
        String pass;
        String name; 
        int Rn;
        int trys;
        int passtry;
        int Un;
        
        
        trys = 1;
        passtry = 0;
        
        
        System.out.println("Good day, The hi or low guessing game you are trying to play is password protected. ");
        System.out.println("To play this amazing game developed by an amazing developer you will need to get the password. ");
        System.out.println("Brute force is not recomended at all because after three tries the program will destroy itself. Good Luck...");
                pass = pw.next();
                
       while(!pass.equals("thecode")){
           
            if(passtry < 2){
                
             
            System.out.println("Incorrect Password, Please try again");
            pass = pw.next();
            passtry ++;
          //  break;
            
           } 
            else{
            System.out.println("I'm sorry but you've entered the password wrong to may times.");
            break;
            } 
       }
       
         
        
        while(pass.equals("thecode"))
        {
                   
        System.out.println("Welcome to high or low guessing game. Can we Start with your name?");
            name = nme.next();
        System.out.println("Okay " + name + " please guess a number between 1 and 10.");    
            Un = number.nextInt();
        
        Rn = rm.nextInt(9)+ 1;
        
        while(Rn != Un){
        
        //Look into Start
        if(Rn > 5 && Un >5){
        
        System.out.println("Your guess is a bit High.");
            
        }
        if(Rn < 5 && Un < 5){
            
        System.out.println("Your guess is a bit Low.");
        
        }
        
        if(Rn < 5 && Un > 5){
        
            System.out.println("Your guess is a bit High.");
        
        }
        
        if(Rn > 5 && Un < 5){
        
            System.out.println("Your guess is a bit Low.");
        
        }
        //Look into End
        
        System.out.println(name + " That is not the correct number please try again.");
             Un = number.nextInt();
        
             trys = trys + 1;
        
        }
        
        if(trys <= 4){
        System.out.println("Congrtualtions " + name +" It took you " +trys + " trys to guess the number"
                + " you are a pro guesser. Thanks for playing." );
        break;
        }
        else{
            
        System.out.println("Congrtualtions " + name +" It took you " +trys + " trys to guess the number"
                + " you an alright guesser. Thanks for playing." );
        break;
        }
        
        
        
        }
        
        
        
        
        
       }
        
   
    
}
