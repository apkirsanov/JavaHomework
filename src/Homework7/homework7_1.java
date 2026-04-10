package Homework7;
   /*
   Задача 1:
Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
    */
import java.util.Scanner;

public class homework7_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 строки: ");
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String string3 = scanner.nextLine();
        String shortest = string1;
        String longest = string1;
        if (string2.length() < shortest.length()) {
            shortest = string2;
        }
        if (string3.length() < shortest.length()) {
            shortest = string3;
        }
        if (string2.length() > longest.length()) {
            longest = string2;
        }
        if (string3.length() > longest.length()) {
            longest = string3;
        }
        System.out.println("Самая короткая строка " + shortest + ", её длина = " + shortest.length());
        System.out.println("Самая длинная строка " + longest + ", её длина = " + longest.length());
        scanner.close();
    }
}
