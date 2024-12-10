package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δικαίωμα ψήφου σε ηλικίες > 18
 * Ελέγχει αν μια ηλικία έχει δικαίωμα
 * να ψηφίσει.
 */

public class VoteEligible {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isEligible = false;
        final int VOTING_AGE = 18;
        int age = 0;

        System.out.println("Enter your age ");
        age = sc.nextInt();

        isEligible = age >= VOTING_AGE;

        System.out.println("You are eligible " +  isEligible);




    }
}
