package com.javaclass.pp1ch9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    static Scanner userNum = new Scanner(System.in);
    public static void main(String[] args) {


    int arrayLength;
    int[] numberArray;
    int sum;
    double arrayAverage;

        System.out.println("How many number are in the Array?");
            arrayLength = checkValidInput();



        numberArray = new int[arrayLength];

        System.out.println("Please enter " + arrayLength + " numbers so we can find the average.");

        for(int x = 0; x < arrayLength; x++){

            numberArray[x] = userNum.nextInt();

            if(numberArray[x] < 0) try {
                throw new IllegalArgumentException();
            } catch (IllegalArgumentException e) {
                System.out.println("Value must be positive.");
                numberArray[x] = userNum.nextInt();
            }
        }

        // Making sure no negatives slipped in
        printOutArray(numberArray);

        sum = 0;

        for(int k = 0; k < numberArray.length; k++){

            sum = sum + numberArray[k];


        }

        arrayAverage = sum / numberArray.length;

        System.out.println("The average of your numbers are " + arrayAverage);

    }


    private static void printOutArray(int[] array) {
        int n = array.length;

        for (int i = 0; i < n; i++) {
            System.out.println(array[i] + " ");
        }

    }

    //Trying something new
    private static int checkValidInput(){

        try {

            return userNum.nextInt();
        }

        catch (InputMismatchException e){

            userNum.next();
            System.out.println("That's not a number please enter a number.");
            return 0;

        }


    }
}
