package Homework3;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Homework3_6 {
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
        Проверить, является ли массив возрастающей последовательностью (каждое
        следующее число больше предыдущего).
         */

        boolean incr = true;
        for (int i = 1; i < size; i++) {
            if (mass[i] <= mass[i - 1]) {
                incr = false;
                break;
            }
        }
        System.out.println("Массив " + (incr ? "" : "не ") + "является возрастающей последовательностью");
        scanner.close();
    }
}
