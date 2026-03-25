package Homework3;
/*
Для всех задач исходные условия следующие: пользователь с клавиатуры
вводит размер массива (просто целое число). После того, как размер массива
задан, заполнить его одним из двух способов: используя Math.random(), или
каждый элемент массива вводится пользователем вручную. Попробовать оба
варианта. После заполнения массива данными, решить для него следующие
задачи:
 */
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_1 {
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
        Пройти по массиву, вывести все элементы в прямом и в обратном порядке.
         */

        System.out.println("Прямой порядок: " + Arrays.toString(mass));
        System.out.print("Обратный порядок: [");
        for (int i = mass.length - 1; i >= 0; i--) {
            System.out.print(mass[i]);
            if (i > 0) {
                System.out.print(", ");

            }
        }
        System.out.println("]");
    }
}
