package co.hackdevmentalists.jivoxjava.Model;


import co.hackdevmentalists.jivoxjava.Interfaces.PriorityQueueInterface;

public class PriorityQueueHeap extends HeapSort implements PriorityQueueInterface{

    private int[] dataArray ;
    private int[] priorityArray;
    private int arraySize ;

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

        /*Sorting the data Array*/
        tmp = dataArray[i];
        dataArray[i] = dataArray[j];
        dataArray[j] = tmp;

    }

    @Override
    public void printPriorityQueue() {
        System.out.println();
        System.out.println();
        super.printSortedArray(dataArray);
        super.printSortedArray(priorityArray);
    }
}
