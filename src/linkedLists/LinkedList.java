package linkedLists;


public class LinkedList<T>{
    private Node head;
    private Node tail;
    private int count;

    public LinkedList(Node node){
        this.head = node;
        this.tail = node;
        count++;
    }

    public LinkedList(){
    }

    public void add(Node node) {
        if (head == null){
            head = node;
        }
        else{
            tail.setNextNode(node);
        }
        tail = node;
        count++;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }

    public int getCount() {
        return count;
    }
}
