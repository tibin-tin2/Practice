package com.tibin.practice;

import com.tibin.practice.datastructure.Node;
import com.tibin.practice.util.Printer;
import com.tibin.practice.util.impl.TreePrinter;

import java.util.ArrayList;
import java.util.List;

public class InOrderTraversal {

    private static List<Integer> inOrderList = new ArrayList<>();

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

//        l2_a.left(l3_a);
//        l2_a.right(l3_b);

//        l2_b.left(l3_c);
//        l2_b.right(l3_d);

        Printer printer = new TreePrinter();
        printer.print(root);

        inOrder(root);

        System.out.println(inOrderList);
    }

    private static void inOrder(Node<Integer> node) {
        if (node.left() == null) {
            inOrderList.add(node.val());
            return;
        }
        inOrder(node.left());
        inOrderList.add(node.val());
        inOrder(node.right());
    }
}
