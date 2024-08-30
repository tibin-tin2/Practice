package com.tibin.practice.datastructure;

public class Node<T> {
    private T val;
    private Node right;
    private Node left;

    public Node(T val) {
        this(val, null, null);
    }

    public Node(T val, Node left, Node right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public Node(Node node) {
        this.val = (T) node.val();
        this.left = node.left();
        this.right = node.right();
    }

    public void val(T val) {
        this.val = val;
    }

    public void left(Node left) {
        this.left = left;
    }

    public void right(Node right) {
        this.right = right;
    }

    public Node left() {
        return left;
    }

    public Node right() {
        return right;
    }

    public T val() {
        return val;
    }

    public static Node clone(Node node) {
        Node newNode = new Node(node.val);
        if (node.left() != null)
            newNode.left(new Node(node.left().val()));

        if (node.right() != null)
            newNode.right(new Node(node.right().val()));
        return newNode;
    }
}
