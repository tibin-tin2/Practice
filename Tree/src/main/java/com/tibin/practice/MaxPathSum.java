package com.tibin.practice;

import com.tibin.practice.datastructure.Node;
import com.tibin.practice.util.Printer;
import com.tibin.practice.util.impl.TreePrinter;

public class MaxPathSum {

    public static void main(String[] args) {
        Node<Integer> root = new Node<>(1);
        Node<Integer> l1_a = new Node<>(2);
        Node<Integer> l1_b = new Node<>(3);
        Node<Integer> l2_a = new Node<>(4);
        Node<Integer> l2_b = new Node<>(5);
        Node<Integer> l2_c = new Node<>(6);
        Node<Integer> l2_d = new Node<>(7);
        Node<Integer> l3_a = new Node<>(8);
        Node<Integer> l3_b = new Node<>(9);
        Node<Integer> l3_c = new Node<>(10);
        Node<Integer> l3_d = new Node<>(11);

        root.left(l1_a);
        root.right(l1_b);

        l1_a.left(l2_a);
        l1_a.right(l2_b);

        l1_b.left(l2_c);
        l1_b.right(l2_d);

        l2_a.left(l3_a);
        l2_a.right(l3_b);

        l3_b.left(l3_c);
        l3_b.right(l3_d);

        Printer printer = new TreePrinter();
        printer.print(root);

        int max[] = new int[1];
        max[0] = Integer.MIN_VALUE;

        findMaximumSum(root, max);

        System.out.println(max[0]);
    }

    public static int findMaximumSum(Node node, int max[]) {
        if (node == null) {
            return 0;
        }
        Integer val = (Integer) node.val();
        int left = findMaximumSum(node.left(), max);
        int right = findMaximumSum(node.right(), max);

        max[0] = Math.max(max[0], left + right + Integer.parseInt(node.val().toString()));


        return Math.max(left, right) + Integer.parseInt(node.val().toString());
    }
}
