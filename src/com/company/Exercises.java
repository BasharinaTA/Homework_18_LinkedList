package com.company;

public class Exercises {
// Метод нахождения среднеарифметического значения элементов списка
    public static double task01(List<Integer> list) {
        var tmpNode = list.getHead();
        int sum = 0;
        while (tmpNode != null) {
            sum += tmpNode.getValue();
            tmpNode = tmpNode.getNextNode();
        }
        return (double) sum / list.getLength();
    }

// Метод переноса в начало списка его последнего элемента
    public static <T> void task02(List<T> list) {
        if (list.getLength() > 1) {
            var tmpNode = list.getHead();
            while (tmpNode.getNextNode().getNextNode() != null) {
                tmpNode = tmpNode.getNextNode();
            }
            var lastNode = tmpNode.getNextNode();
            tmpNode.setNextNode(null);
            lastNode.setNextNode(list.getHead());
            list.setHead(lastNode);
        }
    }

// Метод переноса в конец списка его первого элемента
    public static <T> void task03(List<T> list) {
        if (list.getLength() > 1) {
            var firstNode = list.getHead();
            list.setHead(firstNode.getNextNode());
            var tmpNode = list.getHead();
            while (tmpNode.getNextNode() != null) {
                tmpNode = tmpNode.getNextNode();
            }
            tmpNode.setNextNode(firstNode);
            firstNode.setNextNode(null);
        }
    }

// Метод обмена местами первого и последнего элементов списка
//Вариант 1: меняет местами значения у первого и последнего элемента списка
    public static <T> void task04_1(List<T> list) {
        var tmpNode = list.getHead();
        T firstValue = tmpNode.getValue();
       while (tmpNode.getNextNode() != null) {
            tmpNode = tmpNode.getNextNode();
       }
       T lastValue = tmpNode.getValue();
       tmpNode.setValue(firstValue);
       list.getHead().setValue(lastValue);
    }

//Вариант 2: меняем местами первый и последний элемент
    public static <T> void task04_2(List<T> list) {
        if (list.getLength() == 2) {
            var secondNode = list.getHead().getNextNode();
            secondNode.setNextNode(list.getHead());
            list.getHead().setNextNode(null);
            list.setHead(secondNode);
        } else if (list.getLength() > 2) {
            var tmpNode = list.getHead();
            while (tmpNode.getNextNode().getNextNode() != null) {
                tmpNode = tmpNode.getNextNode();
            }
            var lastNode = tmpNode.getNextNode();
            lastNode.setNextNode(list.getHead().getNextNode());
            tmpNode.setNextNode(list.getHead());
            list.getHead().setNextNode(null);
            list.setHead(lastNode);
        }
    }

// Метод определения количества слов, которые начинаются и заканчиваются на одну букву
    public static void task05(List<String> list) {
        int count = 0;
       var tmpNode = list.getHead();
        while (tmpNode != null) {
            if (isMatch(tmpNode.getValue())) {
                count++;
            }
            tmpNode = tmpNode.getNextNode();
        }
        System.out.println("Количество слов, которые начинаются и заканчиваются на одну букву, равно " + count);
    }

    private static boolean isMatch(String str) {
        return str.charAt(0) == str.charAt(str.length() - 1);
    }

// Метод проверки, что каждое следующее слово в списке начинается с последней буквы предыдущего
    public static void tack06(List<String> list) {
        var tmpNode = list.getHead();
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

    private static boolean isNext(String previous, String next) {
        return previous.charAt(previous.length() - 1) == next.charAt(0);
    }

// Метод определения количества слов в списке, которые совпадают с первым (последним) словом списка
    public static void task07(List<String> list) {
        int count = 0;
        var tmpNode = list.getHead().getNextNode();
        while (tmpNode != null) {
            if (list.getHead().getValue().equals(tmpNode.getValue())) {
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
        var lastNode = tmpNode;
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
    public static void task08(List<String> list) {
        if (isListOrdered(list)) {
            System.out.println("Элементы в списке упорядочены по алфавиту");
        } else {
            System.out.println("Элементы в списке не упорядочены по алфавиту");
        }
    }

    private static boolean isListOrdered(List<String> list) {
        var tmpNode = list.getHead();
        while (tmpNode.getNextNode() != null) {
            if (!isStringsOrdered(tmpNode.getValue(), tmpNode.getNextNode().getValue())) {
                return false;
            }
            tmpNode = tmpNode.getNextNode();
        }
        return true;
    }

    private static boolean isStringsOrdered(String firstStr, String secondStr) {
        return firstStr.compareTo(secondStr) <= 0;
    }

// Метод определения вхождения списка L1 в L2
    public static <T> void task09(List<T> l1, List<T> l2) {
        if (isListIncluded(l1, l2)) {
            System.out.println("Список L1 входит в L2");
        } else {
            System.out.println("Список L1 не входит в L2");
        }
    }

    private static <T> boolean isListIncluded(List<T> l1, List<T> L2) {
        var tmpNodeL2 = L2.getHead();
        while (tmpNodeL2 != null) {
            var tmpNodeL1 = l1.getHead();
            var tmpNode = tmpNodeL2;
            while (tmpNodeL1 != null && tmpNode != null && tmpNodeL1.getValue().equals(tmpNode.getValue())) {
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
    public static <T> void task10(List<T> list) {
        var currentNode = list.getHead();
        Node<T> previousNode = null;
        while (currentNode != null) {
            var nextNode = currentNode.getNextNode();
            currentNode.setNextNode(previousNode);
            previousNode = currentNode;
            currentNode = nextNode;
        }
        list.setHead(previousNode);
    }
}