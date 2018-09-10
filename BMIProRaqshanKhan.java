/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bmiproraqshankhan;
import java.util.Scanner;

/****************************************************************
*
* File: BMI
* By: Raqshan Khan
* Date: February 11, 2018
*
* Description: Calculates the Body Mass Index of once information is inputed into the program.
*
****************************************************************/
public class BMIProRaqshanKhan {

    public static void main (String [] args) {
 
        Scanner input = new Scanner (System.in);
         
        
        //intro
        System.out.println ("************************************************");
        System.out.println ("");
        System.out.println ("Welcome to:");
        System.out.println ("          Body Mass Index (BMI) Computation");
            System.out.println ("                        by Raqshan Khan");
        System.out.println (" ");
        System.out.println ("************************************************");
        
        //promts
        System.out.print ("Please enter your height in feet and inches: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        System.out.print("Please enter a low weight in pounds:\t");
        double startNum = input.nextDouble();
        System.out.print("Please enter a high weight in pounds:\t\t");
        double endNum = input.nextDouble();
        double incrementNum = 5;
       
        //convert measurments
                int heightInches = (number1 * 12) + number2;
               
   
                
        // Table header
        System.out.println("\nWEIGHT \tBMI" + "     \tCONDITION ");
        
        for (double i = startNum; i <= endNum; i += incrementNum) {
            float BMI = (float) ((730.0f * i) / (float)(heightInches * heightInches));
                //Result of BMI Calc
                    String result= "";
                    if (BMI < 18.5) {
                    result = "underweight";
                    } else if (BMI < 25) {
                    result = "not overweight";
                    } else if (BMI < 30) {
                    result = "overweight";
                    } else {
                    result = "obese";
                    }
                    
                System.out.print(i + "\t");
                System.out.format("%08.4f", BMI);
                System.out.println("\t" + result);
            }
       
    
         
         
         
         
         
         
        System.out.println ("************************************************");
        System.out.println ("");
        System.out.println("Thank you for using my program!");
        System.out.println ("");
        System.out.println ("************************************************");
        
    }
 
    }
    