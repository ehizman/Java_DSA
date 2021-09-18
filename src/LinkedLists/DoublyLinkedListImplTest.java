package LinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListImplTest {

    @Test
    void isEmpty() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedListImpl<>();
        assertTrue(doublyLinkedList.isEmpty());
    }

    @Test
    void getHeadNodeWhenLinkedListIsEmpty() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedListImpl<>();
        doublyLinkedList.insertAtHead(10);
        assertNotNull(doublyLinkedList.getHeadNode());
        assertEquals(1, doublyLinkedList.getSize());
        assertEquals(10, doublyLinkedList.getHeadNode().getData());
    }

    @Test
    void testCanInsertAtHeadWhenHeadNodeIsNotNull() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedListImpl<>();
        doublyLinkedList.insertAtHead(10);
        doublyLinkedList.insertAtHead(5);
        assertEquals(5, doublyLinkedList.getHeadNode().getData());
        assertEquals(10, doublyLinkedList.getHeadNode().getNextNode().getData());
        assertEquals(2, doublyLinkedList.getSize());
    }

    @Test
    void getTailNodeWhenLinkedListIsEmptyAndANewNodeIsAdded() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedListImpl<>();
        doublyLinkedList.insertAtHead(10);
        assertEquals(10, doublyLinkedList.getTailNode().getData());
        assertNull(doublyLinkedList.getTailNode().getNextNode());
    }

    @Test
    void getSize() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedListImpl<>();
        doublyLinkedList.insertAtHead(10);
        assertEquals(1, doublyLinkedList.getSize());
    }

    @Test
    void insertAtHead() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedListImpl<>();
        doublyLinkedList.insertAtHead(10);
        doublyLinkedList.insertAtHead(20);
        assertEquals(20, doublyLinkedList.getHeadNode().getData());
        assertNull(doublyLinkedList.getHeadNode().getPrevNode());
        assertEquals(10, doublyLinkedList.getHeadNode().getNextNode().getData());
    }

    @Test
    void insertAtTail() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedListImpl<>();
        doublyLinkedList.insertAtTail(10);
        doublyLinkedList.insertAtHead(20);
        assertEquals(10, doublyLinkedList.getTailNode().getData());
    }

    @Test
    void printList() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedListImpl<>();
        doublyLinkedList.insertAtHead(10);
        doublyLinkedList.insertAtTail(5);
        doublyLinkedList.insertAtTail(5);
        doublyLinkedList.insertAtHead(25);
        assertEquals("25<->10<->5<->5", doublyLinkedList.printList());
    }

    @Test
    void printListReversed() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedListImpl<>();
        doublyLinkedList.insertAtHead(10);
        doublyLinkedList.insertAtTail(5);
        doublyLinkedList.insertAtTail(5);
        doublyLinkedList.insertAtHead(25);
        assertEquals("5<->5<->10<->25", doublyLinkedList.printListReversed());
    }

    @Test
    void deleteAtHead() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedListImpl<>();
        doublyLinkedList.insertAtHead(10);
        doublyLinkedList.insertAtTail(5);
        doublyLinkedList.insertAtTail(5);
        doublyLinkedList.insertAtHead(25);
        doublyLinkedList.deleteAtHead();
        assertEquals(3, doublyLinkedList.getSize());
        assertEquals(10, doublyLinkedList.getHeadNode().getData());
    }

    @Test
    void deleteAtTail() {
        DoublyLinkedList<Integer> doublyLinkedList = new DoublyLinkedListImpl<>();
        doublyLinkedList.insertAtHead(10);
        doublyLinkedList.insertAtTail(5);
        doublyLinkedList.insertAtTail(25);
        doublyLinkedList.insertAtHead(25);
        doublyLinkedList.deleteAtTail();
        assertEquals(3, doublyLinkedList.getSize());
        assertEquals(5, doublyLinkedList.getTailNode().getData());
    }
}