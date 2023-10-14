package org.example;

import org.example.check.Check;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // сначала сделать проверку на два знака рядом и скобки
        // просмотреть, есть ли переменные, если есть, то запросить значения
        //логично наверное сначала выполнять все операции в скобках
        //для этого сделаем функцию, которая разбивает строку на несколько подстрок и будем вычислять значения внутри

        String str = "asd==f";

        Check.checkForBrackets(str);
    }

}