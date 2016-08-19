/*
 * Deborah Lewis
 * August 11, 2016
 * 
 * This program requests that a user enters their height and weight and then
 * calculates their bmi.
 */
package bmi_calculator;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class BMI_Calculator {
    

    public static void main(String[] args) {
        //create scanner
        Scanner userInput = new Scanner(System.in);
        
        //define variables
        double weight;
        double height;
        double bmi;
        String bmiClass;
        
        weight = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your weight in pounds: "));
        height = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter your height in inches: "));
        
        bmi = ((weight * 703)/(height * height));
        
        NumberFormat twoDecimals = new DecimalFormat("#0.00");
        
        
        if (bmi < 18.5) {
            bmiClass = "Underweight";
        }
        else if (bmi < 25 && bmi > 18.4) {
            bmiClass = "Normal";
        }
        else if (bmi < 30 && bmi > 24.9) {
            bmiClass = "Overweight";
        } else {
        bmiClass = "Obese";
        }

        
        JOptionPane.showMessageDialog(null, "Your BMI is " + bmiClass + " " + twoDecimals.format(bmi) + "\n\n-BMI VALUES-\n "
                + "Underweight: Under 18.5\nNormal: 18.5-24.9\nOverweight: 25-29.9\nObese: 30 or over");
        
    } //end main method
    
} //end BMI Calculator package
