package Homework8;

import java.util.HashMap;
import java.util.Map;
/*
    Задача 3:
    На вход поступает массив строк, верните Map<String, Boolean>, где каждая
    отдельная строка является ключом, и ее значение равно true, если эта строка
    встречается в массиве 2 или более раз. Пример:
    wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
    wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
    wordMultiple(["c", "c", "c", "c"])→{"c": true}
     */
public class Homework8_3 {
    public static void main(String[] args) {
        String[] string1 = new String[]{"a", "b", "a", "c", "b"};
        String[] string2 = new String[]{"c", "b", "a"};
        String[] string3 = new String[]{"c", "c", "c", "c"};
        System.out.println(wordMultiple(string1));
        System.out.println(wordMultiple(string2));
        System.out.println(wordMultiple(string3));
    }
    public static Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map = new HashMap<>();
        for (String s : strings) {
            map.put(s, map.containsKey(s));
        }
        return map;
    }
}

