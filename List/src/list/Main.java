/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package list;

/**
 *
 * @author Гамаюнов Иван
 */
// Пример использования списка.
public class Main {
    public static void main(String[] args) {
        List<Integer> list = new List<>();

        // Добавление элементов в список.
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        // Вывод списка.
        System.out.println(list); // [1, 2, 3, 4, 5]

        // Получение элемента по индексу.
        System.out.println(list.get(2)); // 3

        // Установка элемента по индексу.
        list.set(2, 10);

        // Вывод списка.
        System.out.println(list); // [1, 2, 10, 4, 5]

        // Удаление элемента из конца списка.
        list.removeLast();

        // Вывод списка.
        System.out.println(list); // [1, 2, 10, 4]

        // Удаление элемента из начала списка.
        list.removeFirst();

        // Вывод списка.
        System.out.println(list); // [2, 10, 4]

        // Удаление элемента по индексу.
        list.remove(1);

        // Вывод списка.
        System.out.println(list); // [2, 4]

        // Проверка, пуст ли список.
        System.out.println(list.isEmpty()); // false

        // Получение размера списка.
        System.out.println(list.size()); // 2

        // Очистка списка.
        list.clear();

        // Проверка, пуст ли список.
        System.out.println(list.isEmpty()); // true

        // Вывод списка.
        System.out.println(list); // []
    }
}

