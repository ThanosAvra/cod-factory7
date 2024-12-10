package gr.aueb.cf.ch4;

/**
 * SpeciaL types of for.
 */

public class SpecialFor {
    public static void main(String[] args) {
        int count = 0;

        for (int i = 1;  i<= 1; i++) {
            System.out.println("Once");
        }
        for (int i = 1;  i<= 1; i++) {
            System.out.println("Two");
        }
        for (;;) {
            System.out.println("For ever");
            count++;
            if (count == 10) break;

        }
    }



}
