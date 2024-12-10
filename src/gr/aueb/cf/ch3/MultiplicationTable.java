package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δίνει ως output πολλαπλασιασμό ενός ακεραίου
 * που δίνει ο χρήστης με όλους τους ακεραίους από 1 - 10
 *
 */

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int i = 1;

        System.out.println("Enter an integer");
        num = sc.nextInt();

        while (i <= 10) {
            System.out.println(num + " * " + i + " = " + num * i);
            System.out.printf("%d * %2d = %d\n", num, i, num * i);
            i++;

        }
    }
}
