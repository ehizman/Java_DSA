package arrays;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HeapTest<T extends Comparable<T>> {
    private Heap<T> heap;
    @BeforeEach
    void setUp() {
        heap = new Heap<>();
    }

    @AfterEach
    void tearDown() {
        heap = null;
    }

    @Test
    @SuppressWarnings("unchecked")
    void addToHeap() {
        Integer[] array = {5, 3, -1, 20, 18};
        for (Integer element: array) {
            heap.addToHeap((T) element);
        }
        assertAll(
                () -> assertEquals(20, heap.getList().get(0)),
                () -> assertEquals(18, heap.getList().get(1)),
                () -> assertEquals(-1, heap.getList().get(2)),
                () -> assertEquals(3, heap.getList().get(3)),
                () -> assertEquals(5, heap.getList().get(4))
        );
        heap.addToHeap((T)Integer.valueOf(30));
        assertAll(
                () -> assertEquals(30, heap.getList().get(0)),
                () -> assertEquals(18, heap.getList().get(1)),
                () -> assertEquals(20, heap.getList().get(2)),
                () -> assertEquals(3, heap.getList().get(3)),
                () -> assertEquals(5, heap.getList().get(4)),
                () -> assertEquals(-1, heap.getList().get(5))
        );
    }

    @Test
    @SuppressWarnings("unchecked")
    void removeRootFromHeap() {
        Integer[] array = {5, 3, -1, 20, 18};
        for (Integer element: array) {
            heap.addToHeap((T) element);
        }
        heap.addToHeap((T)Integer.valueOf(30));
        heap.removeRootFromHeap();
        assertAll(
                () -> assertEquals(20, heap.getList().get(0)),
                () -> assertEquals(18, heap.getList().get(1)),
                () -> assertEquals(-1, heap.getList().get(2)),
                () -> assertEquals(3, heap.getList().get(3)),
                () -> assertEquals(5, heap.getList().get(4))
        );
    }

    @Test
    void getNumberOfNodesInTree() {
        assertEquals(0, heap.getList().size());
    }

    @Test
    void getList() {
        assertNotNull(heap.getList());
    }
}