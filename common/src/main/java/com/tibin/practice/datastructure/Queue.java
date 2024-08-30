package com.tibin.practice.datastructure;

public class Queue<T> {
    private Node front;
    private Node rear;

    public Queue() {
        front = null;
        rear = null;
    }

    public void enqueue(T val) {
        Node node = new Node(val);
        if (front == null) {
            front = node;
            rear = node;
        } else {
            node.left(rear);
            rear.right(node);
            rear = node;
        }
    }

    public T dequeue() {
        T val;
        if (front == null) {
            return null;
        }

        val = (T) front.val();

        if (front == rear) {
            front = null;
            rear = null;
        } else {
            front = front.right();
        }
        return val;
    }

    public T peek() {
        if (front == null)
            return null;
        return (T) front.val();
    }

}
