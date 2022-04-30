package com.company;

public class Exercises {
// Метод нахождения среднеарифметического значения элементов списка
    public static double task01(List list) {
        Node tmpNode = list.getHead();
        int sum = 0;
        while (tmpNode != null) {
            sum += tmpNode.getValue();
            tmpNode = tmpNode.getNextNode();
        }
        return (double) sum / list.getLength();
    }

// Метод переноса в начало списка его последнего элемента
    public static void task02(List list) {
        if (list.getLength() > 1) {
            Node tmpNode = list.getHead();
            while (tmpNode.getNextNode().getNextNode() != null) {
                tmpNode = tmpNode.getNextNode();
            }
            Node lastNode = tmpNode.getNextNode();
            tmpNode.setNextNode(null);
            lastNode.setNextNode(list.getHead());
            list.setHead(lastNode);
        }
    }

// Метод переноса в конец списка его первого элемента
    public static void task03(List list) {
        if (list.getLength() > 1) {
            Node firstNode = list.getHead();
            list.setHead(firstNode.getNextNode());
            Node tmpNode = list.getHead();
            while (tmpNode.getNextNode() != null) {
                tmpNode = tmpNode.getNextNode();
            }
            tmpNode.setNextNode(firstNode);
            firstNode.setNextNode(null);
        }
    }

// Метод обмена местами первого и последнего элементов списка
//Вариант 1: меняет местами значения у первого и последнего элемента списка
    public static void task04_1(List list) {
        Node tmpNode = list.getHead();
        int firstValue = tmpNode.getValue();
       while (tmpNode.getNextNode() != null) {
            tmpNode = tmpNode.getNextNode();
       }
       int lastValue = tmpNode.getValue();
       tmpNode.setValue(firstValue);
       list.getHead().setValue(lastValue);
    }

//Вариант 2: меняем местами первый и последний элемент
    public static void task04_2(List list) {
        if (list.getLength() == 2) {
            Node secondNode = list.getHead().getNextNode();
            secondNode.setNextNode(list.getHead());
            list.getHead().setNextNode(null);
            list.setHead(secondNode);
        } else if (list.getLength() > 2) {
            Node tmpNode = list.getHead();
            while (tmpNode.getNextNode().getNextNode() != null) {
                tmpNode = tmpNode.getNextNode();
            }
            Node lastNode = tmpNode.getNextNode();
            lastNode.setNextNode(list.getHead().getNextNode());
            tmpNode.setNextNode(list.getHead());
            list.getHead().setNextNode(null);
            list.setHead(lastNode);
        }

    }
}
