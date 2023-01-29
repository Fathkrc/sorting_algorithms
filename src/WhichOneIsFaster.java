
import BubleO.BubbleSort;
import InsertionSort.*;
import MergeSort.*;
import QuickSort.*;
import SelectionSort.*;
import ShellSort.*;

import java.util.Arrays;
import java.util.Random;

public class WhichOneIsFaster {
    public static void main(String[] args) {
        int[] siraliDizi= createOrderedArray(100000);
        int[] arr = createArray(100000);
        int[] arr2 = Arrays.copyOf(arr,arr.length);
        int[] arr3 = Arrays.copyOf(arr,arr.length);
        int[] arr4 = Arrays.copyOf(arr,arr.length);
        int[] arr5 = Arrays.copyOf(arr,arr.length);
        int[] arr6 = Arrays.copyOf(arr,arr.length);
        int[] arr7 = Arrays.copyOf(arr,arr.length);

        long startTime;
        long endTime;
        double estimatedTime;

        // InsertionSort
        startTime=System.currentTimeMillis();
        InsertionSort.insertionSort(arr);
        endTime=System.currentTimeMillis();
        estimatedTime= (double)(endTime-startTime) / 1000;
        System.out.println("InsertionSort = " + estimatedTime);

        // SelectionSort
        startTime=System.currentTimeMillis();
        SelectionSort.selectionSort(arr2);
        endTime=System.currentTimeMillis();
        estimatedTime= (double)(endTime-startTime) / 1000;
        System.out.println("SelectionSort = " + estimatedTime);

        //BubleSort
        startTime=System.currentTimeMillis();
        BubbleSort.bubbleSort(arr3);
        endTime=System.currentTimeMillis();
        estimatedTime= (double)(endTime-startTime) / 1000;
        System.out.println("BubbleSort = " + estimatedTime);

        // MergeSort
        startTime=System.currentTimeMillis();
        MergeSort.mergeSort(arr4,0,arr4.length-1);
        endTime=System.currentTimeMillis();
        estimatedTime= (double)(endTime-startTime) / 1000;
        System.out.println("MergeSort = " + estimatedTime);

        // QuickSort
        startTime=System.currentTimeMillis();
        QuickSort.quickSort(arr5,0,arr5.length-1);
        endTime=System.currentTimeMillis();
        estimatedTime= (double)(endTime-startTime) / 1000;
        System.out.println("QuickSort = " + estimatedTime);

        // ShellSort
        startTime=System.currentTimeMillis();
        ShellSort.shellSort(arr6);
        endTime=System.currentTimeMillis();
        estimatedTime= (double)(endTime-startTime) / 1000;
        System.out.println("ShellSort = " + estimatedTime);

        // Arrays.sort()
        startTime=System.currentTimeMillis();
        Arrays.sort(arr7);
        endTime=System.currentTimeMillis();
        estimatedTime= (double)(endTime-startTime) / 1000;
        System.out.println("Arrays.Sort = " + estimatedTime);





    }
    public static int[] createArray(int length) {
        int[] arr = new int[length];
        Random rm = new Random();
        for(int i=0;i<arr.length;i++) {
            arr[i]=rm.nextInt(10000);
        }
        return arr;
    }

    public static int[] createOrderedArray(int lentgh){
        int[] arr = new int[lentgh];
        for(int i =0 ; i<arr.length;i++) {
            arr[i]=i;
        }
        return arr;
    }
}
