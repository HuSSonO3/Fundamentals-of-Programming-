/* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.l1q3;

import static java.lang.Math.abs;

/**
 *
 * @author YT
 */
public class L1Q3 {

    public static void main(String[] args) {
        int rows = 9;
        int columns = 8;
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                if (i == 0 || i == rows-1 || j == 0 || j == columns-1){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
                System.out.println();
        }
        System.out.println();
        
        int d = 9;
        for(int i =0; i< d; i++){
            char[] s = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
            int n = d/2-i;
            int r1 = d/2 + i;
            int r2 = (d-1)-(i%4);
             if (r1 <d && r1 != d/2 || r1 == d - 1)
             {
                 s[r1] = '*';
             }
             if (i >= d/2 && r2 < d-1)
             {
                 s[r2] = '*';
             }
            
            
            s[abs(n)] = '*';
            System.out.println(s);
        
        }
        System.out.println();
        
        int r = 9;
        for(int i = 0; i < r; i++){
            char[] s = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
            s[r/2 +1] = '*';
            if (i == 1)
            {
                s[r/2+2] = '*';
                s[r/2] = '*';
            }
            if (i == 2)
            {
                s[r/2+2] = '*';
                s[r/2+3] = '*';
                s[r/2] = '*';
                s[r/2-1] = '*';
            }
            System.out.println(s);
        }      
        
        System.out.println();
        for(int i = 0; i < r; i++){
            char[] s = {' ',' ',' ',' ',' ',' ',' ',' ',' '};
         
            switch (i) {
                case 0 -> {
                    s[r/2] = '*';
                    s[r/2+1] = '*';
                    s[r/2-1] = '*';
                }
                case 1 -> {
                    s[r/2 +3] = '*';
                    s[r/2-3] = '*';
                }
                
                case 7 -> {
                    s[r/2 +3] = '*';
                    s[r/2-3] = '*';
                }
                case 8 -> {
                    s[r/2] = '*';
                    s[r/2+1] = '*';
                    s[r/2-1] = '*';
                }
                default -> {
                    s[r-1] = '*';
                    s[0] = '*';
                }
            }
           
            

            System.out.println(s);
        }      
        
        
        
    }
}
