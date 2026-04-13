package Homework8;
 /*
    Задача 2:
    Создать класс, который будет хранить в себе коллекцию с названиями
    животных. Реализовать методы удаления и добавления животных по
    следующим правилам: добавляется всегда в начало коллекции, а удаляется
    всегда из конца. Показать работу объекта этого класса в main методе другого
    класса.
     */
public class Homework8_2 {
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.addAnimal("Кабан");
        animals.addAnimal("Лошадь");
        animals.addAnimal("Волк");
        System.out.println(animals);
        animals.removeAnimal();
        System.out.println("После удаления список выглядит так: " + animals);
    }
}
