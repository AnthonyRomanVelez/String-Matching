package com.mycompany.bfstringmatching;
import java.util.*;
public class BFstringMatching {
    
    public static void stringMatching(String text, String pattern){
        int n = text.length();
        int m = pattern.length();
        
        for(int i=0; i <= n-m; i++){
            int j = 0;
            while((j < m) && (pattern.charAt(j) == text.charAt(i+j))){
                j++;
            }
            if(j == m){
                System.out.println("Pattern match at index " + i);
                
            }
            System.out.println(-1);
                
            }
        }
    
    public static void main(String[] args) {
        BFstringMatching object = new BFstringMatching();
        
       String text = "Anthony Roman Velez";
       String pattern = "Roman";
       
       object.stringMatching(text,pattern);
    }
    }

