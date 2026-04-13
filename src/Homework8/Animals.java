package Homework8;

import java.util.LinkedList;

public class Animals {
    LinkedList<String> animals = new LinkedList<>();
    public void addAnimal(String name) {
        animals.addFirst(name);
    }
    public void removeAnimal() {
        animals.removeLast();
    }
    @Override
    public String toString() {
        return animals.toString();
    }
}
