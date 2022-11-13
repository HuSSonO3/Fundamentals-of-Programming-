/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l2;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author L2_Hussein Rashed Abdulwareth Al-manifi_S2170731
 */
public class L2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Q1
        Scanner fah = new Scanner (System.in);
        System.out.println("Enter Fahrenheit Degree: ");
        double f = fah.nextDouble();
        double c = (f- 32) / 1.8;
        System.out.printf("Celsius = %.2f\n", c);
        
        //Q2
        Scanner payment = new Scanner (System.in);
        System.out.print("Enter The Car Price: ");
        double p = payment.nextDouble();
        Scanner down = new Scanner (System.in);
        System.out.print("Enter The Down payment: ");
        double d = down.nextDouble();
        Scanner rate = new Scanner (System.in);
        System.out.print("Enter The Intrest Rate: ");
        double r = rate.nextDouble();
        Scanner loan = new Scanner (System.in);
        System.out.print("Enter The Loan Duration in year: ");
        double y = loan.nextDouble();
        
        double m = (p-d) * (1+r*y/100) / (y*12);
        System.out.printf("Your Monthly Payment is: %.2f\n" , m);

        //Q3
        Random random3 = new Random();
        double small = 10;
        double big = 50;
        double sum = 0;
        double average;
        double[] numbers = {1,2,3};
        for (int i = 0; i < 3; i++){
            double rand = random3.nextDouble(big - small) + big;
            numbers[i] = rand;
            sum = sum + rand;
        }
        average = sum / 3;
        System.out.printf("Number 1: %.2f , Number 2: %.2f , Number 3: %.2f\n",numbers[0],numbers[1],numbers[2]);
        System.out.printf("The Sum is : %.2f , The Average is : %.2f\n",sum,average);
        
        //Q4
        Scanner second = new Scanner(System.in);
        System.out.println("Enter Seconds: ");
        int x = second.nextInt();
        int hour = x;
        int seconds = x % 60;
        hour /= 60;
        int minutes = hour % 60;
        hour /= 60;
        
        System.out.println(x + " seconds is " + hour + " hours, " + minutes + " minutes and "+ seconds + " seconds.");
        
        //Q5
        Random random1 = new Random();
        int randomOne = random1.nextInt(10001);
        System.out.println("The Number is: " + randomOne);
        int sumOfDigits = 0;
        while (randomOne > 0)
        {
            sumOfDigits += randomOne % 10;
            randomOne /= 10;
            
        }
        System.out.println("The Sum of Its Digits: " + sumOfDigits);
        
        
        //Q6
        Scanner water = new Scanner (System.in);
        System.out.print("Enter The Amount of Water in Gram: ");
        double waterAmount = water.nextDouble();
        
        Scanner temperature1 = new Scanner (System.in);
        System.out.print("Enter The Initial Temperature in Fahrenheit: ");
        double itemp = temperature1.nextDouble();
        
        Scanner temperature2 = new Scanner (System.in);
        System.out.print("Enter The Final Temperature in Fahrenheit: ");
        double ftemp = temperature2.nextDouble();
        
        double waterKg = waterAmount / 1000;
        double itempC = (itemp- 32) / 1.8;
        double ftempC = (ftemp- 32) / 1.8;
        
        double Energy = waterKg * (ftempC - itempC) * 4184;
        NumberFormat numberformat = new DecimalFormat("0.######E00");
        System.out.println("The Energy Needed is "+ numberformat.format(Energy));
        
       
        
        
        
    }
    
}
