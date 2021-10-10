package arrays;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        Integer[] array = {5, -1, 4, 6, -30};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }

    private static void heapSort(Integer[] array) {
        Heap<Integer> heap = new Heap<>(array);
        for (int i = array.length-1; i >=0; i--) {
            array[i] = heap.removeRootFromHeap();
        }
    }
}
