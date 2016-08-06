package co.hackdevmentalists.jivoxjava.Model;


import co.hackdevmentalists.jivoxjava.Interfaces.PriorityQueueInterface;

public class PriorityQueueHeap extends HeapSort implements PriorityQueueInterface{

    int[] dataArray ;
    int[] priorityArray;
    int arraySize ;

    @Override
    public void inputPriorityValues(int[] inputArray, int[] priorityArray) {
        this.priorityArray = new int[priorityArray.length] ;
        this.priorityArray = priorityArray ;
        arraySize = this.priorityArray.length ;

        dataArray = super.putInput(inputArray);
    }

    @Override
    public void sortByPriority() {

        super.performSort(priorityArray) ;

    }

    @Override
    public void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;

        /*Sorting the priority Array*/

    }

    @Override
    public void printPriorityQueue() {
        super.printSortedArray(dataArray);
        System.out.println();
        super.printSortedArray(priorityArray);
    }
}
