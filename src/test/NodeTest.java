package test;

import linkedLists.Node;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NodeTest {
    @Test
    void nodeHasDataOnCreation(){
        Node node = new Node(5);
        assertNotNull(node);
        assertEquals(5, node.getData());
    }
    @Test
    void nodeHasNext(){
        Node node = new Node(5);
        Node nextNode = new Node(3);

        node.setNextNode(nextNode);
        assertSame(nextNode, node.getNextNode());
    }

    @Test
    void traverseNode(){
        Node firstNode = new Node(34);
        Node secondNode = new Node(45);
        Node thirdNode = new Node(33);

        firstNode.setNextNode(secondNode);
        secondNode.setNextNode(thirdNode);

        Node node = firstNode;
        while (node != null){
            System.out.print(node.getData() + " ----> ");
            node = node.getNextNode();
        }
        System.out.println("null");
    }
}