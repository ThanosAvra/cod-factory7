package gr.aueb.cf.ch4;


import java.util.Scanner;

/**
 * Demo of switch / case
 */
public class SwitchCaseApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("Enter choice : ");
            System.out.println("1. One player game");
            System.out.println("2. Two player game");
            System.out.println("3. Team game");
            System.out.println("4. Quit");

            choice = sc.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Choice must be between 1 and 4");
                System.out.println("Try again");
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("One player game");
                    break;
                case 2:
                    System.out.println("Two player game");
                    break;
                case 3:
                    System.out.println("Team game");
                    break;
                case 4:
                    System.out.println("Quit");
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }

            }while (choice != 4) ;



    }
}
