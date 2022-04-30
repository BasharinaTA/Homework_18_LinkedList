package com.company;

public class List {
    private Node head;
    private int length;

    public Node getHead() {
        return this.head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List() {
        this.head = null;
        this.length = 0;
    }

    public List(Node head) {
        this.head = head;
        this.length = 1;
    }

// Печать значений списка
    public void printList() {
        Node tmpNode = this.head;
        while (tmpNode !=  null) {
            System.out.print(tmpNode.getValue() + " ");
            tmpNode = tmpNode.getNextNode();
        }
        System.out.println();
    }

// Добавить элемент в конец списка
    public void push(int value) {
        Node tmpNode = this.head;
        while (tmpNode.getNextNode() != null) {
            tmpNode = tmpNode.getNextNode();
        }
        tmpNode.setNextNode(new Node(value));
        this.length++;
    }

// Добавить элемент по индексу в список
    public void push(int value, int index) {
        if (index == 0) {
            this.pushHead(value);
        } else {
            Node tmpNode = this.head;
            for (int i = 0; i < index - 1 && tmpNode.getNextNode() != null; i++) {
                tmpNode = tmpNode.getNextNode();
            }
            Node pushNode = new Node(value, tmpNode.getNextNode());
            tmpNode.setNextNode(pushNode);
            length++;
        }
    }

// Закрытый метод добавления в список головного элемента
    private void pushHead(int value) {
        Node tmpNode = new Node(value, this.head);
        this.head = tmpNode;
        length++;
    }

// Удаление элемента в конце списка
    public void pop() {
        Node tmpNode = this.head;
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
            Node tmpNode = this.head;
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
