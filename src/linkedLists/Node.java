package linkedLists;

public class Node {
    private int data;
    private Node nextNode;
    public Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Node getNextNode() {
        return nextNode;
    }
}
