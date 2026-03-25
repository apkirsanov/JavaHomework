package Homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_5 {
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
        Пройти по массиву и поменять местами элементы первый и последний, второй
        и предпоследний и т.д.
         */

        for (int i = 0; i < mass.length / 2; i++) {
            int pos = mass[i];
            mass[i] = mass[mass.length - 1 - i];
            mass[mass.length - 1 - i] = pos;
        }
        System.out.println("Массив после изменения мест элементов: " + Arrays.toString(mass));
    }
}
