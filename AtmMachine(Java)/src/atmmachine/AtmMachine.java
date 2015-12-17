/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atmmachine;

/**
 *
 * @author Ke'Ondrae
 */

import java.util.Scanner;
import java.util.Random;

public class AtmMachine {
    
    static double withdraw;
    static double deposit;
    static double savAmo = 5000.90;
    static double cheAmo = 44000.75;
    static int cheAcuNum;
    static int savAcuNum;
    static int rouCheNum;
    static int rouSavNum;
    static int SSN;
    
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String user;
        String answer;
        
        System.out.println("Welcome To My ATM Machine. We really apprecate you for banking with us so heres five thousand dollars added to your savings. ");
        System.out.println("Please check  around you and enter \"Ready\" when you are ready." );
      
        answer = userInput.next();
        
        while(answer.equals("Ready")){
        
                System.out.println("What would you like to do?");       
                System.out.println("Deposit");
                System.out.println("Withdraw");
                
                System.out.println("Transfer");
                System.out.println("Information");
                System.out.println("Balance");
                System.out.println("Quit");
                    user = userInput.next();

                    if(user.equals ("deposit") || user.equals ("Deposit") ||
                          user.equals("withdraw") || user.equals("Withdraw") ||
                          user.equals("transfer") || user.equals("Transfer") ||
                          user.equals("information") || user.equals("Information") ||
                          user.equals("balance") || user.equals("Balance") ||
                          user.equals("quit") || user.equals("Quit")){



                        if(user.equals ("deposit") || user.equals ("Deposit")){

                            userDeposit();
                            // Run deposit Method
                         }

                        else if(user.equals("withdraw") || user.equals("Withdraw")){

                            userWithdraw();
                            //Run withdraw Method
                        }

                        else if(user.equals("transfer") || user.equals("Transfer")){

                            userTransfer();
                            //Run transfer Method
                        }

                        else if(user.equals("information") || user.equals("Information")){

                            userInformation();
                            //Run information Method
                        }

                        else if (user.equals("balance") || user.equals("Balance")){

                            checkBalance();
                        // Run check balance Method
                        }

                        else if(user.equals("quit") || user.equals("Quit")){

                        System.exit(0);
                            // End Program
                        }

                        }

                    else if(!user.equals ("deposit") || !user.equals ("Deposit") ||
                          !user.equals("withdraw") || !user.equals("Withdraw") ||
                          !user.equals("transfer") || !user.equals("Transfer") ||
                          !user.equals("information") || !user.equals("Information") ||
                          !user.equals("balance") || !user.equals("Balance") ||
                          !user.equals("quit") || !user.equals("Quit")){


                                System.out.println(user + " is not a valid input");

                                //space
                                System.out.println();

                    //            System.out.println("What would you like to do?");       
                    //            System.out.println("Deposit");
                    //            System.out.println("Withdraw");
                    //            System.out.println("Transfer");
                    //            System.out.println("Information");
                    //            System.out.println("Check Balance");
                    //            System.out.println("Quit");
                    //            
                    //                user = userInput.nextLine();
                                }
                }

