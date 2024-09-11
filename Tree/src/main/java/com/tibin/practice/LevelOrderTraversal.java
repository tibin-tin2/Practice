package com.tibin.practice;

import com.tibin.practice.datastructure.Node;
import com.tibin.practice.datastructure.QueueArrayList;
import com.tibin.practice.datastructure.QueueNode;
import com.tibin.practice.util.Printer;
import com.tibin.practice.util.impl.QueueNodePrinter;
import com.tibin.practice.util.impl.TreePrinter;

import java.util.ArrayList;
import java.util.List;

/**
 * This Class is not working.
 * Need to do some refactoring on the implemented Queue
 * @see com.tibin.practice.datastructure.Queue
 */
public class LevelOrderTraversal {

    static QueueNode queue = new QueueNode();
    static List<Integer> elements = new ArrayList<>();

    public static void main(String[] args) {
//        testQueue();
        Node<Integer> node = new Node<>(1);
        Node<Integer> left_root = new Node<>(2);
        Node<Integer> right_root = new Node<>(3);
        node.left(left_root);
        node.right(right_root);
        right_root.left(new Node(5));
        right_root.right(new Node<>(6));

        Printer printer = new TreePrinter();
        printer.print(node);

        QueueArrayList queue = new QueueArrayList();
        queue.enqueue(node);

        levelOrderTraversal(queue);

        System.out.println(elements);
    }

    private static void levelOrderTraversal(QueueArrayList queue) {
        while (queue.peek() != null) {
            Node node = queue.dequeue();

            queue.enqueue(node.left());
            queue.enqueue(node.right());

            elements.add((Integer) node.val());
        }
    }

    private static void testQueue(){
        QueueNode queue = new QueueNode();
        queue.enqueue(new Node<Integer>(1));
        queue.enqueue(new Node<Integer>(2));
        queue.enqueue(new Node<Integer>(3));
        queue.enqueue(new Node<Integer>(4));
        queue.enqueue(new Node<Integer>(5));
        queue.enqueue(new Node<Integer>(6));

        Printer printer = new QueueNodePrinter();
        printer.print(queue);


        queue.dequeue();
        printer.print(queue);

        queue.enqueue(new Node<Integer>(7));
        printer.print(queue);
    }
}

/**
 *
 *
 *
       1
 ┌─────┴─────┐
 2           3
         ┌──┴──┐
         5     6
 */
