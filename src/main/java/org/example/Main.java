package org.example;

import org.example.check.Check;
import org.example.сontroller.IOController;

import java.util.List;
import java.util.Scanner;

import static org.example.check.Check.areVariables;
import static org.example.сontroller.IOController.setVariables;

public class Main {
    public static void main(String[] args) {
        // нужно разбить строку на токены



        //логично наверное сначала выполнять все операции в скобках
        //для этого сделаем рекурсивную функцию, которая разбивает строку на несколько подстрок и будем вычислять значения внутри

        List<String> str = areVariables("a+b*2");

        String str1 = setVariables("a+b*2",str);
        System.out.println("ВОТ ОНО");
        System.out.println(str1);
    }

}