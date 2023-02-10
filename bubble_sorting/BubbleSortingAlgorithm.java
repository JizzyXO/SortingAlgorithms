package bubble_sorting;

public class BubbleSortingAlgorithm {

    public static void bubbleSorting(){
        System.out.println("Original Array");

        int[] sortArr = new int[10];

        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = (int) Math.round((Math.random() * 30) - 15);
            System.out.print(sortArr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                }
            }
        }

        System.out.println("Bubble Sorting Array");

        for(int i = 0; i < sortArr.length; i++){
            System.out.print(sortArr[i] + " ");
        }
    }

}
