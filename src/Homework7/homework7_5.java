package Homework7;

import java.util.Scanner;
/*
    Задача 5:
Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
     */
public class homework7_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String string1 = scanner.nextLine();
        StringBuilder string2 = new StringBuilder();
        for (char i : string1.toCharArray()) {
            string2.append(i).append(i);
        }
        System.out.println(string2);
        scanner.close();
    }
}
