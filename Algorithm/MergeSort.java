package Algorithm;

import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int [] arr, int len){
        if(arr.length < 2) return;
        int mid = len /2 ;
        int [] leftArr = new int[mid];
        int [] rightArr = new int[len - mid];

        for(int i = 0; i < mid; i++){
            leftArr[i] = arr[i];
        }

        for(int i = mid; i < len ; i++){
            rightArr[i - mid] = arr[i];
        }

        mergeSort(leftArr, mid);
        mergeSort(rightArr, len - mid);

        mergeArr(arr, leftArr, rightArr, mid, len - mid);

    }

    public static void mergeArr(int[] arr, int [] left, int [] right, int leftSize, int rightSize){
        int i = 0 , j = 0 , k = 0;
        while(i < leftSize && j < rightSize){
            if(left[i] < right[j]){
                arr[k++] = left[i++];
            }
            else{
                arr[k++] = right[j++];
            }
        }
        while(i < leftSize){
            arr[k++] = left[i++];

        }
        while(j < rightSize){
            arr[k++] = right[j++];
        }



    }
    public static void main(String[] args) {
        int [] arr = {6, 2, 9, 3, 1, 8};
        mergeSort(arr, arr.length );
        System.out.println(Arrays.toString(arr));
        
    }
}
