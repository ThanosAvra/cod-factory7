package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Reads a char as a byte
 */
public class CharInApp {

    public static void main(String[] args)throws Exception {
        char ch = ' ';
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
//        ch = (char) System.in.read();
        ch = sc.next().charAt(0);

        System.out.printf("%c" + ch);
    }
}
