package com.company;

public class Main {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 3, 7};
        var list = new List<>(new Node<>(arr[0]));
        for (int i = 1; i < arr.length; i++) {
            list.push(arr[i]);
        }

        list.printList();

// Задание 1.
// Найти среднее арифметическое значение элементов списка.
        System.out.println("Среднеарифметическое значение равно " + Exercises.task01(list));

// Задание 2.
// Перенести в начало списка его последний элемент.
        Exercises.task02(list);
        System.out.println("Переносим последний элемент в начало списка");
        list.printList();

// Задание 3
// Перенести в конец списка его первый элемент.
        Exercises.task03(list);
        System.out.println("Переносим начальный элемент в конец списка");
        list.printList();

// Задание 4
// Поменять местами первый и последний элементы списка.
// Вариант 1.
        Exercises.task04_1(list);
        System.out.println("Меняем местами первый и последний элемент (вариант 1)");
        list.printList();

// Вариант 2.
        Exercises.task04_2(list);
        System.out.println("Меняем местами первый и последний элемент (вариант 2)");
        list.printList();

        System.out.println();

// Задание 5
// Определить количество слов в списке, которые начинаются и заканчиваются на одну букву.
        String[] arrTask5 = new String[]{"Аптека", "парашют", "потоп", "в", "угУ"};
        var list05 = new List<>(arrTask5);
        list05.printList();
        Exercises.task05(list05);

        System.out.println();

// Задание 6
// Проверить, что каждое следующее слово в списке начинается с последней буквы предыдущего.
        String[] arrTask6 = new String[]{"task", "kate", "bar", "red", "dad"};
        var list06 = new List<>(arrTask6);
        list06.printList();
        Exercises.tack06(list06);

        System.out.println();

// Задание 7
// Определить количество слов в списке, которые совпадают с первым (последним) словом списка.
        String[] arrTask7 = new String[]{"tiger", "bird", "Tiger", "bird", "bird", "tiger", "rabbit"};
        var list07 = new List<>(arrTask7);
        list07.printList();
        Exercises.task07(list07);

        System.out.println();

// Задание 8
// Проверить, упорядочены ли элементы списка по алфавиту.
        String[] arrTask8 = new String[]{"aa", "aa", "ab", "b", "ba"};
        var list08 = new List<>(arrTask8);
        list08.printList();
        Exercises.task08(list08);

        System.out.println();

// Задание 9
// Определить, входит ли список L1 в L2.
        String[] arr1 = new String[] {"test", "task"};
        String[] arr2 = new String[] {"task", "test", "dog",  "test", "task", "book"};
        var l1 = new List<>(arr1);
        var l2 = new List<>(arr2);
        l1.printList();
        l2.printList();
        Exercises.task09(l1, l2);

        System.out.println();

// Задание 10
// Перевернуть список наоборот.
        String[] arrTas10 = new String[]{"ab", "bb", "cc", "dd"};
        var list10 = new List<>(arrTas10);
        list10.printList();
        Exercises.task10(list10);
        list10.printList();
    }
}
