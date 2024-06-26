package com.example.goit.collection;

import com.example.goit.collection.map.*;

public class MyHashMapTest {
    public static void main(String[] args) {
        MyMap<String, Integer> myHashMap = new MyHashMap<>();

        // Перевірка методу put
        myHashMap.put("one", 1);
        myHashMap.put("two", 2);
        myHashMap.put("three", 3);
        System.out.println("Size after adding three elements: " + myHashMap.size()); // Очікується: 3

        // Перевірка методу get
        System.out.println("Value for key 'one': " + myHashMap.get("one")); // Очікується: 1
        System.out.println("Value for key 'two': " + myHashMap.get("two")); // Очікується: 2

        // Оновлення значення для існуючого ключа
        myHashMap.put("one", 10);
        System.out.println("Updated value for key 'one': " + myHashMap.get("one")); // Очікується: 10

        // Перевірка значення null
        myHashMap.put("four", null);
        System.out.println("Value for key 'four': " + myHashMap.get("four")); // Очікується: null

        // Перевірка на порожність
        System.out.println("Is map empty?: " + myHashMap.isEmpty()); // Очікується: false

        // Додавання великої кількості елементів
        for (int i = 0; i < 1000; i++) {
            myHashMap.put("key" + i, i);
        }
        System.out.println("Size after adding 1000 elements: " + myHashMap.size()); // Очікується: 1004

        // Перевірка ключів з однаковими hashCode
        myHashMap.put("Aa", 1);
        myHashMap.put("BB", 2);
        System.out.println("Value for key 'Aa': " + myHashMap.get("Aa")); // Очікується: 1
        System.out.println("Value for key 'BB': " + myHashMap.get("BB")); // Очікується: 2

        // Перевірка значення null як ключ
        myHashMap.put(null, 100);
        System.out.println("Value for key 'null': " + myHashMap.get(null)); // Очікується: 100

        // Перевірка видалення елементів
        System.out.println("Remove key 'one': " + myHashMap.remove("one")); // Очікується: 10
        System.out.println("Size after removing key 'one': " + myHashMap.size()); // Очікується: 1006
        System.out.println("Remove key 'null': " + myHashMap.remove(null)); // Очікується: 100
        System.out.println("Size after removing key 'null': " + myHashMap.size()); // Очікується: 1005

        // Перевірка видалення елементу, якого немає
        System.out.println("Remove key 'not_exist': " + myHashMap.remove("not_exist")); // Очікується: null

        // Перевірка видалення null як ключа
        myHashMap.put(null, 200);
        System.out.println("Value for key 'null' after re-adding: " + myHashMap.get(null)); // Очікується: 200
        System.out.println("Remove key 'null' again: " + myHashMap.remove(null)); // Очікується: 200
        System.out.println("Size after removing key 'null' again: " + myHashMap.size()); // Очікується: 1005

        // Перевірка toString
        System.out.println("Map toString: " + myHashMap); // Вивести весь вміст карти
    }
}
