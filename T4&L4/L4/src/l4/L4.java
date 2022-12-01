/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l4;

import static java.lang.Integer.MAX_VALUE;
import static java.lang.Math.sqrt;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author L4_Hussein Rashed Abdulwareth Al-manifi_S2170731
 */
public class L4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Q1
        
        Scanner factor = new Scanner(System.in);
        System.out.println("Enter an Integer: ");
        int fact = factor.nextInt();
        for (int i = 1; i <= fact; i++)
        {
            if (fact % i == 0)
            {
                System.out.print(i + ", ");
            }
        }
        System.out.println();
        
        //Q2
        
        Scanner series = new Scanner(System.in);
        System.out.println("Enter an integer to get the sum of the series");
        int ser = series.nextInt();

        int total = 0;
        for (int i = 1 , sum = 0; i <= ser; i++)
        {
            sum = sum + i;
            total = total + sum;
        }
        System.out.println(total);
        
        //Q3
        
        Scanner calc = new Scanner(System.in);
        int max = 0;
        int min = MAX_VALUE;
        double aveC = 0; // counter
        int score = 0;
        int ssum = 0;
        double sumSquared = 0;
        do {
            System.out.print("Enter a Score [negative to quit]");
            score = calc.nextInt();
            
            if (score > 0){
                if (min > score)
                {
                    min = score;
                }
                else if( max < score)
                {
                    max = score;
                }
                aveC++;
                ssum = ssum + score;
                sumSquared += (score*score);
            
            }
            
        } while (score >= 0);
        double stan = (float) sqrt((sumSquared - (ssum*ssum)/aveC) / (aveC-1));
        double ave = ssum / aveC;

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
        System.out.println("Ave: " + ave);
        System.out.printf("Stan: %.2f\n" , stan);
       
        
        //Q4
        Scanner starting = new Scanner(System.in);
        System.out.println("Enter Year: ");
        int year = starting.nextInt();
        System.out.println("Enter day: ");
        int day = starting.nextInt();
        if (year %400 == 0 || year %100 != 0 && year % 4 == 0)
                {
                    day = ++day & 7;
                }
        System.out.println(" \n May");
        System.out.println(" Sun Mon Tue wed Thu Fri Sat ");
     
        for(int i = 0;i < day ; i++)
        {
            System.out.print("    ");
        }
        for(int j = 1;j <= 31 ;day++,j ++)
        {
      
            System.out.printf("  %02d",j);
            if ( day == 6)
            {
                System.out.println("");
                day = -1;
            }
        }
        
        
        day = (day + 5) % 7;
        System.out.println("");
        System.out.println("\n August");
        System.out.println(" Sun Mon Tue wed Thu Fri Sat ");
        for (int i = 0; i< day; i++)
        {
            System.out.print("    ");
        }
        for(int j = 1;j <= 31 ;day++,j++)
        {
      
            System.out.printf("  %02d",j);
            if ( day == 6)
            {
                System.out.println("");
                day = -1;
            }
        }
        
        System.out.println();
     
       
        //Q5
        int roller1 = 0;
        int roller2 = 0;
        Random randomRolling = new Random();
        while (roller1 < 100 && roller2 < 100)
        {
            int random = randomRolling.nextInt(5) + 6;
            int random2 = randomRolling.nextInt(5) + 6;
            roller1 = roller1 + random;
            roller2 = roller2 + random2;
            if (random == 6)
            {
               random = randomRolling.nextInt(5) + 6;  
               roller1 = roller1 + random;
            }
            else if (random2 == 6)
            {
               random2 = randomRolling.nextInt(5) + 6;
               roller2 = roller2 + random2;
            }
            
            if (roller1 > 100)
            {
                System.out.println("Player1 Wins With: " + roller1);
                break;
                
            }
            else if (roller2 > 100)
            {
                System.out.println("Player2 Wins With: " + roller2);
                break;
            }
        }
        
        //Q6
        
        Random nonNegative = new Random();
        int randomNon = nonNegative.nextInt() & Integer.MAX_VALUE;
        System.out.println("The Non-Negative number is: " + randomNon);
        
        //Q7
        Scanner principal = new Scanner(System.in);
        System.out.println("Enter prinicipal amount: "); 
        int pri = principal.nextInt();
        System.out.println("Enter interest in %: "); 
        double intrest = principal.nextDouble();
        System.out.println("Enter total number of month(s): "); 
        int months = principal.nextInt();
        
        double payment = (pri *(intrest/1200))/ (1- Math.pow((1+(intrest/1200)), (-months)));
        int curMon=0;   
        double priDue , intrestDue, remaining, totalIntrest = 0;
        System.out.println("Month      Monthly Payment     Principal    Interest     Unpaid Balance    Total Interest");
        for (int i = 0; i < months; i++)
        {   
            
            curMon = (i+ 1 +months)-months;
            priDue = payment * Math.pow((1+ (intrest/1200)), -(1+months-curMon));
            intrestDue = payment - priDue;
            remaining = intrestDue/ (intrest/1200) - priDue;
            totalIntrest += intrestDue;
            System.out.printf("%d          %.2f              %.2f       %.2f        %.2f           %.2f\n",curMon,payment,priDue,intrestDue,remaining,totalIntrest);

            
        }
        
        
        //Q8
        Random primer = new Random();
        int prime = primer.nextInt(101);
        if (prime == 0 || prime == 1)
        {
           System.out.println("no primes found"); 
        }
        
        else{ 
            System.out.print("2 ");
            for ( int i = 2; i <= prime/2; i++)
            {
                    if (i%2 != 0)
                    {
                    System.out.print( i + " ");
                    }
            }
        }
        
        System.out.println();
        
        
        
      }         
        
        
    }

    

