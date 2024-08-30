package com.tibin.practice.datastructure;

import java.util.ArrayList;
import java.util.List;

public class QueueArrayList {

    private List<Node<Integer>> queue = new ArrayList<>();
    private Integer front = null;
    private Integer rear = null;

    public void enqueue(Node node) {
        if (node != null) {
            if (front == null) {
                queue.add(node);
                front = queue.indexOf(node);
                rear = queue.indexOf(node);
            } else {
                queue.add(node);
                rear = queue.indexOf(node);
            }
        }
    }

    public Node dequeue() {
        Node val = null;
        if (queue.isEmpty()) {
            return null;
        }

        if (queue.size() == 1 || front == rear) {
            val = queue.get(front);
            front = null;
            rear = null;
        } else {
            val = queue.get(front++);
        }

        return val;
    }

    public Node peek() {
        if (queue.isEmpty()) {
            return null;
        }

        return queue.get(front);
    }
}
