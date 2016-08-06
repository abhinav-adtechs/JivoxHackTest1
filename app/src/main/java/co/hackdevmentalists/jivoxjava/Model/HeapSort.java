package co.hackdevmentalists.jivoxjava.Model;


import co.hackdevmentalists.jivoxjava.Interfaces.SortingInterface;

public class HeapSort implements SortingInterface {

    private int[] updatedArray ;
    private static int N ;

    @Override
    public void putInput(int[] inputArray) {
        updatedArray = new int[inputArray.length] ;
        updatedArray = inputArray ;
        N = updatedArray.length ;
    }

    @Override
    public void performSort() {
        heapify(updatedArray);
        for (int i = N; i > 0; i--)
        {
            swap(updatedArray,0, i);
            N = N-1;
            maxHeap(updatedArray, 0);
        }
    }

    private static void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxHeap(arr, i);
    }

    private static void maxHeap(int arr[], int i)
    {
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])
            max = right;

        if (max != i)
        {
            swap(arr, i, max);
            maxHeap(arr, max);
        }
    }

    private static void swap(int arr[], int i, int j){
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    @Override
    public void printSortedArray() {
        for (int anUpdatedArray : updatedArray) {
            System.out.print(anUpdatedArray + " ");
        }
        System.out.println();
    }
}
