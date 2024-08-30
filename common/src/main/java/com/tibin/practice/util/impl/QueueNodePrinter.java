package com.tibin.practice.util.impl;

import com.tibin.practice.datastructure.Node;
import com.tibin.practice.datastructure.QueueNode;
import com.tibin.practice.util.Printer;

public class QueueNodePrinter implements Printer<QueueNode> {

    @Override
    public void print(QueueNode queue) {
        Node node =  queue.peek();

        StringBuffer stringBuffer = new StringBuffer();
        while(node != null) {
            stringBuffer.append(node.val()).append(" <-> ");
            node = node.right();
        }
        System.out.println(stringBuffer);
    }
}
