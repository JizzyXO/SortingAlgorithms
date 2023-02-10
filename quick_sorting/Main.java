package quick_sorting;

public class Main {
    public static void main(String[] args){
        System.out.println("Original Array");

        int[] sortArr = new int[10];

        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = (int) Math.round((Math.random() * 30) - 15);
            System.out.print(sortArr[i] + " ");
        }

        System.out.println();

        QuickSortingAlgorithm.quickSorting(sortArr, 0, sortArr.length - 1);

        System.out.println("Quick Sorting Array");

        for(int k = 0; k < sortArr.length; k++){
            System.out.print(sortArr[k] + " ");
        }
    }
}
