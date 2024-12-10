package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Snowing if raining AND temp < 0
 *
 */
public class SnowingApp {
    public static void main(String[] args) {
        boolean isRaining = false;
        boolean isSnowing = false;
        Scanner in = new Scanner(System.in);
        int temp = 0;

        System.out.print("Please insert if it is raining: ");
        isRaining = in.nextBoolean();

        System.out.print("Please insert the temperature: ");
        temp = in.nextInt();

        //isSmoking
        isSnowing = isRaining && temp < 0;

        System.out.println("Is snowing: " + isSnowing);
    }
}
