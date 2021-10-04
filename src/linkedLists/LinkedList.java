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


    public boolean remove(T dataToRemove) {
        Node current = head;
        Node previous = null;

        while (current != null){
           if (current.getData() == (Integer)dataToRemove){
               if (previous != null){
                   previous.setNextNode(current.getNextNode());
               }
               else{
                   head = current.getNextNode();
               }
               if (head == null){
                   tail = null;
               }
               if (current.getNextNode() == null){
                   tail = previous;
               }
               count--;
               return true;
           }
           else{
               previous = current;
               current = current.getNextNode();
           }
        }
        return false;
    }


    public boolean contains(T dataToSearchFor) {
        Node currentNode = head;

        while(currentNode != null){
            if (currentNode.getData() == (Integer) dataToSearchFor){
                return true;
            }
            else{
                currentNode = currentNode.getNextNode();
            }
        }
        return false;
    }

    public void clear() {
        head = null;
        tail = null;
        count = 0;
    }
}
