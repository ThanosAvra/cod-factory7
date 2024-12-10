package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα των άρτιων από το 2
 * μέχρι ένα άρτιο που δίνει ο χρήστης.
 */

public class SumOfEvens {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        int sum = 0;
        int i = 2;

        System.out.println("Please insert upper limit");
        inputNum = sc.nextInt();

        // sum??
        while (i <= inputNum) {
         sum += i;
         i = i + 2;
        }

        System.out.println("The sum of even numbers up to " + inputNum + " is " + sum);
    }
}
