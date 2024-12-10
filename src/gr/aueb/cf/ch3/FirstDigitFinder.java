package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Βρίσκει το πρώτο αριστερά ψηφίο ενός ακεραίου.
 */

public class FirstDigitFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        int tempNum = 0;

        System.out.println("Enter an positive number:");
        inputNum = sc.nextInt();

        tempNum = inputNum;
        while (tempNum >= 10) {
            tempNum = tempNum / 10;  // tempNum = tempNum / 10;
        }

        System.out.println("The first digit of " + inputNum + " is " + tempNum);
    }


}
