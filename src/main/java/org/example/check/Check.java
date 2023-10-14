package org.example.check;

import org.example.check.symbols.Symbols;

import java.util.ArrayList;
import java.util.List;

public class Check {
    public static void checkForBrackets(String string){
        for( int i = 0; i < string.length() -1; i++){
            if(Symbols.isOk(string.charAt(i),string.charAt(i+1)))
                throw new RuntimeException("BAD SYNTAX!");
        }
        System.out.println("Все ок!");
    }
    public static List<String> getVariables(String string){
        List<String> listOFVariables = new ArrayList<>();
        String variable;


        for(int i = 0; i < string.length();){
            if(Character.isLetter(string.charAt(i))){
                variable = String.valueOf(string.charAt(i));
                if(i + 1 < string.length()){
                    while(Character.isLetter(string.charAt(i + 1))){
                        variable += String.valueOf(string.charAt(i + 1));
                        i++;
                    }
                }

                listOFVariables.add(variable);

            }
            i++;
        }

        return listOFVariables;
    }
}

