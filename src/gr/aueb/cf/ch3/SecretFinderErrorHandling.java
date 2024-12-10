package gr.aueb.cf.ch3;


import java.util.Scanner;

public class SecretFinderErrorHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;
        boolean success = false;

        while (true) {
            System.out.print("Insert a num to guess the secret: ");
            num = sc.nextInt();

            if (num == SECRET) {
                System.out.println("Try again");
                continue;
            }

            System.out.println("Bingo");
                    break;
        }
    }
}