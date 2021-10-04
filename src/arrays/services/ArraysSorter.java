package arrays.services;

import arrays.exceptions.ArraysSorterException;

public interface ArraysSorter {
    int[] sortAscending(int[] arrayToSort) throws ArraysSorterException;
    int[] sortDescending(int[] arrayToSort) throws ArraysSorterException;

}
