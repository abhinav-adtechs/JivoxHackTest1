package co.hackdevmentalists.jivoxjava.Testing;


import co.hackdevmentalists.jivoxjava.Model.BubbleSort;
import co.hackdevmentalists.jivoxjava.Model.HeapSort;
import co.hackdevmentalists.jivoxjava.Model.PriorityQueueBubble;
import co.hackdevmentalists.jivoxjava.Model.PriorityQueueHeap;

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
        PriorityQueueHeap priorityQueueHeapInstance = new PriorityQueueHeap() ;
        PriorityQueueBubble priorityQueueBubbleInstance = new PriorityQueueBubble() ;

        int[] testArray = {9, 11, 5, 6, 7, 8} ;
        int[] priorityTestArray = {2, 5, 1, 3, 6, 4} ;
        int[] returnArrays ;

        returnArrays = heapSortInstance.putInput(testArray) ;
        returnArrays = heapSortInstance.performSort(returnArrays);
        heapSortInstance.printSortedArray(returnArrays);

        returnArrays = bubbleSortInstance.putInput(testArray) ;
        bubbleSortInstance.performSort(returnArrays);
        bubbleSortInstance.printSortedArray(returnArrays);

        priorityQueueHeapInstance.inputPriorityValues(testArray, priorityTestArray);
        priorityQueueHeapInstance.sortByPriority();
        priorityQueueHeapInstance.printPriorityQueue();

        priorityQueueBubbleInstance.inputPriorityValues(testArray, priorityTestArray);
        priorityQueueBubbleInstance.sortByPriority();
        priorityQueueBubbleInstance.printPriorityQueue();

    }

}
