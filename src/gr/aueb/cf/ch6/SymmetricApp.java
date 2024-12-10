package gr.aueb.cf.ch6;

public class SymmetricApp {

    public static void main(String[] args) {

    }

    public static boolean isSymmetric(int[] arr) {

        for (int i = 0; j = arr.length - 1; i < j; j--, i++) {
            if (arr[i] != arr[j]) {
                isSymetric = false;
                break;
            }
        }

        return isSymmetric;
    }
    public static boolean isSymmetric(int[] arr) {

        boolean isSymmetric = true;
        int n = arr.length - 1;

        for (int i = 0; i < n/ 2; i++) {
            if (arr[i] != arr[n-i]) {
                isSymmetric = false;
                break;
            }
        }
        return isSymmetric;
    }
}
