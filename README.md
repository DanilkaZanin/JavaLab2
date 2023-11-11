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


Вызвать метод evaluateExpression, передав в него список символов, индекс начала и индекс конца уравнения.

В методе evaluateExpression:
Найти самую внутреннюю пару скобок в уравнении.
Если найдены скобки, рекурсивно вызвать evaluateExpression для выражения внутри скобок.
Заменить скобки на значение выражения внутри них.
Повторить процесс для оставшегося уравнения.
Если скобок не найдено, вызвать метод evaluateSimpleExpression.

В методе evaluateSimpleExpression:
Сначала обработать операции умножения и деления.
Если найдены операции умножения или деления, вычислить результат и заменить операцию и операнды на результат.
Повторить процесс для оставшегося уравнения.
Затем обработать операции сложения и вычитания.
Если найдены операции сложения или вычитания, вычислить результат и заменить операцию и операнды на результат.
Повторить процесс для оставшегося уравнения.
Если не осталось операций, вернуть результат.
Вернуть результат вычисления уравнения.