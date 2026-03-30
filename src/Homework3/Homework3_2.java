package Homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_2 {
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
        Найти минимальный - максимальный элементы и вывести в консоль.
         */

        int min = mass[0];
        int max = mass[0];
        for (int num : mass) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        System.out.println("Min элемент: " + min);
        System.out.println("Max элемент: " + max);
    }
}