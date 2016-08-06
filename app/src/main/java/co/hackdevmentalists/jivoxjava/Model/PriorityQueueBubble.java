package co.hackdevmentalists.jivoxjava.Model;

import co.hackdevmentalists.jivoxjava.Interfaces.PriorityQueueInterface;


public class PriorityQueueBubble extends BubbleSort implements PriorityQueueInterface {

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
        performSort(priorityArray) ;
    }

    @Override
    public int[] performSort(int[] inputArray) {
        int temp ;

        for(int i=0; i < arraySize; i++){
            for(int j=1; j < (arraySize-i); j++){

                if(inputArray[j-1] > inputArray[j]){
                    temp = inputArray[j-1];
                    inputArray[j-1] = inputArray[j];
                    inputArray[j] = temp;

                    /*data array sort*/
                    temp = dataArray[j-1];
                    dataArray[j-1] = dataArray[j];
                    dataArray[j] = temp;
                }

            }
        }
        return inputArray ;
    }

    @Override
    public void printPriorityQueue() {
        System.out.println();
        System.out.println();
        super.printSortedArray(dataArray);
        super.printSortedArray(priorityArray);
    }
}
