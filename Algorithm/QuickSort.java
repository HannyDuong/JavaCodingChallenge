/* 
Reference: https://www.geeksforgeeks.org/quick-sort/
Sorting an array using QuickSort algorithm
The method takes an array, the lowest index and the highest index of the array as input
Approach:
1. The array has at leat 1 element
2. Find the pivot by partition the array
3. Recursively call the qsort method to sort the arrays that are less than the pivot and greater than the pivot
    * Partition the array
        * Pick the last element as the pivot
        * If the current element less than the pivot, 
        * swap the current element with the predecessor element
        * swap the pivot with the first element that is greater than pivot, that is i + 1


 */

package Algorithm;
import java.util.Arrays;

public class QuickSort {
    public static void qsort(int[]arr, int low, int high){
        //array has at least one element
        if(low < high){
            int piv = partition(arr, low, high);
            qsort(arr, low, piv - 1);         
            qsort(arr, piv + 1, high);
        }
    }
    private static int partition(int[] arr, int low, int high){
        //pick the last element as pivot
        int pivot = arr[high];
        int i = low -1;
        for(int j = low; j < arr.length; j++){
            if(arr[j] < pivot){
                i++;
                swap(arr,i, j);
            }
        }
        //swap the pivot with the first element that is greater than pivot(i+1)
        swap(arr,i+1, high);
        return i+1;

    }
    private static void swap(int[]arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args){
        int[]arr = {4, 8, 30, 1, 6};
        qsort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}



