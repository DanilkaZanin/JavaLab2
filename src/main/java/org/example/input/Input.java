package org.example.input;

import org.example.entity.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Input {
    public static List<Pair<String, Integer>> askUserForVariables(List<String> variables){
        List<Pair<String,Integer>> list = new ArrayList<>();

        for(String variable : variables){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Переменная " + variable + " = ");
            list.add(new Pair<>(variable,scanner.nextInt()));
        }

        return list;
    }
}
