package merge_sorting;

import java.util.Arrays;

import static merge_sorting.MergeSortingAlgorithm.mergeSort;

public class Main {

    public static void main(String args[]) {
        System.out.println("Original Array");

        int[] sortArr = new int[10];

        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = (int) Math.round((Math.random() * 30) - 15);
            System.out.print(sortArr[i] + " ");
        }

        System.out.println();

        System.out.println("Merge Sorting Array");

       int[] result = mergeSort(sortArr);

        for(int k = 0; k < result.length; k++){
            System.out.print(result[k] + " ");
        }
    }
}