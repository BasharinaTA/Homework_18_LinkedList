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
        int[] arr = new int[] {1, 3, 7};
        List list = new List(new Node(arr[0]));
        for (int i = 1; i < arr.length; i++) {
            list.push(arr[i]);
        }

        list.printList();

/// Найти среднее арифметическое значение элементов списка.
        System.out.println("Среднеарифметическое значение равно " + Exercises.task01(list));

// Перенести в начало списка его последний элемент.
        Exercises.task02(list);
        System.out.println("Переносим последний элемент в начало списка");
        list.printList();

// Перенести в конец списка его первый элемент.
        Exercises.task03(list);
        System.out.println("Переносим начальный элемент в конец списка");
        list.printList();

// Поменять местами первый и последний элементы списка.
// Вариант 1.
        Exercises.task04_1(list);
        System.out.println("Меняем местами первый и последний элемент (вариант 1)");
        list.printList();

// Вариант 2.

     Exercises.task04_2(list);
        System.out.println("Меняем местами первый и последний элемент (вариант 2)");
     list.printList();


    }
}
