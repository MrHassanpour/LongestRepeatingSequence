/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longestrepeatingsequence;

/**
 *
 * @author MCSD
 */
public class lcp {
     public static String lcp(String s, String t){  
        int n = Math.min(s.length(),t.length());  
        for(int i = 0; i < n; i++){  
            if(s.charAt(i) != t.charAt(i)){  
                return s.substring(0,i);  
            }  
        }  
        return s.substring(0,n);  
    }  
    
}
