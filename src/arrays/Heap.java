package arrays;

import java.util.ArrayList;

public class Heap<T extends Comparable<T>> {
    private ArrayList<T> list = new ArrayList<>();
    public Heap(){

    }
    public Heap(T[] collection){
        for (T element: collection) {
            addToHeap(element);
        }
    }

    public void addToHeap(T element) {
        list.add(element);
        int currentIndex = list.size()-1;

        while(currentIndex > 0){
            int parentIndex = (currentIndex-1)/2;
            if(element.compareTo(list.get((currentIndex-1)/2)) > 0){
                T temp = list.get(parentIndex);
                list.set(parentIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
            }
            else{
                break;
            }
            currentIndex = parentIndex;
        }
    }

    public T removeRootFromHeap(){
        if (list.isEmpty()){
            return null;
        }

        T removedElement = list.get(0);
        list.set(0, list.get(list.size()-1));
        list.remove(removedElement);

        int currentIndex = 0;
        while(currentIndex < list.size()){
            int leftChildIndex = 2 * currentIndex + 1;
            int rightChildIndex = 2 * currentIndex + 2;

            if (leftChildIndex >= list.size()){
                break;
            }
            int maxIndex = leftChildIndex;
            if (rightChildIndex < list.size()){
                if (list.get(maxIndex).compareTo(list.get(rightChildIndex)) < 0){
                    maxIndex = rightChildIndex;
                }
            }

            if (list.get(currentIndex).compareTo(list.get(maxIndex)) < 0){
                T temp = list.get(maxIndex);
                list.set(maxIndex, list.get(currentIndex));
                list.set(currentIndex, temp);
                currentIndex = maxIndex;
            }
            else{
                break;
            }
        }
        return removedElement;
    }

    public int getNumberOfNodesInTree(){
        return list.size();
    }

    public ArrayList<T> getList() {
        return list;
    }
}