       if(!answer.equals("Ready")){
          
           System.out.println("Seems as if everything isn't in the clear. Thats okay you can always try again when your area is clear. Have a great day.");
           System.exit(0);
       }
           
    }
   
    //Start of deposit -Done working
        // Deposit Main Method
    static void userDeposit(){
        Scanner userInput = new Scanner(System.in);
        String user;
            
        System.out.println("Which account would you like to make a deposit to? ");
        System.out.println("Checking, Saving, or Quit?");
            user = userInput.next();
            
        if(user.equals ("checking") || user.equals("Checking")){
        
            userDepositChecking();
            // Run stuff for checking
        }
                
        if(user.equals("saving") || user.equals("Saving")){
        
            userDepositSaving();
            //Run stuff for saving
        }
        
        else if(user.equals("quit") || user.equals("Quit")){
            
            System.out.println("Thank you have a nice day.");
            System.exit(0);
            //End Program
        }
         
        while(!user.equals("checking") && !user.equals("Checking") &&
              !user.equals("Saving")   && !user.equals("Saving")   &&
              !user.equals("quit")     && !user.equals("Quit") ){
        
               System.out.println(user + " is not a valid input"); 
               
               //Space 
               System.out.println();
               
               System.out.println("Checking, Saving, or Quit?");
               user = userInput.next();
        }
      
        
           
    } 
        
        //Deposit Checking Method
    static void userDepositChecking(){
        Scanner userInput = new Scanner(System.in);
        String user; 
        
       for(int numOfDeposits = 0; numOfDeposits <= 3; numOfDeposits ++){
           
       System.out.println("Your checking amount blanice is $" + cheAmo);
       System.out.println("How much would you like to deposit");
       deposit = userInput.nextDouble();
       cheAmo = cheAmo + deposit;
       System.out.println("Your checking amount balance is $" + cheAmo);
       
       System.out.println("Would you like to make another deposit?");
         user = userInput.next();
         
         if(user.equals("no") || user.equals("No")){
             
         break;
     
         }
         
        }
        System.out.println("Sorry You've reached your max deposits for the day, please come back tomorrow.");
        //System.exit(0);
    }
    
        //Deposit Savings Method
    static void userDepositSaving(){
        Scanner userInput = new Scanner(System.in);
        String user; 
        
       for(int numOfDeposits = 0; numOfDeposits <= 3; numOfDeposits ++){
           
       System.out.println("Your checking amount blanice is $" + savAmo);
       System.out.println("How much would you like to deposit");
       deposit = userInput.nextDouble();
       savAmo = savAmo + deposit;
       System.out.println("Your checking amount balance is $" + savAmo);
       
       System.out.println("Would you like to make another deposit?");
         user = userInput.next();
         
         if(user.equals("no") || user.equals("No")){
             
         break;
     
         }
         
        }
        System.out.println("Sorry You've reached your max deposits for the day, please come back tomorrow.");
        //System.exit(0); 
    }
    //End of deposit
    
    
    
    //Start of withdraw -Done working
        //Withdraw Main Method
    static void userWithdraw(){
        Scanner userInput = new Scanner(System.in);
        String user;
        
        System.out.println("Which account would you like to withdraw from today?");
        System.out.println("Checking");
        System.out.println("Saving");
        System.out.println("Back");
        System.out.println("Quit");
            user = userInput.next();
            
        if(user.equals("checking") || user.equals("Checking")){
        
            userWithdrawCheckings();
            
        }    
        
        else if(user.equals("saving") || user.equals("Saving")){
        
            userWithdrawSavings();
        
        }
        else if(user.equals("quit") || user.equals("Quit")){
            
            System.out.println("Thank you have a nice day.");
            System.exit(0);
        
        } 
        
        else if(user.equals("back") || user.equals("Back")){
        // exit to the main
            
        }
        while(!user.equals("checking") && !user.equals("Checking") &&
              !user.equals("Saving")   && !user.equals("Saving")   &&
              !user.equals("quit")     && !user.equals("Quit")     &&
              !user.equals("back")     && !user.equals("Back")){
        
               System.out.println(user + " is not a valid input"); 
               
               //Space 
               System.out.println();
               
               System.out.println("Checking");
               System.out.println("Saving");
               System.out.println("Back");
               System.out.println("Quit");
               user = userInput.next();
        }
        
    } 
    
        //User withdraw Checkings
    static void userWithdrawCheckings(){
     String user;
     Scanner userInput = new Scanner(System.in);
     
     for(int numOfWithdraws = 0; numOfWithdraws <=3; numOfWithdraws ++){
        System.out.println("How mouch money would you like to withdraw?");
           withdraw = userInput.nextDouble();
            
         if(withdraw > cheAmo){
         
             System.out.println("Somethings not quite right. Please Check your numbers becasue you can not withdraw more then you have.");
         
         }   
    
         else{
         
         cheAmo = cheAmo - withdraw;
             
         System.out.println("Your Checking amount balance is $" + cheAmo);
         
         System.out.println("Would you like to make another withdraw?");
         user = userInput.next();
         
         if(user.equals("no") || user.equals("No")){
             break;
        
         }
         
       }
         
     }
     System.out.println("Sorry You've reached your max deposits for the day, please come back tomorrow.");
    }
    
        //User Withdraw Savings
    static void userWithdrawSavings(){
         Scanner userInput = new Scanner(System.in);
         String user;
       
     for(int numOfWithdraws = 0; numOfWithdraws <=3; numOfWithdraws ++){
        System.out.println("How mouch money would you like to withdraw?");
           withdraw = userInput.nextDouble();
            
         if(withdraw > savAmo){
         
             System.out.println("Somethings not quite right. Please Check your numbers because you can not withdraw more then you have.");
         
         }   
    
         else{
         
         savAmo = savAmo - withdraw;
             
         System.out.println("Your Savings amount balance is $" + savAmo);
         
         System.out.println("Would you like to make another withdraw?");
         user = userInput.next();
         
         if(user.equals("no") || user.equals("No")){      
             break;
         }
         
       }
        
     }
     System.out.println("Sorry You've reached your max deposits for the day, please come back tomorrow.");
    }
    
    //End of withdraw
    
    
    
    //Start of Transfer -Done Working
    static String Acc1;
    static String Acc2;
    static void userTransfer(){
        String user;
        Scanner userInput = new Scanner(System.in);
        
        //Space
        System.out.println();
        
        System.out.println("Welcome to the transfering center.");
        System.out.println("Would you like to transfer some money? ");
        System.out.println("Or maybe you are in the wrong place and would you like to Quit or go back.");
        user = userInput.next();
        
        while(user.equals("back") || user.equals("Back") ||
              user.equals("quit") || user.equals("Quit")){
            
           
            if(user.equals("back") || user.equals("Back")){
            break;
               
            }
            else if(user.equals("quit") || user.equals("Quit")){
            
            System.exit(0);
            }
        }
        
        while(user.equals("yes") || user.equals("Yes")){
        
        
        System.out.println("Which account would you like to transfer money from?");
        System.out.println("Checking");
        System.out.println("Saving");
            Acc1 = userInput.next();
            
        //Space
        System.out.println();

        System.out.println("Please choose the accout you want to transfer money too.");
        System.out.println("Checking");
        System.out.println("Saving");
            Acc2 = userInput.next();
       
        //if user pickes the same account to transfer too
        while(Acc1.equals (Acc2)){
        
            System.out.println("I'm sorry but you can not transfer money too the same account that you picked. Please Choose that second account again. ");
            
            System.out.println("Checking");
            System.out.println("Saving");
            Acc2 = userInput.next();
            //errorTransfer();
            //Transfer error message Method
        }
        
        // If user pickes checking to transfer to savings
        if(Acc1.equals("checking") || Acc1.equals("Checking") &&
           Acc2.equals("saving") || Acc2.equals("Saving")     ){
        
            checkToSave();
        }
        
        //if uers picks saving to transfer to checking
        if(Acc1.equals("saving") || Acc1.equals("Saving") &&
           Acc2.equals("checking") || Acc2.equals("Checking")){
        
            saveToCheck();
        
        } 
        
        //if user pickes a account that dose not exist 
        
        else if (!Acc1.equals("checking") && !Acc1.equals("Checking") &&
                 !Acc2.equals("saving")   && !Acc2.equals("Saving") && 
                 !Acc1.equals("saving")   && !Acc1.equals("Saving") &&
                 !Acc2.equals("checking") && !Acc2.equals("Checking")   ){
        
            errorTransfer();
            //Transfer error message Method
        }
        }
      
    }
    
    static void errorTransfer(){
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("Umm... Sorry about this but the account that you've entered dose not exist.");
    System.out.println("Maybe you should check your spelling on your account name. Trust me, misspelling happends to the best of us.");
     Acc1 = userInput.next();
     
     System.out.println("And the second account name?");
     Acc2 = userInput.next();
    }
    
    //Transfering from checking to savings method
    static void checkToSave(){
    double amo;
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("How much money are we transfering today?");
        amo = userInput.nextDouble();
        
     cheAmo = cheAmo - amo;
     savAmo = savAmo + amo;
     
     System.out.println("$" + amo + " Has be been moved from your checkings to your savings");
     System.out.println("Balance:");
     System.out.println("Checking: $"+ cheAmo);
     System.out.println("Saving: $" + savAmo);
    
    
    }
    
    //Trancfering from savings to checking method
    static void saveToCheck(){
    double amo;
    Scanner userInput = new Scanner(System.in);
    
    System.out.println("How much money are we transfering today?");
        amo = userInput.nextDouble();
        
     savAmo = savAmo - amo;
     cheAmo = cheAmo + amo;
     
     System.out.println("$" + amo + " Has be been moved from your checkings to your savings");
     System.out.println("Balance:");
     System.out.println("Checking: $"+ cheAmo);
     System.out.println("Saving: $" + savAmo);
    }
    
