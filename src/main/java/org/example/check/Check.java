package org.example.check;

import org.example.check.symbols.Symbols;

public class Check {
    public static void checkForBrackets(String string){
        for( int i = 0; i < string.length() -1; i++){
            if(Symbols.isOk(string.charAt(i),string.charAt(i+1)))
                throw new RuntimeException("Два одинаковых символа!");
        }
        System.out.println("Все ок!");
    }
}

