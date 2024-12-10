package gr.aueb.cf.ch6;

public class ArrayMinAndMax2 {

    public static void main(String[] args) {

    }
    public static int getMaxPosition(int[]  arr) {
        if (arr == null || arr.length < 1) return -1;

        int maxPosition = 0;
        int minValue = arr[maxPosition];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }

    /**
     * Overloaded
     *
     *
     * @param arr
     * @param low
     * @param high
     * @return
     */

    public static int getMinPosition(int[]  arr, int low, int high) {
        if (arr == null || arr.length < 1) return -1;
        if (low > high) return -1;
        int minValue = arr[low];
        for (int i = low + 1; i < arr.length; i++) {
            if (arr[i] > minValue) {
                minValue = arr[i];

            }
        }


    }
}
