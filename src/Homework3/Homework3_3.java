package Homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] mass = new int[size];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = random.nextInt(32);
        }
        System.out.println(Arrays.toString(mass));

         /*
        Найти индексы минимального и максимального элементов и вывести в консоль.
         */

        int minIndex = 0;
        int maxIndex = 0;
        for (int i = 1; i < size; i++) {
            if (mass[i] < mass[minIndex]) minIndex = i;
            if (mass[i] > mass[maxIndex]) maxIndex = i;

        }
        System.out.println("Индекс min элемента: " + minIndex);
        System.out.println("Индекс max элемента: " + maxIndex);
    }
}
