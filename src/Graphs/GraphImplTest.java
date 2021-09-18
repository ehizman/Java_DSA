package Graphs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphImplTest {

    @Test
    void printGraph() {

    }

    @Test
    void addEdge() {
        GraphImpl graph = new GraphImpl(10);
        graph.addEdge(5,4);
        assertEquals(4, graph.getAdjacencyList()[5].getHeadNode().getData());
        assertEquals(5, graph.getAdjacencyList()[4].getHeadNode().getData());
    }
}