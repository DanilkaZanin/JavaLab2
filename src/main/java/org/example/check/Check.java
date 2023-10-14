package org.example.check;

import org.example.check.symbols.Symbols;

import java.util.ArrayList;
import java.util.List;

public class Check {
    /** Метод ищет парные знаки и знаки, которых не должно быть в выражении */
    public static void areBadSigns(String string){
        for( int i = 0; i < string.length() -1; i++){
            if(Symbols.isOk(string.charAt(i),string.charAt(i+1)))
                throw new RuntimeException("BAD SYNTAX!");
        }
    }
    public static List<String> areVariables(String string){
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

