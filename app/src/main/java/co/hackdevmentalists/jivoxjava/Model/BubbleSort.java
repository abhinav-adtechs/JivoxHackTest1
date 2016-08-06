package co.hackdevmentalists.jivoxjava.Model;


import co.hackdevmentalists.jivoxjava.Interfaces.SortingInterface;

public class BubbleSort implements SortingInterface {

    private int[] updatedArray ;
    private static int N ;

    @Override
    public int[] putInput(int[] inputArray) {
        updatedArray = new int[inputArray.length] ;
        updatedArray = inputArray ;
        N = updatedArray.length ;
        return updatedArray ;
    }

    @Override
    public int[] performSort(int[] inputArray) {
        int temp ;

        for(int i=0; i < N; i++){
            for(int j=1; j < (N-i); j++){

                if(inputArray[j-1] > inputArray[j]){
                    temp = inputArray[j-1];
                    inputArray[j-1] = inputArray[j];
                    inputArray[j] = temp;
                }

            }
        }
        return inputArray ;
    }

    @Override
    public void printSortedArray(int[] printArray) {
        for (int anUpdatedArray : printArray) {
            System.out.print(anUpdatedArray + " ");
        }
        System.out.println();
    }
}
