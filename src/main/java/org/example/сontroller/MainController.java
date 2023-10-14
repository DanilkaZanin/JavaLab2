package org.example.сontroller;

import org.example.entity.Part;

import java.util.LinkedList;

public class MainController {

    public void separateExpression(String string){
        LinkedList<Part> list = new LinkedList<>();

        for(int i = 0; i < string.length(); i++){

            if(Character.isDigit(string.charAt(i))){

                String str = String.valueOf(string.charAt(i));
                int j = i +1;

                while(Character.isDigit(string.charAt(j))){
                    str += String.valueOf(string.charAt(i));
                    j++;
                }
                list.add(new Part(str));
            }
        }
    }
}
