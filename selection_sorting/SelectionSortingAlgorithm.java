package selection_sorting;

public class SelectionSortingAlgorithm {

    public static void selectionSort() {

        System.out.println("Original Array");

        int[] sortArr = new int[10];

        for (int i = 0; i < sortArr.length; i++) {
            sortArr[i] = (int) Math.round((Math.random() * 30) - 15);
            System.out.print(sortArr[i] + " ");
        }

        System.out.println();

        for (int i = 0; i < sortArr.length; i++) {

            int min = sortArr[i];
            int minId = i;

            for (int j = i + 1; j < sortArr.length; j++) {

                if (sortArr[j] < min) {
                    min = sortArr[j];
                    minId = j;
                }

            }

            int temp = sortArr[i];
            sortArr[i] = min;
            sortArr[minId] = temp;
        }

        System.out.println("Selection Sorting Array");

        for(int k = 0; k < sortArr.length; k++){
            System.out.print(sortArr[k] + " ");
        }

    }
}
