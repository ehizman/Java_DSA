package test;

import linkedLists.LinkedList;
import linkedLists.Node;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    @Test
    void testFirstNodeAddedToListIsHead_WhenListIsCreatedWithoutAHeadNode(){
        LinkedList<Integer> list = new LinkedList<>();
        Node node = new Node(5);
        list.add(node);
        assertSame(node, list.getHead());
        assertEquals(5, list.getHead().getData());
    }
    @Test
    void testFirstNodeAddedToListIsTail_WhenListIsCreatedWithoutAHeadNode(){
        LinkedList<Integer> list = new LinkedList<>();
        Node node = new Node(5);
        list.add(node);
        assertSame(node, list.getTail());
        assertEquals(5, list.getTail().getData());

    }

    @Test
    void testThatWhenListIsCreatedWithANode_TheNodeIsTheHeadNode(){
        Node node = new Node(5);
        LinkedList<Integer> list = new LinkedList<>(node);
        assertSame(node, list.getHead());
        assertEquals(5, list.getHead().getData());
    }

    @Test
    void testThatWhenListIsCreatedWithANode_TheNodeIsTheTail(){
        Node node = new Node(5);
        LinkedList<Integer> list = new LinkedList<>(node);
        assertSame(node, list.getTail());
        assertEquals(5, list.getTail().getData());
    }
    @Test
    void testGetCountOfNodesInList(){
        Node node = new Node(5);
        LinkedList<Integer> list = new LinkedList<>(node);
        assertEquals(1, list.getCount());
    }
    @Test
    void canAddNodeWhenListIsNotEmpty(){
        Node node = new Node(34);
        LinkedList<Integer> list = new LinkedList<>(node);

        Node newNode = new Node(34);
        list.add(newNode);

        assertEquals(2, list.getCount());
    }
    @Test
    void testThatNewlyAddedNodeBecomesTail(){
        Node node = new Node(34);
        LinkedList<Integer> list = new LinkedList<>(node);

        Node newNode = new Node(34);
        list.add(newNode);

        assertSame(newNode, list.getTail());
    }
    @Test
    void canAddNodeWhenListIsNotEmptyWhenListIsCreatedWithoutNode(){
        LinkedList<Integer> list = new LinkedList<>();
        Node node = new Node(34);
        list.add(node);

        Node newNode = new Node(34);
        list.add(newNode);

        assertEquals(2, list.getCount());
    }
    @Test
    void testThatNewlyAddedNodeBecomesTailWhenListIsCreatedWithoutNode(){
        LinkedList<Integer> list = new LinkedList<>();
        Node node = new Node(34);
        list.add(node);

        Node newNode = new Node(34);
        list.add(newNode);

        assertSame(newNode, list.getTail());
    }

    @Test
    void testThatEachNodeHasNextNode(){
        LinkedList<Integer> list = new LinkedList<>();
        Node node = new Node(56);
        list.add(node);

        Node newNode = new Node(45);
        list.add(newNode);

        assertSame(newNode, list.getHead().getNextNode());
    }
}

