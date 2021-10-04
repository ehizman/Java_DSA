package test;

import linkedLists.LinkedList;
import linkedLists.Node;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {
    private LinkedList<Integer> list;
    @BeforeEach
    void setUp(){
      list = new LinkedList<>();
    }

    @Test
    void testFirstNodeAddedToListIsHead_WhenListIsCreatedWithoutAHeadNode(){
        Node node = new Node(5);
        list.add(node);
        assertSame(node, list.getHead());
        assertEquals(5, list.getHead().getData());
    }
    @Test
    void testFirstNodeAddedToListIsTail_WhenListIsCreatedWithoutAHeadNode(){
        Node node = new Node(5);
        list.add(node);
        assertSame(node, list.getTail());
        assertEquals(5, list.getTail().getData());

    }

    @Test
    void testThatWhenListIsCreatedWithANode_TheNodeIsTheHeadNode(){
        Node node = new Node(5);
        list = new LinkedList<>(node);
        assertSame(node, list.getHead());
        assertEquals(5, list.getHead().getData());
    }

    @Test
    void testThatWhenListIsCreatedWithANode_TheNodeIsTheTail(){
        Node node = new Node(5);
        list = new LinkedList<>(node);
        assertSame(node, list.getTail());
        assertEquals(5, list.getTail().getData());
    }
    @Test
    void testGetCountOfNodesInList(){
        Node node = new Node(5);
        list = new LinkedList<>(node);
        assertEquals(1, list.getCount());
    }
    @Test
    void canAddNodeWhenListIsNotEmpty(){
        Node node = new Node(34);
        list = new LinkedList<>(node);

        Node newNode = new Node(34);
        list.add(newNode);

        assertEquals(2, list.getCount());
    }
    @Test
    void testThatNewlyAddedNodeBecomesTail(){
        Node node = new Node(34);
        list = new LinkedList<>(node);

        Node newNode = new Node(34);
        list.add(newNode);

        assertSame(newNode, list.getTail());
    }
    @Test
    void canAddNodeWhenListIsNotEmptyWhenListIsCreatedWithoutNode(){
        Node node = new Node(34);
        list.add(node);

        Node newNode = new Node(34);
        list.add(newNode);

        assertEquals(2, list.getCount());
    }
    @Test
    void testThatNewlyAddedNodeBecomesTailWhenListIsCreatedWithoutNode(){
        Node node = new Node(34);
        list.add(node);

        Node newNode = new Node(34);
        list.add(newNode);

        assertSame(newNode, list.getTail());
    }

    @Test
    void testThatEachNodeHasNextNode(){
        Node node = new Node(56);
        list.add(node);

        Node newNode = new Node(45);
        list.add(newNode);

        assertSame(newNode, list.getHead().getNextNode());
    }

    @Test
    void testCanRemoveFromList_WhenNodeToRemoveIsInMiddleOfList(){
        Node firstNode = new Node(67);
        list.add(firstNode);

        Node secondNode = new Node(78);
        list.add(secondNode);

        Node thirdNode = new Node(56);
        list.add(thirdNode);

        Node fourthNode = new Node(23);
        list.add(fourthNode);

        assertTrue(list.remove(56));
    }

    @Test
    void testCanRemoveFromList_WhenNodeToRemoveIsAtTheHeadOfList(){
        Node firstNode = new Node(67);
        list.add(firstNode);

        Node secondNode = new Node(78);
        list.add(secondNode);

        Node thirdNode = new Node(56);
        list.add(thirdNode);

        Node fourthNode = new Node(23);
        list.add(fourthNode);

        assertTrue(list.remove(67));
        assertEquals(78, list.getHead().getData());
    }

    @Test
    void testCanRemoveFromList_WhenThereIsASingleNodeOnList(){
        Node firstNode = new Node(78);
        list.add(firstNode);
        assertTrue(list.remove(78));
        assertNull(list.getHead());
        assertNull(list.getTail());
        assertEquals(0, list.getCount());
    }

    @Test
    void test_CanRemoveFromListIfNodeToRemoveIsAtTail(){
        Node firstNode = new Node(67);
        list.add(firstNode);

        Node secondNode = new Node(78);
        list.add(secondNode);

        Node thirdNode = new Node(56);
        list.add(thirdNode);

        Node fourthNode = new Node(23);
        list.add(fourthNode);

        assertTrue(list.remove(23));
        assertSame(list.getTail(), thirdNode);
    }

    @Test
    void returnsFalseWhenListIsEmpty(){
        assertFalse(list.remove(23));
    }

    @Test
    void returnsFalseWhenNodeToRemoveCannotBeFound(){
        Node firstNode = new Node(67);
        list.add(firstNode);

        Node secondNode = new Node(78);
        list.add(secondNode);

        Node thirdNode = new Node(56);
        list.add(thirdNode);

        Node fourthNode = new Node(23);
        list.add(fourthNode);
        assertFalse(list.remove(12));
    }

    @Test
    void test_ThatReturnTrueWhenListContainsNodeWithDataBeingSearchedFor(){
        Node firstNode = new Node(86);
        list.add(firstNode);

        Node secondNode = new Node(5);
        list.add(secondNode);

        Node thirdNode = new Node(90);
        list.add(thirdNode);

        assertTrue(list.contains(86));
    }

    @Test
    void test_ThatReturnsFalseWhenListDoesNotContainNodeWithDataToSearchFor(){
        Node firstNode = new Node(86);
        list.add(firstNode);

        Node secondNode = new Node(5);
        list.add(secondNode);

        Node thirdNode = new Node(90);
        list.add(thirdNode);

        assertFalse(list.contains(12));
    }

    @Test
    void canClearLinkedList(){
        Node firstNode = new Node(86);
        list.add(firstNode);

        Node secondNode = new Node(5);
        list.add(secondNode);

        Node thirdNode = new Node(90);
        list.add(thirdNode);

        list.clear();

        assertNull(list.getHead());
        assertNull(list.getTail());
        assertEquals(0, list.getCount());
    }

    @Test
    void canCopyLinkedListToArray(){
        Node firstNode = new Node(86);
        list.add(firstNode);

        Node secondNode = new Node(5);
        list.add(secondNode);

        Node thirdNode = new Node(90);
        list.add(thirdNode);
        int[] array = new int[3];
        list.copyTo(array, 0);
        assertEquals(86, array[0]);
        assertEquals(5, array[1]);
        assertEquals(90, array[2]);
    }
}

