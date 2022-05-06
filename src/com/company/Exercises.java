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

// Метод определения количества слов, которые начинаются и заканчиваются на одну букву
    public static void task05(ListString list) {
        int count = 0;
        NodeString tmpNode = list.getHead();
        while (tmpNode != null) {
            if (isMatch(tmpNode.getValue())) {
                count++;
            }
            tmpNode = tmpNode.getNextNode();
        }
        System.out.println("Количество слов, которые начинаются и заканчиваются на одну букву, равно " + count);
    }

    private static boolean isMatch(String str) {
        return str.toLowerCase().charAt(0) == str.toLowerCase().charAt(str.length() - 1);
    }

// Метод проверки, что каждое следующее слово в списке начинается с последней буквы предыдущего
    public static void tack06(ListString list) {
        NodeString tmpNode = list.getHead();
        boolean isCheck = false;
        while (tmpNode.getNextNode()!= null) {
            if (isNext(tmpNode.getValue(), tmpNode.getNextNode().getValue())) {
                isCheck = true;
            } else {
                isCheck = false;
                break;
            }
            tmpNode = tmpNode.getNextNode();
        }

        if (isCheck) {
            System.out.println("Каждое следующее слово в списке начинается с последней буквы предыдущего");
        } else {
            System.out.println("В списке есть слово " + tmpNode.getValue() +", которое не оканчивается на первую букву следующего слова");
        }
    }

    static boolean isNext(String previous, String next) {
        return previous.toLowerCase().charAt(previous.length() - 1) == next.toLowerCase().charAt(0);
    }

// Метод определения количества слов в списке, которые совпадают с первым (последним) словом списка
    public static void task07(ListString list) {
        int count = 0;
        NodeString tmpNode = list.getHead().getNextNode();
        while (tmpNode != null) {
            if (list.getHead().getValue().equalsIgnoreCase(tmpNode.getValue())) {
                count++;
            }
            tmpNode = tmpNode.getNextNode();
        }
        System.out.println("Количество слов в списке, которые совпадают с первым словом списка, равно " + count);
        count = 0;
        tmpNode = list.getHead();
        while (tmpNode.getNextNode() != null) {
            tmpNode = tmpNode.getNextNode();
        }
        NodeString lastNode = tmpNode;
        tmpNode = list.getHead();
        while (tmpNode != null && tmpNode != lastNode) {
            if (tmpNode.getValue().equalsIgnoreCase(lastNode.getValue())) {
                count++;
            }
            tmpNode = tmpNode.getNextNode();
        }
        System.out.println("Количество слов в списке, которые совпадают с последним словом списка, равно " + count);
    }

// Метод проверки упорядоченности элементов списка по алфавиту
    public static void task08(ListString list) {
        if (isListOrdered(list)) {
            System.out.println("Элементы в списке упорядочены по алфавиту");
        } else {
            System.out.println("Элементы в списке не упорядочены по алфавиту");
        }
    }

    private static boolean isListOrdered(ListString list) {
        NodeString tmpNode = list.getHead();
        while (tmpNode.getNextNode() != null) {
            if (!isStringsOrdered(tmpNode.getValue(), tmpNode.getNextNode().getValue())) {
                return false;
            }
            tmpNode = tmpNode.getNextNode();
        }
        return true;
    }

    private static boolean isStringsOrdered(String firstStr, String secondStr) {
        return firstStr.compareToIgnoreCase(secondStr) <= 0;
    }

// Метод определения вхождения списка L1 в L2
    public static void task09(ListString l1, ListString l2) {
        if (isListIncluded(l1, l2)) {
            System.out.println("Список L1 входит в L2");
        } else {
            System.out.println("Список L1 не входит в L2");
        }
    }

    private static boolean isListIncluded(ListString l1, ListString L2) {
        NodeString tmpNodeL2 = L2.getHead();
        while (tmpNodeL2 != null) {
            NodeString tmpNodeL1 = l1.getHead();
            NodeString tmpNode = tmpNodeL2;
            while (tmpNodeL1 != null && tmpNode != null && tmpNodeL1.getValue().equalsIgnoreCase(tmpNode.getValue())) {
                tmpNodeL1 = tmpNodeL1.getNextNode();
                tmpNode = tmpNode.getNextNode();
            }
            if (tmpNodeL1 == null) {
                return true;
            }
            tmpNodeL2 = tmpNodeL2.getNextNode();
        }
       return false;
    }

// Метод, переворачивающий список наоборот
    public static void task10(ListString list) {
        NodeString currentNode = list.getHead();
        NodeString previousNode = null;
        while (currentNode != null) {
            NodeString nextNode = currentNode.getNextNode();
            currentNode.setNextNode(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }
        list.setHead(previousNode);
/*
  // Вариант 2.
        if (list.getLength() > 1) {
            NodeString currentNode = list.getHead();
            while (currentNode.getNextNode().getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            }
            NodeString penultimate = currentNode;
            NodeString firstNode = currentNode.getNextNode();
            while (list.getHead() != penultimate.getNextNode()) {
                penultimate.getNextNode().setNextNode(penultimate);
                currentNode = list.getHead();
                while (currentNode.getNextNode() != penultimate) {
                    currentNode = currentNode.getNextNode();
                }
                penultimate = currentNode;
            }
            list.getHead().setNextNode(null);
            list.setHead(firstNode);
        }
 */
    }
}