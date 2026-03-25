package Homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_4 {
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
        Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
        вывести сообщение, что их нет.
         */

        int zero = 0;
        for (int num : mass) {
            if (num == 0) {
                zero++;
            }

        }
        if (zero > 0) {
            System.out.println("Количество нулевых элементов: " + zero);
        } else {
            System.out.println("Нулевых элементов нет");
        }
    }
}
