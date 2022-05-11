package com.company;

public class List<T> {
    private Node<T> head;
    private int length;

    public List() {
        this.head = null;
        this.length = 0;
    }

    public List(Node<T> head) {
        this.head = head;
        this.length = 1;
    }

    public List(T[] inputArray) {
        this.head = new Node<>(inputArray[0]);
        for (int i = 1; i < inputArray.length; i++) {
            this.push(inputArray[i]);
        }
        this.length  = inputArray.length;
    }

    public Node<T> getHead() {
        return this.head;
    }

    public void setHead(Node<T> head) {
        this.head = head;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    // Печать значений списка
    public void printList() {
       var tmpNode = this.head;
        while (tmpNode !=  null) {
            System.out.print(tmpNode.getValue() + " ");
            tmpNode = tmpNode.getNextNode();
        }
        System.out.println();
    }

// Добавить элемент в конец списка
    public void push(T value) {
        var tmpNode = this.head;
        while (tmpNode.getNextNode() != null) {
            tmpNode = tmpNode.getNextNode();
        }
        tmpNode.setNextNode(new Node<>(value));
        this.length++;
    }

// Добавить элемент по индексу в список
    public void push(T value, int index) {
        if (index == 0) {
            this.pushHead(value);
        } else {
            var tmpNode = this.head;
            for (int i = 0; i < index - 1 && tmpNode.getNextNode() != null; i++) {
                tmpNode = tmpNode.getNextNode();
            }
            var pushNode = new Node<>(value, tmpNode.getNextNode());
            tmpNode.setNextNode(pushNode);
            length++;
        }
    }

// Закрытый метод добавления в список головного элемента
    private void pushHead(T value) {
        this.head = new Node<>(value, this.head);
        length++;
    }

// Удаление элемента в конце списка
    public void pop() {
        var tmpNode = this.head;
        while (tmpNode.getNextNode().getNextNode() != null) {
            tmpNode = tmpNode.getNextNode();
        }
        tmpNode.setNextNode(null);
        length--;
    }

// Удаление элемента по индексу
    public void pop(int index) {
        if (index == 0) {
            this.popHead();
        } else {
            var tmpNode = this.head;
            for (int i = 0; i < index - 1 && tmpNode.getNextNode().getNextNode() != null; i++) {
                tmpNode = tmpNode.getNextNode();
            }
            tmpNode.setNextNode(tmpNode.getNextNode().getNextNode());
            length--;
        }
    }

// Закрытый метод удаления головного элемента
    private void popHead() {
        this.head = this.head.getNextNode();
        length--;
    }
}
