package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Διαβάζει από τον χρήστη ένα ποσό σε Ευρώ
 * και μετατρέπει από Ευρώ σε USD και cents.
 * H ισοτιμία 99 cents = 1 Ευρώ.Εκτυπώνει το
 * αποτέλεσμα.
*/
public class EuroUsdConverter {

    public static void main(String[] args) {
        int inputsEuros = 0;
        int totalUsaCents = 0;
        int usaDollars = 0;
        int usaCents = 0;
        final int PARITY =99;
        Scanner in = new Scanner(System.in);

        //Εντολές
        System.out.print("Please insert an integer amount (EURO)");
        inputsEuros = in.nextInt();

        totalUsaCents = inputsEuros * PARITY;
        usaDollars = totalUsaCents / 100;
        usaCents = totalUsaCents % 100;
    }
}