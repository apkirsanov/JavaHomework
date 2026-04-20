package Homework7;

import java.util.Scanner;
/*
Задача 3:
Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
меньше средней, а также их длину
 */
public class homework7_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 строки: ");
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String string3 = scanner.nextLine();
        String[] arrayStrings = {string1, string2, string3};
        int summ = string1.length() + string2.length() + string3.length();
        double averageLenght = summ / 3.0;
        if (string1.length() < averageLenght) {
            System.out.println("Первая строка: " + string1 + " - меньше среднего значения. Её длина - " + string1.length());
        }
        if (string2.length() < averageLenght) {
            System.out.println("Вторя строка: " + string2 + " - меньше среднего значения. Её длина - " + string2.length());
        }
        if (string3.length() < averageLenght) {
            System.out.println("Третья строка: " + string3 + " - меньше среднего значения. Её длина - " + string3.length());
        }
        scanner.close();
    }
}
