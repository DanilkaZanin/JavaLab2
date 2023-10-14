package org.example.сontroller;

import org.example.check.Check;
import java.util.List;

public class MainController {
    public MainController(String expression){

        Check.areBadSigns(expression);
        List<String> signs = Check.areVariables(expression);

        IOController.setVariables(expression, signs);
        //дописать и алгоритм решения
    }
}
