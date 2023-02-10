package quick_sorting;

public class QuickSortingAlgorithm {

    public static void quickSorting(int[] sortArr, int low, int high){

        int middle = low + (high - low) / 2;
        int border = sortArr[middle];

        int i = low, j = high;
        while (i <= j) {
            while (sortArr[i] < border) i++;
            while (sortArr[j] > border) j--;
            if (i <= j) {
                int swap = sortArr[i];
                sortArr[i] = sortArr[j];
                sortArr[j] = swap;
                i++;
                j--;
            }
        }

        if (low < j){
            quickSorting(sortArr, low, j);
        }

        if (high > i){
            quickSorting(sortArr, i, high);
        }
    }

}
