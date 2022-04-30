package com.company;

public class Node {
    private int value;
    private Node nextNode;

    public int getValue() {
        return this.value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node() {
        this.value = 0;
        this.nextNode = null;
    }

    public Node(int value) {
        this.value = value;
        this.nextNode = null;
    }

    public Node(int value, Node nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }

}
