/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t3;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author T3_Hussein Rashed Abdulwareth Al-manifi_S2170731
 */
public class T3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Q1
        if (3*8 == 27)
        {
            System.out.println("yah 3*8 is 27");
        }
        else {
            System.out.println("nah 3*8 is not 27");
        }
        
        Scanner oddOrEven = new Scanner(System.in);
        System.out.println("Input an integer to check if odd or even");
        int oddity = oddOrEven.nextInt();
        if (oddity%2 == 0)
        {
            System.out.println("The number is Even");
        }
        else {
            System.out.println("The number is Odd");
        }
        
        Scanner capital = new Scanner(System.in);
        System.out.println("Input a character to check if capital");
        char letter = capital.next().charAt(0);
        
        if (Character.isUpperCase(letter) == true)
        {
            System.out.println("The Character is capitalized");
        } 
        else {
            System.out.println("Not Capitalized");
        }
        
        Scanner alphaString = new Scanner(System.in);
        System.out.println("Give us two Strings");
        String sorting1 = alphaString.nextLine();
        String sorting2 = alphaString.nextLine();
        
        String[] arr = {sorting1,sorting2};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        
        Scanner weekDays = new Scanner(System.in);
        System.out.println("Insert A number to get the day (0-6)");
        int days = weekDays.nextInt();
        
        switch(days){
            case 0 -> System.out.println("Sunday");
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Firday");
            case 6 -> System.out.println("Saturday");
            default -> System.out.println("Nah the number u put is bigger than 6");
        }
        
        // Q2
        //Written in The PDF File
        
        // Q3 
        //Written in The PDF File
        
        // Q4
        Scanner threeInts = new Scanner(System.in);
        System.out.println("Insert Three numbers to get the biggest");
        int num1 = threeInts.nextInt();
        int num2 = threeInts.nextInt();
        int num3 = threeInts.nextInt();
        
        if (num1 > num2 && num1 > num3)
        {
            System.out.println("The First One is The Biggest!");
        }
        else if (num2 > num1 && num2 > num3)
        {
            System.out.println("The Second One is The Biggest!");
        }
        else if (num3 > num1 && num3 > num2)
        {
            System.out.println("The Third One is The Biggest!");
        }
        else
        {
            System.out.println("Seems Like A Tie!");

        }
        
        // Q5
        Scanner leap = new Scanner(System.in);
        System.out.println("Insert the Year");
        int year = leap.nextInt();
        if (year %4 == 0 && year%400 == 0)
        {
            System.out.println(year + " is A Leap Year!");
        }
        else
        {
            System.out.println(year + " is NOT A Leap Year!");
        }
        
    }
    
}
