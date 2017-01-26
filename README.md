#1. Task
##String Calculator

###1. Create a simple String calculator with a method int Add(string numbers)
1. The method can take 0, 1 or 2 numbers, and will return their sum (for an empty string it will return 0) for example “” or “1” or “1,2”
2. Start with t1he simplest test case of an empty string and move to 1 and two numbers
3. Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
4. Remember to refactor after each passing test
###2. Allow the Add method to handle an unknown amount of numbers
###3. Allow the Add method to handle new lines between numbers (instead of commas).
1. the following input is ok:  “1\n2,3”  (will equal 6)
2. the following input is NOT ok:  “1,\n” (not need to prove it - just clarifying)
###4. Support different delimiters
1. to change a delimiter, the beginning of the string will contain a separate line that looks like this:   “//[delimiter]\n[numbers…]” for example “//;\n1;2”1 should return three where the default delimiter is ‘;’ .
2. the first line is optional. all existing scenarios should still be supported
###5. Calling Add with a negative number will throw an exception “negatives not allowed” - and the negative that was passed.if there are multiple negatives, show all of them in the exception message
___
######stop here if you are a beginner. Continue if you can finish the steps so far in less than 30 minutes.
___
###6. Numbers bigger than 1000 should be ignored, so adding 2 + 1001  = 2
###7. Delimiters can be of any length with the following format:  “//[delimiter]\n” for example: “//[***]\n1***2***3” should return 6
###8. Allow multiple delimiters like this:  “//[delim1][delim2]\n” for example “//[*][%]\n1*2%3” should return 6.
###9. make sure you can also handle multiple delimiters with length longer than one char

#2. Task
Необходимо вычислить квадратный корень заданного натурального числа n с
округлением вниз до ближайшего целого, не используя функций sqrt(n) и n^0.5. Например,
для числа 14 результатом будет число 3, для числа 28 – число 5. Также необходимо
привести краткую информацию об используемом алгоритме.

Входные данные: Произвольное натуральное число n.

Выходные данные: Квадратный корень заданного числа, округлённый вниз до ближайшего целого.

##Во время написания программ обратите внимание, что:

  ○ код приложений должен строго соответствовать методологии ООП, а также быть компактным и легко читаемым

  ○ приложения должны корректно реагировать на широкий спектр возможных входных значений, обрабатывать исключительные ситуации

  ○ все задачи должны быть решены наиболее оптимальным образом, с наименьшим использованием ресурсов памяти и процессора

  ○ в исходный код следует добавлять комментарии на английском языке