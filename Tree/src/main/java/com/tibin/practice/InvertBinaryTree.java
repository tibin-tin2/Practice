package com.tibin.practice;

import com.tibin.practice.datastructure.Node;
import com.tibin.practice.util.Printer;
import com.tibin.practice.util.impl.TreePrinter;

public class InvertBinaryTree {


    public static void main(String[] args) {
        Node<Integer> node = new Node<>(1);
        Node<Integer> left_root = new Node<>(2);
        Node<Integer> right_root = new Node<>(3);
        node.left(left_root);
        node.right(right_root);
        right_root.left(new Node(5));
        right_root.right(new Node<>(6));

        Printer printer = new TreePrinter();
        printer.print(node);

        Node inverted = invert(node);

        System.out.println(inverted.val());

        printer.print(inverted);

    }

    public static Node invert(Node node) {
        if (node == null)
            return null;

        Node temp = node.left();
        node.left(node.right());
        node.right(temp);

        invert(node.left());
        invert(node.right());
        return node;
    }
}
