package com.company;

public class Node<T>  {
    private T value;
    private Node<T> nextNode;

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Node<T> getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(Node<T> nextNode) {
        this.nextNode = nextNode;
    }

    public Node() {
        this.value = null;
        this.nextNode = null;
    }

    public Node(T value) {
        this.value = value;
        this.nextNode = null;
    }

    public Node(T value, Node<T> nextNode) {
        this.value = value;
        this.nextNode = nextNode;
    }
}
