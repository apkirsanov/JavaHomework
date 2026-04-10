package homework6;
/*
Задача 1:
Создать класс с как минимум 4 разными методами, в каждом методе добавить
проверку на исключительные ситуации, используя:
1. try- catch
2. try-catch, где catch будет несколько
3. try -catch, с использованием multi - catch
4. try-catch-finally
Продемонстрировать обработку исключительных ситуаций на примерах
 */
public class Main {
    public static void main(String[] args) {
        Methods methods = new Methods();
        System.out.println("try-cath");
        Methods.method1();
        System.out.println("------------------------------");
        System.out.println("try-catch с несколькими catch");
        Methods.method2();
        System.out.println("------------------------------");
        System.out.println("multicath");
        Methods.method3();
        System.out.println("------------------------------");
        System.out.println("try-cath-finally");
        Methods.method4();
    }
}
