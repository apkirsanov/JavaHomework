package homework4_2;
/*
Создать класс, описывающий банкомат. Набор купюр, находящихся в
банкомате, должен задаваться тремя свойствами: количеством купюр
номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а
возвращает булевое значение - успешность выполнения операции. При
снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами
-количеством купюр каждого номинала
 */

import java.util.Scanner;

public class ATM {
    int count20;
    int count50;
    int count100;
    public ATM(int count20, int count50, int count100) {
        this.count20 = count20;
        this.count50 = count50;
        this.count100 = count100;
    }
    public void replenishment() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество вносимых купюр.");
        System.out.println("20 долларов: ");
        int add20 = scanner.nextInt();
        System.out.println("50 долларов: ");
        int add50 = scanner.nextInt();
        System.out.println("100 долларов: ");
        int add100 = scanner.nextInt();
        if (add20 < 0 || add50 < 0 || add100 < 0) {
            System.out.println("Ошибка!");
            return;
        }
        count20 += add20;
        count50 += add50;
        count100 += add100;
    }
    public void displayInfo() {
        System.out.println("Количество купюр в банкомате:");
        System.out.println(count20 + " купюр по 20 долларов");
        System.out.println(count50 + " купюр по 50 долларов");
        System.out.println(count100 + " купюр по 100 долларов");
    }
    public boolean getMoney(int withdrawal) {
        int withdraw20 = 0;
        int withdraw50 = 0;
        int withdraw100 = 0;
        int dispense = withdrawal;
        int tempCount20 = count20;
        int tempCount50 = count50;
        int tempCount100 = count100;
        int amount = tempCount20 * 20 + tempCount50 * 50 + tempCount100 * 100;
        if (withdrawal % 10 != 0) {
            System.out.println("Невозможно выдать такую сумму");
            return false;
        }
        if (withdrawal > amount) {
            System.out.println("Невозможно выдать такую сумму");
            return false;
        }
        withdraw100 = Math.min(dispense / 100, tempCount100);
        dispense -= withdraw100 * 100;
        withdraw50 = Math.min(dispense / 50, tempCount50);
        dispense -= withdraw50 * 50;
        withdraw20 = Math.min(dispense / 20, tempCount20);
        dispense -= withdraw20 * 20;
        if (dispense > 0) {
            boolean found = false;
            for (int i = withdraw100; i >= 0; i--) {
                int remaining = withdrawal - (i * 100);
                int possible50 = Math.min(remaining / 50, tempCount50);
                remaining -= possible50 * 50;
                int possible20 = Math.min(remaining / 20, tempCount20);
                remaining -= possible20 * 20;
                if (remaining == 0 && possible50 <= tempCount50 && possible20 <= tempCount20) {
                    withdraw100 = i;
                    withdraw50 = possible50;
                    withdraw20 = possible20;
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Невозможно выдать такую сумму");
                return false;
            }
        }
        if (withdraw100 * 100 + withdraw50 * 50 + withdraw20 * 20 != withdrawal) {
            System.out.println("Невозможно выдать такую сумму");
            return false;
        }
        count20 -= withdraw20;
        count50 -= withdraw50;
        count100 -= withdraw100;
        System.out.println("Успешно! Выдано: ");
        if (withdraw20 > 0) System.out.println(withdraw20 + " купюр по 20 долларов");
        if (withdraw50 > 0) System.out.println(withdraw50 + " купюр по 50 долларов");
        if (withdraw100 > 0) System.out.println(withdraw100 + " купюр по 100 долларов");
        return true;
    }
}

