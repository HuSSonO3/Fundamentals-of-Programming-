/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author L3_Hussein Rashed Abdulwareth Al-manifi_S2170731
 */
public class L3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Q1 
        Scanner twoNumbs = new Scanner (System.in);
        System.out.print("Enter two integer numbers: ");
        int calc1 = twoNumbs.nextInt();
        int calc2 = twoNumbs.nextInt();
        int sum = 0;

        Scanner op = new Scanner (System.in);
        System.out.println("Enter the operand: ");
        String operand = op.nextLine();

        switch(operand) {
            case "/" -> {
                sum = calc1 / calc2;
                System.out.println(calc1 + " / " + calc2 + " = " + sum);
            }

            case "+" -> {
                sum = calc1 + calc2;
                System.out.println(calc1 + " + " + calc2 + " = " + sum);
            }

            case "-" -> {
                sum = calc1 - calc2;
                System.out.println(calc1 + " - " + calc2 + " = " + sum);
            }

            case "*" -> {
                sum = calc1 * calc2;
                System.out.println(calc1 + " * " + calc2 + " = " + sum);
            }

            case "%" -> {
                sum = calc1 % calc2;
                System.out.println(calc1 + " * " + calc2 + " = " + sum);
            }

            default -> System.out.println("Error: no operand");
        }


          //Q2 
        Random randomInteger = new Random();
        int randomInt = randomInteger.nextInt(5);

        switch(randomInt) {
            case 0 -> System.out.println(randomInt + " is zero.");

            case 1 -> System.out.println(randomInt + " is one.");

            case 2 -> System.out.println(randomInt + " is two.");
                
            case 3 -> System.out.println(randomInt + " is three.");

            case 4 -> System.out.println(randomInt + " is four.");

            case 5 -> System.out.println(randomInt + " is five.");
        }

        //Q3
        Scanner sale = new Scanner (System.in);
        System.out.print("Enter The Sales Volume: ");
        double sales = sale.nextDouble();
        double comm = 0;

        if (sales <= 100)
        {
            comm = 5.00 / 100.00 * sales;
            System.out.println("The Commission Rate is: %5");
            System.out.printf("The Commission is: %.2f \n", comm);
        }
        else if (sales > 100 && sales <= 500)
        {
            comm = 7.50 / 100.00 * sales;
            System.out.println("The Commission Rate is: %7.5");
            System.out.printf("The Commission is: %.2f \n", comm);
        }
        else if (sales > 500 && sales <= 1000)
        {
            comm = 10.00 / 100.00 * sales;
            System.out.println("The Commission Rate is: %10");
            System.out.printf("The Commission is: %.2f \n", comm);
        }
        else
        {
            comm = 12.50 / 100.00 * sales;
            System.out.println("The Commission Rate is: %12.5");
            System.out.printf("The Commission is: %.2f \n", comm);
        }
        System.out.println();

        //Q4
        Random player = new Random();
        int player1 = 0;
        int player2 = 0;
        System.out.println("Players Throws Dices twice");
        for (int i = 0; i < 2; i++) {
            int random = player.nextInt(5) + 6;
            int random2 = player.nextInt(5) + 6;

            player1 = player1 + random;
            player2 = player2 + random2;
        }

        if (player1 < player2)
        {
            System.out.println("Player2 Wins!");
        }
        else if (player1 > player2)
        {
            System.out.println("Player1 Wins!");
        }
        else
        {
            System.out.println("It's a Tie !");
        }

        //Q5
        Scanner cramer = new Scanner(System.in);
        System.out.println("Enter the Value a, b, c, d, e, f In order: ");
        int a = cramer.nextInt();
        int b = cramer.nextInt();
        int c = cramer.nextInt();
        int d = cramer.nextInt();
        int e = cramer.nextInt();
        int f = cramer.nextInt();
        
        int x =(e*d-b*f)/(a*d-b*c);
        int y = (a*f-e*c)/(a*d-b*c);
        int statment = (a*d)-(b*c);
        
        System.out.println("The Value of x is: " + x + " The Value of y is: " + y);
        
        if (statment == 0)
        {
            System.out.println("The equation has no solution");
        }
        
        //Q6
            
        Scanner radiusA = new Scanner(System.in);
        System.out.println("Enter the Radius of a Circle and A Cordianation Point in Order (x,y)");
        int radius = radiusA.nextInt();
        int CorX = radiusA.nextInt();
        int CorY = radiusA.nextInt();
        
        int placement = (CorX^2 + CorY^2 - radius^2);
        
        /**Outside: x12 + y12 – r2 > 0

        On: x12 + y12 – r2 = 0

        Inside: x12 + y12 – r2 < 0 **/
        
        if (placement == 0)
        {
            System.out.println("The Point in On The Center");
        }
        else if (placement > 0)
        {
            System.out.println("The Point in Outside The Circle");
        }
        else
        {
            System.out.println("The Point in Inside The Circle");
        }
        
    }
    
}
