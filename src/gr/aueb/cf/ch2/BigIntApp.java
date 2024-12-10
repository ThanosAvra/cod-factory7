package gr.aueb.cf.ch2;

import java.math.BigInteger;

/**
 *
 * BigInteger class demo.
 */
public class BigIntApp  {
    // Declarations and Initializations
    public static void main(String[] args) {
        BigInteger bigNum1 = new BigInteger("1234567899876543219998");
        BigInteger bigNum2 = new BigInteger("2345678965555555558");
        BigInteger result;

        //Commands
        result = bigNum1.add(bigNum2);

//Printing the results
        System.out.printf("%,d" , result);

    }
}