//Prob not needed    
//    static void overDraftCheck (){      
//    }
    //End of Transfer
    
    
    
    //Start of Information -Done working
    
        static String firstName = "John";
        static String lastName = "Doe";
        static String address = "12244 Net beans Hill, hp, ohio 44018";
        static int month = 03;
        static int day = 12;
        static int year = 1978;
    static void userInformation(){
        /*
        Account number for both accounts 
        Rounting numbers for both accounts
        Name
        Address
        DOB
        SSN
        Ask of the information is correct.
        Have user update the Information of incorrect
        Check account amounts. 
        */
        String user;
        String answer;
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please check your surroundings, we are about to display private information. Are you ready to display your information? ");
            user = userInput.next();
        
        while(user.equals("yes") || user.equals("Yes")){   
            
         //Name 
        System.out.println(firstName + " " + lastName); 
           
         //Address
        System.out.println(address);
        
        //DOB
        System.out.println("DOB: " + month + "/" + day + "/" + year);
        
        //Random Gen the account numbers, routing numbers, and ss number
        randomNumGen();
        
        //Checking 
        System.out.println("Checking Account Number " + cheAcuNum);
        System.out.println("Checking Routing Number " + rouCheNum);
        //Savings
        System.out.println("Saving Account Number " + savAcuNum);
        System.out.println("Saving Routing Number " + rouSavNum);
        //SSN
        System.out.println("SSN: " + SSN);
        
        System.out.println("Is this information correct? Yes or No");
            answer = userInput.next();
            
        if(answer.equals("no") || answer.equals("No")){
        
        
            userInformationUpdate();
            //Make user update information
            
            
        } 
        else if(answer.equals("yes") || answer.equals("Yes")){
        
        System.out.println("Thank you have a nice day.");
        
        //Space
        System.out.println();
        break;
            
        }
        else{
        
           System.out.println(answer + "  is not a valid input");
        }
        }
    }
    
    static void userInformationUpdate(){
        Scanner userInts = new Scanner(System.in);
        Scanner userInput = new Scanner(System.in);
        System.out.println("Please enter your first name.");
            firstName = userInput.next();
            
        //Space    
        System.out.println();
        
        System.out.println("Please Enter your last name");
            lastName = userInput.next();
            
        //Space    
        System.out.println();
        
        System.out.println("Please enter your address.");
            address = userInts.nextLine();
        
        //Space    
        System.out.println();    
        
        System.out.println("Please enter month date of birth. Example XX");
            month = userInput.nextInt();
            
        //Space    
        System.out.println();     
        
        System.out.println("Please enter your day bate of birth. Example XX/XX");
            day = userInput.nextInt();
            
        //Space
        System.out.println();
        
        System.out.println("Please enter your year of birth. Example XX/XX/XXXX");
            year = userInput.nextInt();
            
        
    }
    //End of Information
    
    
    
    //Start of Check balance -Done working
    static void checkBalance(){
        Scanner userInput = new Scanner(System.in);
        String user;
        System.out.println("Your current balance for your Checking account is " + savAmo);
        System.out.println("Your current balance for your Savings account is " + cheAmo);
        
        //space
        System.out.println();
        
        System.out.println("Quit?");
        System.out.println("Back?");
         user = userInput.next();
         
        if(user.equals("quit") || user.equals("Quit")){
            
            System.out.println("Thank you have a nice day.");
            System.exit(0);
        
        } 
        
        else if(user.equals("back") || user.equals("Back")){
        // exit to the main
            
        }
        
        while(!user.equals("quit") && !user.equals("Quit") &&
              !user.equals("back") && !user.equals("Back") ){
        
               System.out.println(user + " is not a valid input"); 
               System.out.println("Quit?");
               System.out.println("Back?");
               user = userInput.next();
        }
      
    }
    //End of Check balance 
    
    
    
    
    //Random routing, SSN, and account number generater, because why not?
    static void randomNumGen(){
    //Note: routing numbers have 8 
    //Acount numbers have 3-16 ,     
    //SSN is 9    
        Random ranNum = new Random();
    
         rouCheNum = ranNum.nextInt(99999999) + 111111111;
         rouSavNum = ranNum.nextInt(99999999) + 111111111;
         SSN = ranNum.nextInt(99999999) + 111111111;
         cheAcuNum = ranNum.nextInt(999999999) + 111;
         savAcuNum = ranNum.nextInt(999999999) + 111;
    
    }
}
