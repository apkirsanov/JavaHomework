package Homework7;

import java.util.Scanner;
/*
    Задача 4:
Ввести 3 строки с консоли. Найти слово, состоящее только из различных
символов. Если таких слов несколько, найти первое из них.
     */
public class homework7_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 строки: ");
        String string1 = scanner.nextLine();
        String string2 = scanner.nextLine();
        String string3 = scanner.nextLine();
        String[] arrayStrings = {string1, string2, string3};
        String result = null;
        for (String str : arrayStrings) {
            if (uniq(str)) {
                result = str;
                break;
            }
        }
        if (result != null) {
            System.out.println(result + " - состоит из разных символов");
        } else {
            System.out.println("Слов из разных символов нет");
        }
    }
    static boolean uniq(String str1) {
        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j < str1.length(); j++) {
                if (str1.charAt(i) == str1.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
}
