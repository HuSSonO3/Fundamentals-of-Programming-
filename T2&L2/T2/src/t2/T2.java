/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package t2;

import java.util.Scanner;

/**
 *
 * @author T2_Hussein Rashed Abdulwareth Al-manifi_S2170731
 */
public class T2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Q1 
        System.out.print("Faculty of Computer Science");
        System.out.println( " and Information Technology");
        System.out.println("Faculty of Computer Science and Information Technology");
        
        //Q2
        System.out.println("\"SDN\" - Software-defined networking");
        
        //Q3 - this are the question after correction !
        System.out.println("Java Programming");
        System.out.println("Introduction to Java!");
        System.out.println("\\t is the horizontal tab character");
        System.out.println("Java is case sensitive!" );
        
        //Q4
        String matric;
        double pi = Math.PI;
        boolean M = false;
        long P = 8800000000L;
        char letter = 'U';
        final String PRO = "Java";
        
        //Q5 - the qustions below are presented after correction.
        //A
        final double AMOUNT = 32.5;
        // AMOUNT += 10; Deleted
        System.out.println("The amount is " + AMOUNT);
        
        //B
        String chapter = "Summary";
        System.out.println(chapter);
        
        //C 
        int num = 0;
        num++; 
        int num1 = num;
        
        //D 
        //this will bring error since num was already declared in the previous question so i commented it instead.
        //double num = 3000; // int can't be used as f like below so we change it to double or float or delete the format.
        //System.out.printf("%4.2f\n", num);
        
        //E
        String contact;
        Scanner keyboard = new Scanner(System.in);
        contact = keyboard.nextLine();
        
        //Q6
        // comfrence is 2pi*diameter
        Scanner diameter = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter diameter: ");
        double d = diameter.nextDouble();
        double Pi = Math.PI;
        double c =  Pi *d;
        System.out.printf("The circumference of the circle is : %.3f \n",c);
        
        
        //Q7
        Scanner inch = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter value in inch: ");
        double i = inch.nextDouble();
        double cm = i * 2.54;
        double m = cm / 100;
        
        System.out.printf("%.2f inches = %.2f meters\n",i,m);
    }
    
}
