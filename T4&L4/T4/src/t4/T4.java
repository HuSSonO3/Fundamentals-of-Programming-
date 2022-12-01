/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t4;

import static java.lang.Math.pow;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author T4_Hussein Rashed Abdulwareth Al-manifi_S2170731
 */
public class T4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Q1
        //a
        int n = 0;
        
        while(pow(n,3) < 2000)
        {
            n = n + 1;
        }
        System.out.println(n-1);
        System.out.println();

        
        //b
        for (int i = 1; i < 12; i++)
        {
           System.out.print(i*i + " "); 
        }
        
        System.out.println();
        System.out.println();
        //c
        Random matrix = new Random();
        for (int i = 0; i < 4; i++)
        {
            for (int j = 0; j < 5; j++)
            {
                System.out.printf("%3d" , matrix.nextInt(100));
            }
            System.out.println();
        }
        System.out.println();

        //d
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Integer: ");
        int num = input.nextInt();
        int value = 0;
        for (int i =0 ; i<= num; i++)
        {
            value = value +i;
        }
        System.out.println("Value is: " + value);
        
        System.out.println();
        //e
        double s = 0;
        for (int i=1,j=25; i<=25 && j >= 1; i++,j--)
        {
            s += (i*1.0)/j;
            
        }
        System.out.printf("%.2f\n",s);
        System.out.println();

        
        //Q3
        int f1 = 0;
        int f2 = 1;
        int fn = 0;
        
        for (int i =0; i<10; i++)
        {
            System.out.println(f1 + " " + f2);
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
            
        }
        
        //Q4
        Scanner statement = new Scanner(System.in);
        System.out.println("Give us a statement");
        String state = statement.nextLine();
        char r;
        String reversed = "";
        
        for (int i = 0; i< state.length(); i++)
        {
            r = state.charAt(i);
            reversed = r + reversed;
        }
        System.out.println(reversed);
        
    }
    }
