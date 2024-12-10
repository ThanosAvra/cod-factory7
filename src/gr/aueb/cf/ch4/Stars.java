package gr.aueb.cf.ch4;

/**
 * Prints different outputs of stars.
 */
public class Stars {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("*");
        }
        for (int i = 0; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

        //1st row: 1 star
        //2nd row: 2 stars
        //3rd row: 3 stars
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.println("*");
            }
            System.out.println();
        }

        // Decsending
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
