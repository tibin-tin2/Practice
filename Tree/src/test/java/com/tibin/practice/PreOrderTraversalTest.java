package com.tibin.practice;

import com.tibin.practice.datastructure.Node;
import com.tibin.practice.util.Printer;
import com.tibin.practice.util.impl.TreePrinter;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PreOrderTraversalTest {

    @Test
    public void testPreOrder() {
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

        root.left(l1_a);
        root.right(l1_b);

        l1_a.left(l2_a);
        l1_a.right(l2_b);

        l1_b.left(l2_c);
        l1_b.right(l2_d);

        l2_a.left(l3_a);

        l2_c.right(l3_b);

        l2_d.left(l3_c);

        Printer printer = new TreePrinter();
        printer.print(root);


        PreOrderTraversal.preOrder(root);

        List<Integer> expectedResult = Arrays.asList(1, 2, 4, 8, 5, 3, 6, 9, 7, 10);

        assertEquals(expectedResult, PreOrderTraversal.preOrderList);

    }


}