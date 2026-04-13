package homework5_2;
/*
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра(используя абстрактный класс/методы). Создать массив из 5 разных
фигур. Вывести на экран сумму периметра всех фигур в массиве
 */
public class Main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[5];
        figures[0] = new Triangle(8, 7, 9);
        figures[1] = new Circle(6);
        figures[2] = new Circle(3);
        figures[3] = new Rectangle(6, 5);
        figures[4] = new Rectangle(4, 6);

        int totalPerimeter = 0;
        for (Figure figure : figures) {
            totalPerimeter += (int) figure.calculatePerimeter();
        }
        System.out.printf("Сумма периметров всех фигур = " + totalPerimeter);
    }
}
