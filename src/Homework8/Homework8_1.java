package Homework8;
    /*
    Задача 1:
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран. При решении использовать коллекции.
 */
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Homework8_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите набор чисел: ");
        String numbers = scanner.nextLine();
        String[] arrayNumbers = numbers.split(",");
        Set<String> removeDuplicateNumbers = new TreeSet<>();
        for (String s : arrayNumbers) {
            removeDuplicateNumbers.add(s);
        }
        System.out.println("Строка без повторяющихся элементов: " + removeDuplicateNumbers);
    }
}
