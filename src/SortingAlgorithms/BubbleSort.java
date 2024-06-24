package SortingAlgorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={-55, 702, 3817641, -353};
        System.out.println(Arrays.toString(bubbleSort(arr)));
    }
    public static int[] bubbleSort(int[] arr){
        for (int i=0; i< arr.length; i++){
            int n= arr.length;
            for (int j=0; j<n-1; j++){
                if (arr[j]>arr[j+1]){
                    swap(arr, j, j+1);
                }
            }
            n--;
        }
        return arr;
    }
    public static void swap(int[] arr, int first, int second){
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
}
