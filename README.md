# Разбор выражения и вычисление его значения

Выражение может содержать числа, знаки операций, скобки. 
В случае, если выражение записано корректно, вычислить значение, 
в противном случае - вывести сообщение об ошибке.

Дополнительно приветствуется поддержка имен переменных и различных функций.
В случае, если есть переменные, их значения нужно запросить у пользователя
(для каждой из них по одному разу) 


Разбиение на токены

    String expression = "2 + 3 * (4 - 1)";

    String[] tokens = expression.split("(?=[+\\-*/()])|(?<=[+\\-*/()])");

    for (String token : tokens) {
    System.out.println(token.trim());
    }