package com.tibin.practice;

import com.tibin.practice.datastructure.Node;
import com.tibin.practice.util.Printer;
import com.tibin.practice.util.impl.TreePrinter;

public class SameBinaryTree {


    public static void main(String[] args) {
        Node<Integer> p = new Node<>(1);
        Node<Integer> p_left_root = new Node<>(2);
        Node<Integer> p_right_root = new Node<>(3);
        p.left(p_left_root);
        p.right(p_right_root);
        p_right_root.left(new Node(5));
        p_right_root.right(new Node<>(6));

        Printer printer = new TreePrinter();
        printer.print(p);

        Node<Integer> q = new Node<>(1);
        Node<Integer> q_left_root = new Node<>(2);
        Node<Integer> q_right_root = new Node<>(3);
        Node<Integer> right_right = new Node<>(6);
        q.left(q_left_root);
        q.right(q_right_root);
        q_right_root.left(new Node(5));
        q_right_root.right(right_right);
        right_right.right(new Node(8));

        printer.print(q);

        System.out.println("is tree same " + isSameBinaryTree(p, q));



    }

    public static boolean isSameBinaryTree(Node p, Node q) {

        if (p == null && q == null) {
            return true;
        }

        if (p == null || q == null) {
            return false;
        }

        return (p.val() == q.val()) &&
                isSameBinaryTree(p.left(), q.left()) &&
                isSameBinaryTree(p.right(), q.right());
    }



    public static boolean isSameBinaryTree1(Node p, Node q) {
        if (p != null && q != null) {
            if (p.val() != q.val()) {
                return false;
            }
            boolean isLeftSame = isSameBinaryTree(p.left(), q.left());
            boolean isRightSame = isSameBinaryTree(p.right(), q.right());
            return isLeftSame && isRightSame;
        } else {
            return true;
        }
    }
}
