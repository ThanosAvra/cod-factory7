package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Throughout demo of for.
 */

public class FlexibleFor {

    public static void main(String[] args) {
        int startVal = 0;
        int endVal = 0;
        int step = 0;
        Scanner sc = new Scanner(System.in);
        int interations = 0;


        System.out.println("Please enter start, end, step: ");
        startVal = sc.nextInt();
        endVal = sc.nextInt();
        step = sc.nextInt();

        for (int i = startVal; i <= endVal; i++) {
            interations++;
            System.out.println(i);
        }
        System.out.println("Interations: " + interations);
        System.out.println("Step: " + step);
    }

}
