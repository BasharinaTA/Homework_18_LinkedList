package com.company;

public class ListString {
    private NodeString head;
    private int length;

    public NodeString getHead() {
        return this.head;
    }

    public void setHead(NodeString head) {
        this.head = head;
    }

    public int getLength() {
        return this.length;
    }

    public ListString() {
        this.head = null;
        this.length = 0;
    }

    public ListString(NodeString head) {
        this.head = head;
        this.length = 1;
    }

// Печать значений списка
    public void printList() {
        NodeString tmpNode = this.head;
        while (tmpNode != null) {
            System.out.print(tmpNode.getValue() + " ");
            tmpNode = tmpNode.getNextNode();
        }
        System.out.println();
    }

// Добавить элемент в конец списка
    public void push(String value) {
        NodeString tmpNode = this.head;
        while (tmpNode.getNextNode() != null) {
            tmpNode = tmpNode.getNextNode();
        }
        tmpNode.setNextNode(new NodeString(value));
        this.length++;
    }

    public ListString(String[] inputArray) {
        this.head = new NodeString(inputArray[0]);
        for (int i = 1; i < inputArray.length; i++) {
            this.push(inputArray[i]);
        }
        this.length  = inputArray.length;
    }
}
