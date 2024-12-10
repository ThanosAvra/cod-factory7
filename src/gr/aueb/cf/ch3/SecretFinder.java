package gr.aueb.cf.ch3;

import java.util.Scanner;

/**Υπάρχει ένα SECRET που είναι integer kai o
 * χρήστης με μία μόνο προσπάθεια θα προσπαθήσει
 * να τον βρει.
 */

public class SecretFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Insert a num to guess the secret:");
        num = sc.nextInt();

        if (num == SECRET) {
            System.out.println("Secret found!");
        } else {    //num != SECRET
            System.out.println("Failure!!");

        }
    }
}