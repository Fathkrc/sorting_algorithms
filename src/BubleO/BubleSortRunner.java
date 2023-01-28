package BubleO;

import java.util.Arrays;

public class BubleSortRunner {

    public static void main(String[] args) {

        int[] arr ={3,1,4,3,2};
        System.out.println("BubbleSort işlemi öncesi array :");
        System.out.println(Arrays.toString(arr));
        System.out.println("************************");
        System.out.println("BubbleSort işlemi sonrası : ");
        BubleSort.bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("***************************");
    }
}
