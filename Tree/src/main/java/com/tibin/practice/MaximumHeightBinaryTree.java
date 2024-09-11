package com.tibin.practice;

import com.tibin.practice.datastructure.Node;
import com.tibin.practice.util.Printer;
import com.tibin.practice.util.impl.TreePrinter;

public class MaximumHeightBinaryTree {


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

        int maximumHeight = maximumHeight(node);
        System.out.println("MaximumHeight = " + maximumHeight);

    }

    public static int maximumHeight(Node root) {


        if (root == null) {
            return 0;
        }

        int leftHeight = maximumHeight(root.left());
        int rightHeight = maximumHeight(root.right());

        return Math.max(leftHeight, rightHeight) + 1;

    }
}
