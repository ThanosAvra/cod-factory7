package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Show a menu at least once.
 */

public class MenuDoWhile {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Please select one of the following options:");
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Quit");
            choice = in.nextInt();

        }while(choice != 3);

        System.out.println("Do you want to continue? (Y/N)");

        System.out.println();

    }
}