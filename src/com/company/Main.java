package com.company;

public class Main {

    public static void main(String[] args) {
 /*
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(45);

        List list = new List(node1);


        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);

        System.out.println(list.getLength());

        System.out.println(node1.getValue());
        System.out.println(node1.getNextNode().getValue());
        System.out.println(node1.getNextNode().getNextNode().getValue());
        System.out.println(node1.getNextNode().getNextNode().getNextNode().getValue());
        System.out.println(node1.getNextNode().getNextNode().getNextNode().getNextNode());

        list.printList();
        list.push(7);
        list.printList();

        list.push(0, 0);
        list.push(-1, 4);
        list.push(-9, 7);
        list.push(20, 47);
        list.printList();

        list.pop(8);
        list.pop(120);
        list.pop(5);
        list.pop(0);
        list.printList();

        System.out.println(list.getLength());

 */
        int[] arr = new int[]{1, 3, 7};
        List list = new List(new Node(arr[0]));
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
        ListString list05 = new ListString(arrTask5);
        list05.printList();
        Exercises.task05(list05);

        System.out.println();

// Задание 6
// Проверить, что каждое следующее слово в списке начинается с последней буквы предыдущего.
        String[] arrTask6 = new String[]{"task", "Kate", "bar", "red", "dad"};
        ListString list06 = new ListString(arrTask6);
        list06.printList();
        Exercises.tack06(list06);

        System.out.println();

// Задание 7
// Определить количество слов в списке, которые совпадают с первым (последним) словом списка.
        String[] arrTask7 = new String[]{"tiger", "bird", "tiger", "bird", "bird", "tiger", "rabbit"};
        ListString list07 = new ListString(arrTask7);
        list07.printList();
        Exercises.task07(list07);

        System.out.println();

// Задание 8
// Проверить, упорядочены ли элементы списка по алфавиту.
        String[] arrTask8 = new String[]{"aa", "Aa", "ab", "BA", "b"};
        ListString list08 = new ListString(arrTask8);
        list08.printList();
        Exercises.task08(list08);

        System.out.println();

// Задание 9
// Определить, входит ли список L1 в L2.
        String[] arr1 = new String[] {"test", "task"};
        String[] arr2 = new String[] {"task", "test", "dog",  "test", "task", "book"};
        ListString l1 = new ListString(arr1);
        ListString l2 = new ListString(arr2);
        l1.printList();
        l2.printList();
        Exercises.task09(l1, l2);

        System.out.println();

// Задание 10
// Перевернуть список наоборот.
        String[] arrTas10 = new String[]{"aa", "bb", "cc", "dd"};
        ListString list10 = new ListString(arrTas10);
        list10.printList();
        Exercises.task10(list10);
        list10.printList();
    }
}
