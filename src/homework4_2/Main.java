package homework4_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM(10,5,2);
        boolean withdrawalMoney;
        int operation;
        while (true) {
            System.out.println("Здравствуйте. Выберите нужную операцию.");
            System.out.println("1 - Пополнение банкомата");
            System.out.println("2 - Снятие наличных");
            System.out.println("3 - Проверка баланса банкомата");
            System.out.println("4 - Выход");
            operation = scanner.nextInt();
            switch (operation) {
                case 1:
                    atm.replenishment();
                    break;
                case 2:
                    System.out.println("Введите сумму: ");
                    do {
                        int withdrawal = scanner.nextInt();
                        withdrawalMoney = atm.getMoney(withdrawal);
                        if (!withdrawalMoney) System.out.println("Введите другую сумму: ");
                    } while (!withdrawalMoney);
                    break;
                case 3:
                    atm.displayInfo();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Операции с таким значением несуществует.");
            }
        }
    }
}
