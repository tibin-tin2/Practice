package com.tibin.practice.datastructure;

public class QueueNode {
    private Node front;
    private Node rear;

    public void enqueue(Node val) {
        if (val != null) {
            Node node = Node.clone(val);
            if (front == null) {
                front = node;
                rear = node;
            } else {
                node.left(rear);
                rear.right(node);
                rear = node;
            }
        }
    }

    public Node dequeue() {
        if (front == null) {
            //queue is empty
            return null;
        }
        Node retVal = null;
        if (front == rear) {
            //queue has one element
            retVal = front;
            front = null;
            rear = null;
        } else {
            retVal = front;
            front = front.right();
        }
        return retVal;
    }

    public Node peek() {
        return front;
    }


}
