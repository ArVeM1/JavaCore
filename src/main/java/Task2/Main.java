package Task2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String args[]) {
        int[] arr = new int[] {5,6,3,2,5,1,4,9};
        selectedSort(arr);
        bubbleSort(arr);
        QuickSort(arr, 0, arr.length-1);
    }

    public static int[] bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }
        printArray(arr, "bubbleSort");
        return arr;
    }

    public static int[] selectedSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[indexMin]) {
                    indexMin = j;
                }

            }
            int tmp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = tmp;
        }
        printArray(arr, "selectedSort");
         return arr;
    }

    public static void QuickSort(int[] arr, int start, int end) {
        if(start >= end) {
            return;
        }
        int key = arr[start];
        int i = start;
        int j = end;
        while(i < j){
            while(arr[j] >= key && i < j){
                j--;
            }
            while(arr[i] <= key && i < j){
                i++;
            }
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        arr[start]=arr[i];
        arr[i]=key;
        QuickSort(arr,start,i-1);
        QuickSort(arr,i+1,end);
    }

    public static void printArray(int[] arr, String name) {
        System.out.println(name);
        for (int el : arr) {
            System.out.print(el + " ");
        }
        System.out.println();
    }
}
