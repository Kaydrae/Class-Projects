package com.javaclass.pp3ch3;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    Scanner userText = new Scanner(System.in);
        Scanner userNumbers = new Scanner(System.in);
        String userAnswer; //To enter the while loop
        String userGenderChild; //Get Gender
        int hOfMother, hOfFather;
        int userFeet, userInches;
        int finalHofMChild, finalHofFChild;
        Math HofMChild = new Math();
        Math HofFChild = new Math();
        int feet, inches;


    System.out.println("Would you like to find out the height of chided? (Yes or No)");
            userAnswer = userText.next();

        while(userAnswer.equals("Yes") || userAnswer.equals("yes")){

            System.out.println("What is the gender of your child? (Male or Female?)");
            userGenderChild = userText.next();


            //converting father to inches
            System.out.println("We have to gather the height of the father.");
            //Space
            System.out.println("");

            System.out.println("Please Enter feet");
                userFeet = userNumbers.nextInt();

            System.out.println("Please Enter inches");
                userInches = userNumbers.nextInt();

            hOfFather = userFeet * 12 + userInches;

            //System.out.println(hOfFather);//Test code

            //converting mother to inches
            System.out.println("We have to gather the height of the mother.");
            //Space
            System.out.println("");

            System.out.println("Please Enter feet");
            userFeet = userNumbers.nextInt();

            System.out.println("Please Enter inches");
            userInches = userNumbers.nextInt();

            hOfMother = userFeet * 12 + userInches;

            //System.out.println(hOfMother);//Test code

                if(userGenderChild.equals("Male") || userGenderChild.equals("male")){

                    finalHofMChild = HofMChild.HeightOfMaleChild(hOfMother, hOfFather);

                    feet = finalHofMChild / 12;

                    //System.out.println(feet);//Test code

                    inches = feet % 12;

                    //System.out.print(inches);//test code

                    System.out.println("Your child will be " + feet + " feet and " + inches + " inches tall." );


                }

                if(userGenderChild.equals("Female") || userGenderChild.equals("female")){

                    finalHofFChild = HofFChild.HeightOfFemaleChild(hOfMother, hOfFather);

                    feet = finalHofFChild / 12;

                    inches = feet % 12;

                    System.out.println("Your child will be " + feet + " feet and " + inches + " inches tall." );

                }

                System.out.println("Would you like to do another?");
                    userAnswer = userText.next();

            }

            if(userAnswer.equals("No") || userAnswer.equals("no")){


                System.out.println("Aww well. I thought it was cool. Maybe next time.");


            }

        System.out.println("Thank you for using, have a great day.");



        }
}
