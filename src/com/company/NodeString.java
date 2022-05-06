package com.company;

public class NodeString {
    private String value;
    private NodeString nextNode;

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public NodeString getNextNode() {
        return this.nextNode;
    }

    public void setNextNode(NodeString nextNode) {
        this.nextNode = nextNode;
    }

    public NodeString() {
        this.value = null;
        this.nextNode = null;
    }

    public NodeString(String value) {
        this.value = value;
        this.nextNode = null;
    }

    public NodeString(String value, NodeString node, int length) {
        this.value = value;
        this.nextNode = node;
    }
}
