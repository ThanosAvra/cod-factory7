package gr.aueb.cf.ch6;

public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {6, 3, 7, 4};
        int[] sorted = selectionSort(arr);

        for (int el : sorted) {
            System.out.println(el);
        }
    }

    public static void bubbleSort(int[] arr) {

        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap (arr, j, j+1)
                }
            }
            return arr;
        }
        public static void swap(int[] arr, int i, int j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

    }
}
