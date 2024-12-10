package gr.aueb.cf.ch3;

import java.util.Scanner;

/**Υπολογίζει το άθροισμα των ψηφίων
 * ενός ακεραίου. Για παράδειγμα, το
 * άθροισμα των ψηφίων του 123 είναι 6.
 */

public class SumOfDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int inputNum = 0;
        int tempNum = 0;
        int rightDigit = 0;

        System.out.println("Enter a positive integer: ");
        inputNum = sc.nextInt();

        // toDo
        tempNum = inputNum;
        while (tempNum > 0) {
            rightDigit = tempNum % 10;
            sum = sum + rightDigit;  // sum = sum + rightDigit
            tempNum = tempNum / 10;  // tempNum = tempNum / 10;

        }


        System.out.println("The sum of the digits of " + inputNum + " is " + sum);
    }
}
