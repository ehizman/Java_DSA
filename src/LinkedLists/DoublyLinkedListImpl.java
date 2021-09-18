package LinkedLists;

public class DoublyLinkedListImpl<Integer> implements DoublyLinkedList<Integer>{
    private Node<Integer> headNode;
    private Node<Integer> tailNode;
    private int size;

    public DoublyLinkedListImpl(){
        this.headNode = null;
        this.tailNode = null;
    }

    public boolean isEmpty(){
        return (headNode == null) && (tailNode == null);
    }

    @Override
    public Node<Integer> getHeadNode() {
        return headNode;
    }

    @Override
    public Node<Integer> getTailNode() {
        return tailNode;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public void insertAtHead(Integer data) {
        Node<Integer> newNode = new Node<>(data);
        newNode.setNextNode(this.headNode);
        newNode.setPrevNode(null);
        if (headNode != null){
            headNode.setPrevNode(newNode);
        }
        else {
            this.tailNode = newNode;
        }
        this.headNode = newNode;
        size++;
    }

    @Override
    public void insertAtTail(Integer data) {
        if (tailNode == null){
            insertAtHead(data);
            return;
        }
        Node<Integer> newNode = new Node<>(data);
        newNode.setPrevNode(tailNode);
        tailNode.setNextNode(newNode);
        newNode.setNextNode(null);
        this.tailNode = newNode;
        size++;
    }

    @Override
    public String printList() {
        Node<Integer> temp = headNode;
        StringBuilder stringBuilder = new StringBuilder();
        if (isEmpty()){
            return null;
        }
        while (temp.getNextNode() != null){
            stringBuilder.append(temp.getData()).append("<->");
            temp = temp.getNextNode();
        }
        stringBuilder.append(temp.getData());
        return stringBuilder.toString();
    }

    @Override
    public String printListReversed() {
        if (isEmpty()){
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        Node<Integer> temp = tailNode;
        while(temp.getPrevNode() != null){
            stringBuilder.append(temp.getPrevNode().getData()).append("<->");
            temp = temp.getPrevNode();
        }
        stringBuilder.append(temp.getData());
        return stringBuilder.toString();
    }

    public void deleteAtHead() {
        if (isEmpty()){
            return;
        }
        headNode = headNode.getNextNode();
        if (headNode == null){
            tailNode = null;
        }
        else{
            headNode.setPrevNode(null);
        }
        size--;
    }

    @Override
    public void deleteAtTail() {
        if(isEmpty()){
            return;
        }
        tailNode = tailNode.getPrevNode();
        if (tailNode == null){
            headNode = null;
        }
        else{
            tailNode.setNextNode(null);
        }
        size--;
    }
}
