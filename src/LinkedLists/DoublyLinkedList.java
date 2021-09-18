package LinkedLists;

public interface DoublyLinkedList<T> {
    boolean isEmpty();
    Node<T> getHeadNode();
    Node<T> getTailNode();
    int getSize();
    void insertAtHead(T data);
    void insertAtTail(T data);
    String printList();
    String printListReversed();
    void deleteAtHead();
    void deleteAtTail();
}
