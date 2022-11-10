/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.l1q4;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author YT
 */
public class L1Q4 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Map<String,Integer> sales;  
        sales = new HashMap<>();
        sales.put("January", 2500);
        sales.put("February", 1600);
        sales.put("March", 2000);
        sales.put("April", 2700);
        sales.put("May", 3200);
        sales.put("Jun", 800);
        
            for (Map.Entry<String,Integer> date : sales.entrySet())
            {
              
               int numb = date.getValue()/100 ;
               String bars = "▉";
               String barsRepeated = bars.repeat(numb);
               String key = date.getKey();
               String spaces = " ".repeat(8-key.length());
               System.out.print( key +spaces + " ");
               System.out.println(barsRepeated);
            }
    }
    
}
