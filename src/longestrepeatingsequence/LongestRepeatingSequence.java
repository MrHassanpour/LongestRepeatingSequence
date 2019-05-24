/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestrepeatingsequence;

import java.util.Scanner;

/**
 * Java Program to find the longest repeating sequence in a string
In this program, we need to find the substring which has been repeated in the original string more than once.
 *
 * @author Alireza Hassanpour
 */
public class LongestRepeatingSequence {

       public static String lcp(String s, String t){  
        int n = Math.min(s.length(),t.length());  
        for(int i = 0; i < n; i++){  
            if(s.charAt(i) != t.charAt(i)){  
                return s.substring(0,i);  
            }  
        }  
        return s.substring(0,n);  
    }  
       
       
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter charecter : ");
         String str = sc.next();  
        String lrs="";  
        int n = str.length();  
        for(int i = 0; i < n; i++){  
            for(int j = i+1; j < n; j++){  
                //Checks for the largest common factors in every substring  
                String x = lcp(str.substring(i,n),str.substring(j,n));  
                //If the current prefix is greater than previous one  
                //then it takes the current one as longest repeating sequence  
                if(x.length() > lrs.length()) lrs=x;  
            }  
        }  
        System.out.println("Longest repeating sequence: "+lrs);
    }
    
}
