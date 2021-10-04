//package Graphs;
//
//import LinkedLists.DoublyLinkedListImpl;
//
//public class GraphImpl implements Graph{
//    final int vertices;
//    DoublyLinkedListImpl<Integer>[] adjacencyList;
//
//    public GraphImpl(int vertices){
//        this.vertices = vertices;
//        this.adjacencyList = new DoublyLinkedListImpl[vertices];
//        for (int i = 0; i < vertices; i++) {
//            adjacencyList[i] = new DoublyLinkedListImpl<>();
//        }
//    }
//
//    @Override
//    public void printGraph() {
//
//    }
//
//    @Override
//    public void addEdge(int source, int destination) {
//        if (source < vertices && destination < vertices){
//            adjacencyList[source].insertAtTail(destination);
//            // the line below is needed for the implementation of a bidirectional graph
//            adjacencyList[destination].insertAtTail(source);
//        }
//    }
//
//    public int getVertices() {
//        return vertices;
//    }
//
//    public DoublyLinkedListImpl<Integer>[] getAdjacencyList() {
//        return adjacencyList;
//    }
//}
