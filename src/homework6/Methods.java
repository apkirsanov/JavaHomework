package homework6;

public class Methods {
    static void method1() {
        try {
            int result = 10/0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Арифметическая ошибка!");
        }
        System.out.println("Программа продолжила работать");
    }
    static void method2() {
        try {
            int[] mass = {2, 5, 3, 5};
            int num = 10 / 0;
            System.out.println(mass[8]);
        } catch (ArithmeticException e) {
            System.out.println("Арифметическая ошибка!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за пределы массива");
        }
        System.out.println("Программа продолжила работать");
    }
    static void method3() {
        try {
            int[] mass = {1, 4, 6, 9};
            int num = 10/0;
            System.out.println(mass[9]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка");
        }
        System.out.println("Программа продолжила работать");
    }
    static void method4() {
        try {
            int[] mass = {1, 4, 6, 7};
            System.out.println(mass[9]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка");
        } finally {
            System.out.println("Finally выводится несмотря на ошибку");
        }
        System.out.println("Программа продолжила работать");
    }
}
