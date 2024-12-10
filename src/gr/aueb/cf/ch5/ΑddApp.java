package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Υπολογίζει το άθροισμα δυο ακεραίων
 * με τη χρήση μεθόδων.
 */
public class ΑddApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int a = 10;
      int b = 5;
      int sum = 0;
      int sub = 0;

      System.out.println("Please enter two integers");
      a = sc.nextInt();
      b = sc.nextInt();


      sum = add(a, b);
      sub = sub(a, b);

      System.out.println(sum);
      System.out.println(sub);

    }

    /**
     * Adds two integers.
     * @param a the first integer.
     * @param b the second integer.
     * @return the sum of the two integers.
     */

    public static int add(int a,int b) {
      return a+b;

    }

    /**
     *
     * Subtracts two integers.
     *
     * @return
     */

    public static int sub(int a,int b) {
        return a-b;
    }
}
