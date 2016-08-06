package co.hackdevmentalists.jivoxjava.Testing;


import co.hackdevmentalists.jivoxjava.Model.BubbleSort;
import co.hackdevmentalists.jivoxjava.Model.HeapSort;

/**
* Interface for Sorting Algorithm
Define a generic interface for a sorting algorithm.
Then implement the heap-sort algorithm and another in-place sorting algorithm of your choice as specific
instances of that interface. Design and implement a priority-queue data structure based on the sorting
interface above. Design a test to compare the performance of the priority-queue for the two sorting algorithms
you have implemented.

* */

public class TestClass {


    public static void main(String args[]){

        HeapSort heapSortInstance = new HeapSort();
        BubbleSort bubbleSortInstance = new BubbleSort() ;

        int[] testArray = {9, 11, 5, 6, 7, 8} ;
        int[] returnArrays ;

        returnArrays = heapSortInstance.putInput(testArray) ;
        returnArrays = heapSortInstance.performSort(testArray);
        heapSortInstance.printSortedArray(returnArrays);

        returnArrays = bubbleSortInstance.putInput(testArray) ;
        bubbleSortInstance.performSort(returnArrays);
        bubbleSortInstance.printSortedArray(returnArrays);

    }

}
